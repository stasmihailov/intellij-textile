package org.potniype4kin.textile.intentions;

import com.intellij.ide.util.PsiNavigationSupport;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

public class OpenGeneratedFileAction extends NotificationAction {
    private final Path filePath;

    public OpenGeneratedFileAction(Path filePath) {
        super("Open " + filePath.getFileName());
        this.filePath = filePath;
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent, @NotNull Notification notification) {
        Project project = anActionEvent.getProject();
        if (project == null) {
            throw new IllegalStateException("could not find project at which an html file was generated");
        }

        openGeneratedFile(project);
        notification.expire();
    }

    void openGeneratedFile(Project project) {
        VirtualFile virtualFile = VfsUtil.findFileByIoFile(filePath.toFile(), true);
        if (virtualFile == null) {
            throw new IllegalStateException("could not find generated html file in current project");
        }

        openInCurrentProject(virtualFile, project);
    }

    private void openInCurrentProject(VirtualFile virtualFile, Project project) {
        PsiNavigationSupport.getInstance().createNavigatable(project, virtualFile, -1).navigate(true);
    }

}
