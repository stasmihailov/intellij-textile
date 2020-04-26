package org.potniype4kin.textile.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import org.potniype4kin.textile.psi.TextileType;

%%


%class TextileLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=[\r\n]
SPACE=[\ \t\f]

HEADER_PREFIX="h"
HEADER_LEVEL=[1-6]
HEADER_SUFFIX="."
HEADER_DEFINITION={HEADER_PREFIX}{HEADER_LEVEL}{HEADER_SUFFIX}{SPACE}
LIST_DELIM=[-*]
LIST_DEFINITION={LIST_DELIM}{SPACE}
CHAPTER_BREAK="-"{4}
TEXT=[^\r\n\s][^\r\n]+[^\r\n\s]
PARAGRAPH_BREAK={CRLF}{SPACE}*{CRLF}

%%

{CHAPTER_BREAK} {
    return TextileType.CHAPTER_BREAK;
}
{PARAGRAPH_BREAK} {
    return TokenType.WHITE_SPACE;
}
({CRLF}|{SPACE})+ {
    return TokenType.WHITE_SPACE;
}
({HEADER_DEFINITION}) {
    return TextileType.HEADER_START;
}
{LIST_DELIM}{SPACE} {
    return TextileType.LIST_DELIM;
}
{TEXT} {
    return TextileType.TEXT;
}
[^] {
    return TokenType.DUMMY_HOLDER;
}