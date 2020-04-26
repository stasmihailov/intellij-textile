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
  // HEADER_START TEXT
  static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    if (!nextTokenIs(b, HEADER_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HEADER_START, TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // header|list|TEXT|CHAPTER_BREAK
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    r = header(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = consumeToken(b, TEXT);
    if (!r) r = consumeToken(b, CHAPTER_BREAK);
    return r;
  }

  /* ********************************************************** */
  // LIST_DELIM TEXT
  static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, LIST_DELIM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LIST_DELIM, TEXT);
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
