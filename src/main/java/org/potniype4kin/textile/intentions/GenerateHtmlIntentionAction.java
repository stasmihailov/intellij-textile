package org.potniype4kin.textile.intentions;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.codeInsight.intention.PsiElementBaseIntentionAction;
import com.intellij.ide.util.PsiNavigationSupport;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationAction;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import net.java.textilej.parser.MarkupParser;
import net.java.textilej.parser.markup.confluence.ConfluenceDialect;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.util.Collections.singletonList;

public class GenerateHtmlIntentionAction extends PsiElementBaseIntentionAction implements IntentionAction {
    private static final NotificationGroup CODE_GENERATION_LOGS = new NotificationGroup("Code Generation Logs", NotificationDisplayType.BALLOON, true);

    @Override
    public void invoke(@NotNull Project project, Editor editor, @NotNull PsiElement psiElement) throws IncorrectOperationException {
        Path textileFilePath = Paths.get(psiElement.getContainingFile().getVirtualFile().getPath());
        File htmlFile = generateHtmlFile(textileFilePath);

        onHtmlFileCreated(project, htmlFile);
    }

    private void onHtmlFileCreated(Project project, File htmlFile) {
        Path filePath = htmlFile.toPath();

        Notification notification = notifyHtmlGenerated(filePath);
        notification.notify(project);
    }

    @NotNull
    private Notification notifyHtmlGenerated(Path filePath) {
        Notification notification = CODE_GENERATION_LOGS.createNotification("Generated HTML file", MessageType.INFO);
        notification.addAction(new OpenGeneratedFileAction(filePath));

        return notification;
    }


    File generateHtmlFile(Path textileFilePathStr) {
        File textileFile = textileFilePathStr.toFile();
        if (!textileFile.exists()) {
            throw new IllegalStateException("could not find file " + textileFilePathStr);
        }

        String sourceTextile = readFile(textileFile);
        File targetHtmlFile = createAdjacentHtmlFile(textileFile);

        String prettyHtml = convertTextileToHtml(sourceTextile);
        try {
            Files.write(targetHtmlFile.toPath(), singletonList(prettyHtml));
        } catch (IOException e) {
            throw new IllegalStateException("could not write html to " + targetHtmlFile.getName());
        }

        return targetHtmlFile;
    }

    private String convertTextileToHtml(String sourceTextile) {
        MarkupParser parser = new MarkupParser(new ConfluenceDialect());
        String html = parser.parseToHtml(sourceTextile);
        return Jsoup.parse(html).outerHtml();
    }

    @NotNull
    private File createAdjacentHtmlFile(File textileFile) {
        File parentDir = textileFile.getParentFile();
        if (!parentDir.exists()) {
            throw new IllegalStateException("could not get parent directory of file " + textileFile.getPath());
        }

        File targetHtmlFile;
        try {
            targetHtmlFile = Paths.get(parentDir.getPath(), withoutExtension(textileFile.getName()) + ".html").toFile();
            if (targetHtmlFile.exists()) {
                targetHtmlFile.delete();
            }
            targetHtmlFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return targetHtmlFile;
    }

    @NotNull
    private String readFile(File textileFile) {
        String sourceTextile;
        try {
            sourceTextile = String.join("\n", Files.readAllLines(textileFile.toPath()));
        } catch (IOException e) {
            throw new IllegalStateException("could not read file " + textileFile.getPath());
        }
        return sourceTextile;
    }

    private String withoutExtension(String file) {
        return Arrays.stream(file.split("\\."))
                .filter(part -> part.length() > 0)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("could not remove extension from file name " + file));
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, @NotNull PsiElement psiElement) {
        return true;
    }

    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getFamilyName() {
        return "ConditionalOperatorIntention";
    }

    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getText() {
        return "Generate HTML from this file";
    }
}
