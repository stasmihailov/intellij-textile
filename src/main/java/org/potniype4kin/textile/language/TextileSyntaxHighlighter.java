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

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.BLOCK_COMMENT;
import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.DOC_COMMENT_MARKUP;
import static com.intellij.openapi.editor.colors.TextAttributesKey.find;

public class TextileSyntaxHighlighter extends SyntaxHighlighterBase {
    private final Map<IElementType, Supplier<TextAttributesKey[]>> textKeysByElementType;

    public TextileSyntaxHighlighter() {
        textKeysByElementType = new HashMap<>();
        textKeysByElementType.put(TextileType.HEADER_START, () -> pack(headerStart()));
        textKeysByElementType.put(TextileType.HEADER_TEXT, () -> pack(headerText()));
        textKeysByElementType.put(TextileType.LIST_DELIM, () -> pack(listDelim()));
        textKeysByElementType.put(TextileType.CODE_DEF, () -> pack(code()));
        textKeysByElementType.put(TextileType.CODE_DEF_END, () -> pack(code()));
        textKeysByElementType.put(TextileType.CODE_DELIM, () -> pack(code()));
        textKeysByElementType.put(TextileType.CODE, () -> pack(code()));
        textKeysByElementType.put(TextileType.CODE_END, () -> pack(code()));
        textKeysByElementType.put(TextileType.CHAPTER_BREAK, () -> pack(BLOCK_COMMENT));
        textKeysByElementType.put(TextileType.INFO_START, () -> pack(info()));
        textKeysByElementType.put(TextileType.INFO, () -> pack(info()));
        textKeysByElementType.put(TextileType.INFO_END, () -> pack(info()));
        textKeysByElementType.put(TextileType.SIGN_WARNING, () -> pack(find("TEXTILE_SIGN_WARNING")));
        textKeysByElementType.put(TextileType.SIGN_PLUS, () -> pack(find("TEXTILE_SIGN_PLUS")));
        textKeysByElementType.put(TextileType.SIGN_MINUS, () -> pack(find("TEXTILE_SIGN_MINUS")));
        textKeysByElementType.put(TextileType.SIGN_OK, () -> pack(find("TEXTILE_SIGN_OK")));
        textKeysByElementType.put(TextileType.SIGN_QUESTION, () -> pack(find("TEXTILE_SIGN_QUESTION")));
    }

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
        return textKeysByElementType.getOrDefault(elementType, () -> TextAttributesKey.EMPTY_ARRAY).get();
    }

    private TextAttributesKey headerStart() {
        return find("TEXTILE_HEADER_START");
    }

    private TextAttributesKey headerText() {
        return find("TEXTILE_HEADER_TEXT");
    }

    private TextAttributesKey listDelim() {
        return find("TEXTILE_CHAPTER_BREAK");
    }

    private TextAttributesKey info() {
        return find("TEXTILE_INFO_BLOCK");
    }

    private TextAttributesKey code() {
        return DOC_COMMENT_MARKUP;
    }
}
