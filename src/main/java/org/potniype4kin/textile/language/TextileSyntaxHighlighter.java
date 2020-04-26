package org.potniype4kin.textile.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.potniype4kin.textile.psi.TextileType;

import java.awt.*;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.BLOCK_COMMENT;

public class TextileSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new TextileLexerAdapter();
    }

    public static class Factory extends SyntaxHighlighterFactory {
        @NotNull
        @Override
        public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
            return new TextileSyntaxHighlighter();
        }
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType elementType) {
        if (TextileType.HEADER_START.equals(elementType)) {
            return pack(headerStart());
        } else if (TextileType.LIST_DELIM.equals(elementType)) {
            return pack(listDelim());
        } else if (TextileType.CODE_START.equals(elementType)) {
            return pack(code());
        } else if (TextileType.CODE.equals(elementType)) {
            return pack(code());
        } else if (TextileType.CODE_END.equals(elementType)) {
            return pack(code());
        } else if (TextileType.CHAPTER_BREAK.equals(elementType)) {
            return pack(BLOCK_COMMENT);
        } else {
            return EMPTY;
        }
    }

    @NotNull
    private TextAttributesKey headerStart() {
        TextAttributesKey chapterBreakKey = TextAttributesKey.find("TEXTILE_HEADER_START");

        TextAttributes attrs = chapterBreakKey.getDefaultAttributes();
        attrs.setForegroundColor(Color.MAGENTA);
        attrs.setFontType(Font.BOLD);

        return chapterBreakKey;
    }

    private TextAttributesKey listDelim() {
        TextAttributesKey chapterBreakKey = TextAttributesKey.find("TEXTILE_CHAPTER_BREAK");

        TextAttributes attrs = chapterBreakKey.getDefaultAttributes();
        attrs.setForegroundColor(Color.BLUE);
        attrs.setFontType(Font.BOLD);

        return chapterBreakKey;
    }

    private TextAttributesKey code() {
        TextAttributesKey chapterBreakKey = TextAttributesKey.find("TEXTILE_CODE");

        Color lightGreen = new Color(237, 252, 237);

        TextAttributes attrs = chapterBreakKey.getDefaultAttributes();
        attrs.setBackgroundColor(lightGreen);

        return chapterBreakKey;
    }
}
