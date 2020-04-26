package org.potniype4kin.textile;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TextileFileType extends LanguageFileType {
    public static final TextileFileType INSTANCE = new TextileFileType();

    private TextileFileType() {
        super(TextileLanguageDefinitions.LANGUAGE);
    }

    public static class Factory extends FileTypeFactory {
        @Override
        public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
            fileTypeConsumer.consume(TextileFileType.INSTANCE);
        }
    }

    @NotNull
    @Override
    public String getName() {
        return "Textile Markup";
    }

    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getDescription() {
        return "Markup language, most prominently used by confluence";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "textile";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return TextileLanguageDefinitions.ICON;
    }
}
