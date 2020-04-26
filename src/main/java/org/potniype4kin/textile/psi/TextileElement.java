package org.potniype4kin.textile.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.potniype4kin.textile.TextileLanguageDefinitions;

public class TextileElement extends IElementType {
    public TextileElement(@NotNull String debugName) {
        super(debugName, TextileLanguageDefinitions.LANGUAGE);
    }

    @Override
    public String toString() {
        return "psi.TextileElement." + super.toString();
    }
}
