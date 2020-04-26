import com.intellij.lang.Language;
import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

class PropertiesLanguageDefinitions {
    private static final class PropertiesLanguage extends Language {
        protected PropertiesLanguage() {
            super("PropertiesLanguage");
        }
    }

    static final Language LANGUAGE = new PropertiesLanguage();
    static final Icon ICON = IconLoader.getIcon("textile-lang-icon.png");
}
