package org.potniype4kin.textile.language;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class TextileLexerAdapter extends FlexAdapter {
    public TextileLexerAdapter() {
        super(new TextileLexer((Reader) null));
    }
}
