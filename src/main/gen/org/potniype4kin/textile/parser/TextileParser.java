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
  // BOLD_TEXT_DELIM TEXT (space TEXT)* BOLD_TEXT_DELIM
  static boolean bold_text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bold_text")) return false;
    if (!nextTokenIs(b, BOLD_TEXT_DELIM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BOLD_TEXT_DELIM, TEXT);
    r = r && bold_text_2(b, l + 1);
    r = r && consumeToken(b, BOLD_TEXT_DELIM);
    exit_section_(b, m, null, r);
    return r;
  }

  // (space TEXT)*
  private static boolean bold_text_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bold_text_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!bold_text_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bold_text_2", c)) break;
    }
    return true;
  }

  // space TEXT
  private static boolean bold_text_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bold_text_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = space(b, l + 1);
    r = r && consumeToken(b, TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CHAPTER_BREAK
  static boolean chapter_break(PsiBuilder b, int l) {
    return consumeToken(b, CHAPTER_BREAK);
  }

  /* ********************************************************** */
  // code_start eol? (code_line eol?)* code_end
  static boolean code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code")) return false;
    if (!nextTokenIs(b, "", CODE_DEF, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_start(b, l + 1);
    r = r && code_1(b, l + 1);
    r = r && code_2(b, l + 1);
    r = r && code_end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol?
  private static boolean code_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_1")) return false;
    eol(b, l + 1);
    return true;
  }

  // (code_line eol?)*
  private static boolean code_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!code_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "code_2", c)) break;
    }
    return true;
  }

  // code_line eol?
  private static boolean code_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_line(b, l + 1);
    r = r && code_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol?
  private static boolean code_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_2_0_1")) return false;
    eol(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // space? CODE_END
  static boolean code_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_end")) return false;
    if (!nextTokenIs(b, "", CODE_END, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_end_0(b, l + 1);
    r = r && consumeToken(b, CODE_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // space?
  private static boolean code_end_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_end_0")) return false;
    space(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // INLINE_CODE_START space? CODE+ space? INLINE_CODE_END
  static boolean code_inline(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_inline")) return false;
    if (!nextTokenIs(b, INLINE_CODE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INLINE_CODE_START);
    r = r && code_inline_1(b, l + 1);
    r = r && code_inline_2(b, l + 1);
    r = r && code_inline_3(b, l + 1);
    r = r && consumeToken(b, INLINE_CODE_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // space?
  private static boolean code_inline_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_inline_1")) return false;
    space(b, l + 1);
    return true;
  }

  // CODE+
  private static boolean code_inline_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_inline_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CODE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, CODE)) break;
      if (!empty_element_parsed_guard_(b, "code_inline_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // space?
  private static boolean code_inline_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_inline_3")) return false;
    space(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // space? CODE+
  static boolean code_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_line")) return false;
    if (!nextTokenIs(b, "", CODE, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_line_0(b, l + 1);
    r = r && code_line_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // space?
  private static boolean code_line_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_line_0")) return false;
    space(b, l + 1);
    return true;
  }

  // CODE+
  private static boolean code_line_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_line_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CODE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, CODE)) break;
      if (!empty_element_parsed_guard_(b, "code_line_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // space? CODE_DEF (CODE_DELIM CODE_LANGUAGE)? CODE_DEF_END
  static boolean code_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_start")) return false;
    if (!nextTokenIs(b, "", CODE_DEF, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_start_0(b, l + 1);
    r = r && consumeToken(b, CODE_DEF);
    r = r && code_start_2(b, l + 1);
    r = r && consumeToken(b, CODE_DEF_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // space?
  private static boolean code_start_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_start_0")) return false;
    space(b, l + 1);
    return true;
  }

  // (CODE_DELIM CODE_LANGUAGE)?
  private static boolean code_start_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_start_2")) return false;
    code_start_2_0(b, l + 1);
    return true;
  }

  // CODE_DELIM CODE_LANGUAGE
  private static boolean code_start_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_start_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CODE_DELIM, CODE_LANGUAGE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // space? EOL
  static boolean eol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eol")) return false;
    if (!nextTokenIs(b, "", EOL, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = eol_0(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  // space?
  private static boolean eol_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eol_0")) return false;
    space(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // HEADER_START header_text
  static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    if (!nextTokenIs(b, HEADER_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEADER_START);
    r = r && header_text(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // HEADER_TEXT (space HEADER_TEXT)*
  static boolean header_text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_text")) return false;
    if (!nextTokenIs(b, HEADER_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEADER_TEXT);
    r = r && header_text_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (space HEADER_TEXT)*
  private static boolean header_text_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_text_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!header_text_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "header_text_1", c)) break;
    }
    return true;
  }

  // space HEADER_TEXT
  private static boolean header_text_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_text_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = space(b, l + 1);
    r = r && consumeToken(b, HEADER_TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // info_start+ eol? (info_text eol?)+ info_end
  static boolean info(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info")) return false;
    if (!nextTokenIs(b, "", INFO_START, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = info_0(b, l + 1);
    r = r && info_1(b, l + 1);
    r = r && info_2(b, l + 1);
    r = r && info_end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // info_start+
  private static boolean info_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = info_start(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!info_start(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "info_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // eol?
  private static boolean info_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_1")) return false;
    eol(b, l + 1);
    return true;
  }

  // (info_text eol?)+
  private static boolean info_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = info_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!info_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "info_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // info_text eol?
  private static boolean info_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = info_text(b, l + 1);
    r = r && info_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol?
  private static boolean info_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_2_0_1")) return false;
    eol(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // space? INFO_END
  static boolean info_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_end")) return false;
    if (!nextTokenIs(b, "", INFO_END, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = info_end_0(b, l + 1);
    r = r && consumeToken(b, INFO_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // space?
  private static boolean info_end_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_end_0")) return false;
    space(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // space? INFO_START+
  static boolean info_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_start")) return false;
    if (!nextTokenIs(b, "", INFO_START, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = info_start_0(b, l + 1);
    r = r && info_start_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // space?
  private static boolean info_start_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_start_0")) return false;
    space(b, l + 1);
    return true;
  }

  // INFO_START+
  private static boolean info_start_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_start_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INFO_START);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, INFO_START)) break;
      if (!empty_element_parsed_guard_(b, "info_start_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INFO_TEXT+
  static boolean info_text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "info_text")) return false;
    if (!nextTokenIs(b, INFO_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INFO_TEXT);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, INFO_TEXT)) break;
      if (!empty_element_parsed_guard_(b, "info_text", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ITALIC_TEXT_DELIM TEXT (space TEXT)* ITALIC_TEXT_DELIM
  static boolean italic_text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "italic_text")) return false;
    if (!nextTokenIs(b, ITALIC_TEXT_DELIM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ITALIC_TEXT_DELIM, TEXT);
    r = r && italic_text_2(b, l + 1);
    r = r && consumeToken(b, ITALIC_TEXT_DELIM);
    exit_section_(b, m, null, r);
    return r;
  }

  // (space TEXT)*
  private static boolean italic_text_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "italic_text_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!italic_text_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "italic_text_2", c)) break;
    }
    return true;
  }

  // space TEXT
  private static boolean italic_text_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "italic_text_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = space(b, l + 1);
    r = r && consumeToken(b, TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // header
  //     | list
  //     | numbered_list
  //     | code
  //     | code_inline
  //     | info
  //     | text
  //     | bold_text
  //     | italic_text
  //     | chapter_break
  //     | paragraph_break
  //     | signs
  //     | space
  //     | eol
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    r = header(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = numbered_list(b, l + 1);
    if (!r) r = code(b, l + 1);
    if (!r) r = code_inline(b, l + 1);
    if (!r) r = info(b, l + 1);
    if (!r) r = text(b, l + 1);
    if (!r) r = bold_text(b, l + 1);
    if (!r) r = italic_text(b, l + 1);
    if (!r) r = chapter_break(b, l + 1);
    if (!r) r = paragraph_break(b, l + 1);
    if (!r) r = signs(b, l + 1);
    if (!r) r = space(b, l + 1);
    if (!r) r = eol(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LIST_DELIM list_text
  static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, LIST_DELIM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIST_DELIM);
    r = r && list_text(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LIST_TEXT (space LIST_TEXT)*
  static boolean list_text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_text")) return false;
    if (!nextTokenIs(b, LIST_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIST_TEXT);
    r = r && list_text_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (space LIST_TEXT)*
  private static boolean list_text_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_text_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_text_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_text_1", c)) break;
    }
    return true;
  }

  // space LIST_TEXT
  private static boolean list_text_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_text_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = space(b, l + 1);
    r = r && consumeToken(b, LIST_TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ORDERED_LIST_DELIM list_text
  static boolean numbered_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numbered_list")) return false;
    if (!nextTokenIs(b, ORDERED_LIST_DELIM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ORDERED_LIST_DELIM);
    r = r && list_text(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PARAGRAPH_BREAK
  static boolean paragraph_break(PsiBuilder b, int l) {
    return consumeToken(b, PARAGRAPH_BREAK);
  }

  /* ********************************************************** */
  // SIGN_WARNING | SIGN_PLUS | SIGN_MINUS | SIGN_OK | SIGN_QUESTION
  static boolean signs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signs")) return false;
    boolean r;
    r = consumeToken(b, SIGN_WARNING);
    if (!r) r = consumeToken(b, SIGN_PLUS);
    if (!r) r = consumeToken(b, SIGN_MINUS);
    if (!r) r = consumeToken(b, SIGN_OK);
    if (!r) r = consumeToken(b, SIGN_QUESTION);
    return r;
  }

  /* ********************************************************** */
  // SPACE
  static boolean space(PsiBuilder b, int l) {
    return consumeToken(b, SPACE);
  }

  /* ********************************************************** */
  // TEXT (space TEXT)*
  static boolean text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "text")) return false;
    if (!nextTokenIs(b, TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXT);
    r = r && text_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (space TEXT)*
  private static boolean text_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "text_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "text_1", c)) break;
    }
    return true;
  }

  // space TEXT
  private static boolean text_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "text_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = space(b, l + 1);
    r = r && consumeToken(b, TEXT);
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
