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
PARAGRAPH_BREAK={CRLF}
EOL=[^\r\n]+
LINE_BREAK={SPACE}*{CRLF}

HEADER_PREFIX="h"
HEADER_LEVEL=[1-6]
HEADER_SUFFIX="."
HEADER_DEFINITION={HEADER_PREFIX}{HEADER_LEVEL}{HEADER_SUFFIX}{SPACE}
LIST_DELIM=[-*]
LIST_DEFINITION={LIST_DELIM}+{SPACE}
CODE_START_TOKEN="{code"
CODE_DELIM=":"
CODE_START_TOKEN_CLOSE="}"
CODE_END_TOKEN="{code}"
INFO_START_TOKEN="{info"
INFO_START_TOKEN_CLOSE="}"
INFO_END_TOKEN="{info}"
SIGN_WARNING="(!)"
SIGN_PLUS="(+)"
SIGN_MINUS="(-)"
SIGN_OK="(/)"
SIGN_QUESTION="(?)"

%state header
%state list
%state code_def
%state code_delim
%state code
%state info_start
%state info

%%

<YYINITIAL> {
    ^{CHAPTER_BREAK}$ {
        return TextileType.CHAPTER_BREAK;
    }
    ^{PARAGRAPH_BREAK} {
        return TextileType.PARAGRAPH_BREAK;
    }
    {LINE_BREAK} {
        return TextileType.EOL;
    }
    ^{HEADER_DEFINITION} {
        yybegin(header);
        return TextileType.HEADER_START;
    }
    ^{LIST_DEFINITION} {
        yybegin(list);
        return TextileType.LIST_DELIM;
    }
    {CODE_START_TOKEN} {
        yybegin(code_def);
        return TextileType.CODE_DEF;
    }
    {INFO_START_TOKEN} {
        yybegin(info_start);
        return TextileType.INFO_START;
    }
    {SIGN_WARNING} {
        return TextileType.SIGN_WARNING;
    }
    {SIGN_PLUS} {
        return TextileType.SIGN_PLUS;
    }
    {SIGN_MINUS} {
        return TextileType.SIGN_MINUS;
    }
    {SIGN_OK} {
        return TextileType.SIGN_OK;
    }
    {SIGN_QUESTION} {
        return TextileType.SIGN_QUESTION;
    }
    [^] {
        return TextileType.TEXT;
    }
}
<header> {
    {LINE_BREAK} {
        yybegin(YYINITIAL);
        return TextileType.EOL;
    }
    {SIGN_WARNING} {
        return TextileType.SIGN_WARNING;
    }
    {SIGN_PLUS} {
        return TextileType.SIGN_PLUS;
    }
    {SIGN_MINUS} {
        return TextileType.SIGN_MINUS;
    }
    {SIGN_OK} {
        return TextileType.SIGN_OK;
    }
    {SIGN_QUESTION} {
        return TextileType.SIGN_QUESTION;
    }
    [^] {
        return TextileType.HEADER_TEXT;
    }
}
<list> {
    {LINE_BREAK} {
        yybegin(YYINITIAL);
        return TextileType.EOL;
    }
    {SIGN_WARNING} {
        return TextileType.SIGN_WARNING;
    }
    {SIGN_PLUS} {
        return TextileType.SIGN_PLUS;
    }
    {SIGN_MINUS} {
        return TextileType.SIGN_MINUS;
    }
    {SIGN_OK} {
        return TextileType.SIGN_OK;
    }
    {SIGN_QUESTION} {
        return TextileType.SIGN_QUESTION;
    }
    [^] {
        return TextileType.LIST_TEXT;
    }
}
<code_def> {
    {CODE_DELIM} {
        yybegin(code_delim);
        return TextileType.CODE_DELIM;
    }
    {CODE_START_TOKEN_CLOSE} {
        return TextileType.CODE_DEF_END;
    }
    {LINE_BREAK} {
        yybegin(code);
        return TextileType.EOL;
    }
}
<code_delim> {
    .+ / {CODE_START_TOKEN_CLOSE} {
        return TextileType.CODE_LANGUAGE;
    }
    {CODE_START_TOKEN_CLOSE} {
        return TextileType.CODE_DEF_END;
    }

    {LINE_BREAK} {
        yybegin(code);
        return TextileType.EOL;
    }
    [^] {
        return TokenType.BAD_CHARACTER;
    }
}
<code> {
    {LINE_BREAK} {
        return TextileType.EOL;
    }
    {CODE_END_TOKEN} {
        yybegin(YYINITIAL);
        return TextileType.CODE_DEF_END;
    }
    [^] {
        return TextileType.CODE;
    }
}
<info_start> {
    :\w+ {
        // get info title, if present
        return TextileType.INFO_START;
    }
    {INFO_START_TOKEN_CLOSE} {
        return TextileType.INFO_START;
    }
    {LINE_BREAK} {
        yybegin(info);
        return TextileType.EOL;
    }
}
<info> {
    {LINE_BREAK} {
        return TextileType.EOL;
    }
    {INFO_END_TOKEN} {
        yybegin(YYINITIAL);
        return TextileType.INFO_END;
    }
    {SIGN_WARNING} {
        return TextileType.SIGN_WARNING;
    }
    {SIGN_PLUS} {
        return TextileType.SIGN_PLUS;
    }
    {SIGN_MINUS} {
        return TextileType.SIGN_MINUS;
    }
    {SIGN_OK} {
        return TextileType.SIGN_OK;
    }
    {SIGN_QUESTION} {
        return TextileType.SIGN_QUESTION;
    }
    [^] {
        return TextileType.INFO;
    }
}
[^] {
}