import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PropertiesFileType extends LanguageFileType {
    private static final PropertiesFileType INSTANCE = new PropertiesFileType();

    private PropertiesFileType() {
        super(PropertiesLanguageDefinitions.LANGUAGE);
    }

    public static class Factory extends FileTypeFactory {
        @Override
        public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
            fileTypeConsumer.consume(PropertiesFileType.INSTANCE);
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
        return PropertiesLanguageDefinitions.ICON;
    }
}
