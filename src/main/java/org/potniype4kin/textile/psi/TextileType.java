package org.potniype4kin.textile.psi;

import com.intellij.psi.tree.IElementType;

public interface TextileType {
    IElementType HEADER_START = new TextileElement("HEADER_START");
    IElementType HEADER_TEXT = new TextileElement("HEADER_TEXT");
    IElementType LIST_DELIM = new TextileElement("LIST_DELIM");
    IElementType ORDERED_LIST_DELIM = new TextileElement("ORDERED_LIST_DELIM");
    IElementType CODE_DEF = new TextileElement("CODE_DEF");
    IElementType CODE_LANGUAGE = new TextileElement("CODE_LANGUAGE");
    IElementType CODE_DEF_END = new TextileElement("CODE_DEF_END");
    IElementType CODE_DELIM = new TextileElement("CODE_DELIM");
    IElementType CODE = new TextileElement("CODE");
    IElementType INLINE_CODE_END = new TextileElement("INLINE_CODE_END");
    IElementType INLINE_CODE_START = new TextileElement("INLINE_CODE_START");
    IElementType CODE_END = new TextileElement("CODE_END");
    IElementType CHAPTER_BREAK = new TextileElement("CHAPTER_BREAK");
    IElementType INFO_START = new TextileElement("INFO_START");
    IElementType INFO_TEXT = new TextileElement("INFO_TEXT");
    IElementType INFO_END = new TextileElement("INFO_END");
    IElementType SIGN_WARNING = new TextileElement("SIGN_WARNING");
    IElementType SIGN_PLUS = new TextileElement("SIGN_PLUS");
    IElementType SIGN_MINUS = new TextileElement("SIGN_MINUS");
    IElementType SIGN_OK = new TextileElement("SIGN_OK");
    IElementType SIGN_QUESTION = new TextileElement("SIGN_QUESTION");
}
