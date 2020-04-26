package org.potniype4kin.textile.language;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class LexerAdapter extends FlexAdapter {
    public LexerAdapter() {
        super(new TextileLexer((Reader) null));
    }
}
