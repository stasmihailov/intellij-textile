package org.potniype4kin.textile.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.potniype4kin.textile.TextileFileType;
import org.potniype4kin.textile.TextileLanguageDefinitions;

public class TextileFile extends PsiFileBase {
    protected TextileFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TextileLanguageDefinitions.LANGUAGE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TextileFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Textile File";
    }
}
