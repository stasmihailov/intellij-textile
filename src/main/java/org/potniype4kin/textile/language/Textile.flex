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

CHAPTER_BREAK="-"{4}
PARAGRAPH_BREAK=({CRLF}{SPACE}*)+{CRLF}
LINE_BREAK={SPACE}*{CRLF}

HEADER_PREFIX="h"
HEADER_LEVEL=[1-6]
HEADER_SUFFIX="."
HEADER_DEFINITION={HEADER_PREFIX}{HEADER_LEVEL}{HEADER_SUFFIX}{SPACE}
LIST_DELIM=[-*]
LIST_DEFINITION={LIST_DELIM}+{SPACE}
CODE_START_TOKEN="{code"
CODE_START_TOKEN_CLOSE="}"
CODE_END_TOKEN="{code}"

%state header
%state list
%state code_start
%state code

%%

{CHAPTER_BREAK} {
    return TextileType.CHAPTER_BREAK;
}
{PARAGRAPH_BREAK} {
    return TextileType.PARAGRAPH_BREAK;
}
<YYINITIAL> {LINE_BREAK} {
    return TokenType.WHITE_SPACE;
}
^{HEADER_DEFINITION} {
    yybegin(header);
    return TextileType.HEADER_START;
}
<header> {LINE_BREAK} {
    yybegin(YYINITIAL);
    return TextileType.TEXT;
}
^{LIST_DEFINITION} {
    yybegin(list);
    return TextileType.LIST_DELIM;
}
<list> {LINE_BREAK} {
    yybegin(YYINITIAL);
    return TextileType.TEXT;
}
^{CODE_START_TOKEN} {
    yybegin(code_start);
    return TextileType.CODE_START;
}
<code_start> :\w+ {
    String codeLanguage = yytext().toString().substring(1);
    return TextileType.CODE_START;
}
<code_start> {CODE_START_TOKEN_CLOSE} {
    return TextileType.CODE_START;
}
<code_start> {LINE_BREAK} {
    yybegin(code);
    return TokenType.WHITE_SPACE;
}
<code> {LINE_BREAK} {
    return TextileType.CODE;
}
<code> {CODE_END_TOKEN} {
    yybegin(YYINITIAL);
    return TextileType.CODE_END;
}
[^] {
}