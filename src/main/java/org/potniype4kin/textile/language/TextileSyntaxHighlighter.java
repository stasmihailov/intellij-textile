package org.potniype4kin.textile.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.potniype4kin.textile.psi.TextileType;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.BLOCK_COMMENT;
import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.DOC_COMMENT_MARKUP;

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
        } else if (TextileType.INFO_START.equals(elementType)) {
            return pack(info());
        } else if (TextileType.INFO.equals(elementType)) {
            return pack(info());
        } else if (TextileType.INFO_END.equals(elementType)) {
            return pack(info());
        } else {
            return EMPTY;
        }
    }

    @NotNull
    private TextAttributesKey headerStart() {
        return TextAttributesKey.find("TEXTILE_HEADER_START");
    }

    private TextAttributesKey listDelim() {
        return TextAttributesKey.find("TEXTILE_CHAPTER_BREAK");
    }

    private TextAttributesKey info() {
        return TextAttributesKey.find("TEXTILE_INFO_BLOCK");
    }

    private TextAttributesKey code() {
        return DOC_COMMENT_MARKUP;
    }
}
