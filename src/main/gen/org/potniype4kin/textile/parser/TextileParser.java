// This is a generated file. Not intended for manual editing.
package org.potniype4kin.textile.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.potniype4kin.textile.psi.TextileType.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TextileParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return textileFile(b, l + 1);
  }

  /* ********************************************************** */
  // CODE_START+ CODE* CODE_END
  static boolean code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code")) return false;
    if (!nextTokenIs(b, CODE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_0(b, l + 1);
    r = r && code_1(b, l + 1);
    r = r && consumeToken(b, CODE_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // CODE_START+
  private static boolean code_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CODE_START);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, CODE_START)) break;
      if (!empty_element_parsed_guard_(b, "code_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // CODE*
  private static boolean code_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, CODE)) break;
      if (!empty_element_parsed_guard_(b, "code_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // HEADER_START HEADER_TEXT EOL
  static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    if (!nextTokenIs(b, HEADER_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HEADER_START, HEADER_TEXT, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INFO_START+ INFO* INFO_END
  static boolean info(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info")) return false;
    if (!nextTokenIs(b, INFO_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = info_0(b, l + 1);
    r = r && info_1(b, l + 1);
    r = r && consumeToken(b, INFO_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // INFO_START+
  private static boolean info_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INFO_START);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, INFO_START)) break;
      if (!empty_element_parsed_guard_(b, "info_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // INFO*
  private static boolean info_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, INFO)) break;
      if (!empty_element_parsed_guard_(b, "info_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // header|list|code|info|TEXT|CHAPTER_BREAK|PARAGRAPH_BREAK
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    r = header(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = code(b, l + 1);
    if (!r) r = info(b, l + 1);
    if (!r) r = consumeToken(b, TEXT);
    if (!r) r = consumeToken(b, CHAPTER_BREAK);
    if (!r) r = consumeToken(b, PARAGRAPH_BREAK);
    return r;
  }

  /* ********************************************************** */
  // LIST_DELIM (LIST_TEXT EOL)+
  static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, LIST_DELIM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIST_DELIM);
    r = r && list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LIST_TEXT EOL)+
  private static boolean list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LIST_TEXT EOL
  private static boolean list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LIST_TEXT, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item*
  static boolean textileFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textileFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "textileFile", c)) break;
    }
    return true;
  }

}
