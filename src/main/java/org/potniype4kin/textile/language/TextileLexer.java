package org.potniype4kin.textile.language;

import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.text.CharSequenceReader;
import net.java.textilej.parser.MarkupParser;
import net.java.textilej.parser.markup.confluence.ConfluenceDialect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class TextileLexer extends Lexer {
    private CharSequence buffer = "";
    private Queue<IElementType> tokens = new LinkedList<>();
    private int startOffset = 0;
    private int endOffset = 0;
    private int initialState = 0;

    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
        this.buffer = buffer;
        this.tokens = parseTokens(buffer);
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.initialState = initialState;
    }

    private Queue<IElementType> parseTokens(@NotNull CharSequence buffer) {
        IntellijTokenDocumentBuilder documentBuilder = new IntellijTokenDocumentBuilder();
        MarkupParser parser = new MarkupParser(new ConfluenceDialect(), documentBuilder);
        try {
            parser.parse(new CharSequenceReader(buffer), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return documentBuilder.getTokens();
    }

    @Override
    public int getState() {
        return initialState;
    }

    @Nullable
    @Override
    public IElementType getTokenType() {
        return tokens.peek();
    }

    @Override
    public int getTokenStart() {
        return startOffset;
    }

    @Override
    public int getTokenEnd() {
        return endOffset;
    }

    @Override
    public void advance() {
        tokens.poll();
    }

    @NotNull
    @Override
    public LexerPosition getCurrentPosition() {
        return new LexerPosition() {
            @Override
            public int getOffset() {
                return startOffset;
            }

            @Override
            public int getState() {
                return endOffset;
            }
        };
    }

    @Override
    public void restore(@NotNull LexerPosition position) {
    }

    @NotNull
    @Override
    public CharSequence getBufferSequence() {
        return buffer;
    }

    @Override
    public int getBufferEnd() {
        return endOffset;
    }
}
