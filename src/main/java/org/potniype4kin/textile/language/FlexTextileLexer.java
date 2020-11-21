package org.potniype4kin.textile.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import java.io.IOException;

public class FlexTextileLexer implements FlexLexer {
    private final TextileLexer textileLexer;

    public FlexTextileLexer(TextileLexer textileLexer) {
        this.textileLexer = textileLexer;
    }

    @Override
    public void yybegin(int state) {
    }

    @Override
    public int yystate() {
        return 0;
    }

    @Override
    public int getTokenStart() {
        return textileLexer.getTokenStart();
    }

    @Override
    public int getTokenEnd() {
        return textileLexer.getTokenEnd();
    }

    @Override
    public IElementType advance() throws IOException {
        textileLexer.advance();
        return textileLexer.getTokenType();
    }

    @Override
    public void reset(CharSequence buf, int start, int end, int initialState) {
        textileLexer.advance();
    }
}
