package org.potniype4kin.textile.conversion;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.codeInsight.intention.PsiElementBaseIntentionAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import net.java.textilej.parser.MarkupParser;
import net.java.textilej.parser.builder.HtmlDocumentBuilder;
import net.java.textilej.parser.markup.textile.TextileDialect;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GenerateHtmlIntentionAction extends PsiElementBaseIntentionAction implements IntentionAction {
    @Override
    public void invoke(@NotNull Project project, Editor editor, @NotNull PsiElement psiElement) throws IncorrectOperationException {
        PsiFile file = psiElement.getContainingFile();
        PsiFile targetHtmlFile = file.getParent().createFile(file.getName() + ".html");

        PrintWriter output;
        try {
            output = new PrintWriter(targetHtmlFile.getName());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        HtmlDocumentBuilder documentBuilder = new HtmlDocumentBuilder(output);
        documentBuilder.setEmitAsDocument(true);

        String sourceTextile = file.getText();

        MarkupParser parser = new MarkupParser(new TextileDialect());
        parser.setBuilder(documentBuilder);
        parser.parse(sourceTextile);
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
