package org.potniype4kin.textile.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.potniype4kin.textile.TextileLanguageDefinitions;
import org.potniype4kin.textile.parser.TextileParser;
import org.potniype4kin.textile.psi.TextileFile;

public class TextileParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(TextileLanguageDefinitions.LANGUAGE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new TextileLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new TextileParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode astNode) {
        return astNode.getPsi();
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new TextileFile(fileViewProvider);
    }
}
