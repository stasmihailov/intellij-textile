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

HEADER_PREFIX='h'
HEADER_LEVEL=[1-6]
HEADER_SUFFIX='.'
LIST_DELIM=[-*]
TEXT=[^\r\n]+
PARAGRAPH_BREAK={CRLF}{SPACE}*{CRLF}

%state HEADER
%state LIST

%%

<YYINITIAL> ({CRLF}|{SPACE})+ {
    return TokenType.WHITE_SPACE;
}
<YYINITIAL> ^{HEADER_PREFIX}{HEADER_LEVEL}{HEADER_SUFFIX}{SPACE} {
    yybegin(HEADER);
    return TextileType.HEADER_START;
}
<HEADER> {PARAGRAPH_BREAK} {
    yybegin(YYINITIAL);
    return TextileType.TEXT;
}
<YYINITIAL> ^{LIST_DELIM}{SPACE} {
    yybegin(LIST);
    return TextileType.LIST_DELIM;
}
<LIST> {PARAGRAPH_BREAK} {
    yybegin(YYINITIAL);
    return TextileType.TEXT;
}
<YYINITIAL> {TEXT} {
    return TextileType.TEXT;
}
<HEADER> {TEXT} {
    return TextileType.TEXT;
}
<LIST> {TEXT} {
    return TextileType.TEXT;
}
[^] {
    return TokenType.DUMMY_HOLDER;
}