import com.intellij.lang.Language;
import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

class TextileLanguageDefinitions {
    private static final class TextileLanguage extends Language {
        protected TextileLanguage() {
            super("Textile");
        }
    }

    static final Language LANGUAGE = new TextileLanguage();
    static final Icon ICON = IconLoader.getIcon("/icons/textile-lang-icon.png");
}
