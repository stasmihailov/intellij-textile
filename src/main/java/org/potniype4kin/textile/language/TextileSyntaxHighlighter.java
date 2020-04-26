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

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.KEYWORD;
import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.STATIC_FIELD;

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
            return pack(STATIC_FIELD);
        } else if (TextileType.LIST_DELIM.equals(elementType)) {
            return pack(KEYWORD);
        } else if (TextileType.CHAPTER_BREAK.equals(elementType)) {
            return pack(KEYWORD);
        } else {
            return EMPTY;
        }
    }
}
