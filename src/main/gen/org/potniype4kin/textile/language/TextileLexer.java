/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.potniype4kin.textile.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import org.potniype4kin.textile.psi.TextileType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Textile.flex</tt>
 */
class TextileLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int header = 2;
  public static final int list = 4;
  public static final int code_start = 6;
  public static final int code = 8;
  public static final int info_start = 10;
  public static final int info = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 15232 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\6\15\1\16\23\15"+
    "\1\17\1\15\1\20\1\21\12\15\1\22\10\12\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\1\36\2\12\1\15\1\37\3\12\1\40\10\12\1\41\1\42\5\15\1\43"+
    "\1\44\11\12\1\45\2\12\1\46\4\12\1\47\1\50\1\51\1\12\1\52\1\12\1\53\1\54\1"+
    "\55\3\12\51\15\1\56\3\15\1\57\1\60\4\15\1\61\12\12\1\62\u02c1\12\1\63\277"+
    "\12");

  /* The ZZ_CMAP_Y table has 3328 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\1\1\7\13\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\22\12\13"+
    "\1\4\1\13\1\24\1\4\1\13\1\25\1\4\1\13\1\26\1\27\1\13\1\30\1\31\1\1\1\30\4"+
    "\13\1\32\6\13\1\33\1\34\1\35\1\1\3\13\1\36\6\13\1\16\3\13\1\37\2\13\1\40\1"+
    "\1\1\13\1\41\4\1\1\13\1\42\1\1\1\43\1\22\7\13\1\44\1\4\1\33\1\45\1\34\1\46"+
    "\1\47\1\50\1\44\1\16\1\51\1\45\1\34\1\52\1\53\1\54\1\55\1\56\1\57\1\22\1\34"+
    "\1\60\1\61\1\62\1\44\1\63\1\64\1\45\1\34\1\60\1\65\1\66\1\44\1\67\1\70\1\71"+
    "\1\72\1\32\1\73\1\74\1\55\1\1\1\75\1\76\1\34\1\77\1\100\1\101\1\44\1\1\1\75"+
    "\1\76\1\34\1\102\1\100\1\103\1\44\1\104\1\105\1\76\1\13\1\36\1\106\1\107\1"+
    "\44\1\110\1\111\1\112\1\13\1\113\1\114\1\115\1\55\1\116\1\4\2\13\1\30\1\117"+
    "\1\120\2\1\1\121\1\122\1\123\1\124\1\125\1\126\2\1\1\62\1\127\1\120\1\130"+
    "\1\131\1\13\1\132\1\4\1\133\1\131\1\13\1\132\1\134\3\1\4\13\1\120\4\13\1\40"+
    "\2\13\1\135\2\13\1\136\24\13\1\137\1\140\2\13\1\137\2\13\1\141\1\142\1\14"+
    "\3\13\1\142\3\13\1\36\2\1\1\13\1\1\5\13\1\143\1\4\45\13\1\35\1\13\1\4\1\30"+
    "\4\13\1\144\1\145\1\146\1\147\1\13\1\147\1\13\1\150\1\146\1\151\5\13\1\152"+
    "\1\120\1\1\1\153\1\120\5\13\1\25\2\13\1\30\4\13\1\56\1\13\1\117\2\41\1\55"+
    "\1\13\1\40\1\147\2\13\1\41\1\13\2\120\2\1\1\13\1\41\3\13\1\117\1\13\1\35\2"+
    "\120\1\154\1\117\4\1\4\13\1\41\1\120\1\155\1\150\7\13\1\150\3\13\1\25\1\77"+
    "\2\13\1\40\1\145\4\1\1\156\1\13\1\157\17\13\1\160\21\13\1\143\2\13\1\143\1"+
    "\161\1\13\1\40\3\13\1\162\1\163\1\164\1\132\1\163\2\1\1\165\1\166\1\62\1\167"+
    "\1\1\1\170\1\1\1\132\3\1\2\13\1\62\1\171\1\172\1\173\1\126\1\174\1\1\2\13"+
    "\1\145\62\1\1\55\2\13\1\120\161\1\2\13\1\117\2\13\1\117\10\13\1\175\1\150"+
    "\2\13\1\135\3\13\1\176\1\166\1\13\1\177\4\200\2\13\2\1\1\166\35\1\1\201\1"+
    "\1\1\4\1\202\1\4\4\13\1\203\1\4\4\13\1\136\1\204\1\13\1\40\1\4\4\13\1\117"+
    "\1\1\1\13\1\30\3\1\1\13\40\1\133\13\1\56\4\1\135\13\1\56\2\1\10\13\1\132\4"+
    "\1\2\13\1\40\20\13\1\132\1\13\1\41\1\1\3\13\1\205\7\13\1\16\1\1\1\206\1\207"+
    "\5\13\1\210\1\13\1\117\1\25\3\1\1\206\2\13\1\25\1\1\3\13\1\150\4\13\1\56\1"+
    "\120\1\13\1\211\2\13\1\40\2\13\1\150\1\13\1\132\4\13\1\212\1\120\1\13\1\117"+
    "\3\13\1\177\1\40\1\120\1\13\1\112\4\13\1\31\1\153\1\13\1\213\1\214\1\215\1"+
    "\200\2\13\1\136\1\56\7\13\1\216\1\120\72\13\1\150\1\13\1\217\2\13\1\41\20"+
    "\1\26\13\1\40\6\13\1\120\2\1\1\177\1\220\1\34\1\221\1\222\6\13\1\16\1\1\1"+
    "\223\25\13\1\40\1\1\4\13\1\207\2\13\1\25\2\1\1\41\1\13\1\1\1\13\1\224\1\225"+
    "\2\1\1\133\7\13\1\132\1\1\1\120\1\4\1\5\1\4\1\30\1\55\4\13\1\117\1\226\1\227"+
    "\2\1\1\230\1\13\1\14\1\231\2\40\2\1\7\13\1\30\4\1\3\13\1\147\7\1\1\232\10"+
    "\1\1\13\1\132\3\13\2\62\1\1\2\13\1\1\1\13\1\30\2\13\1\30\1\13\1\40\2\13\1"+
    "\233\1\234\2\1\11\13\1\40\1\120\2\13\1\233\1\13\1\41\2\13\1\25\3\13\1\150"+
    "\11\1\23\13\1\177\1\13\1\56\1\25\11\1\1\235\2\13\1\236\1\13\1\56\1\13\1\177"+
    "\1\13\1\117\4\1\1\13\1\237\1\13\1\56\1\13\1\120\4\1\3\13\1\240\4\1\1\241\1"+
    "\242\1\13\1\243\2\1\1\13\1\132\1\13\1\132\2\1\1\131\1\13\1\177\1\1\3\13\1"+
    "\56\1\13\1\56\1\13\1\31\1\13\1\16\6\1\4\13\1\145\3\1\3\13\1\31\3\13\1\31\60"+
    "\1\4\13\1\177\1\1\1\55\1\166\3\13\1\30\1\1\1\13\1\145\1\120\3\13\1\133\1\1"+
    "\2\13\1\244\4\13\1\245\1\246\2\1\1\13\1\22\1\13\1\247\4\1\1\250\1\26\1\145"+
    "\3\13\1\30\1\120\1\33\1\45\1\34\1\60\1\65\1\251\1\252\1\147\10\1\4\13\1\30"+
    "\1\120\2\1\4\13\1\253\1\120\12\1\3\13\1\254\1\62\1\255\2\1\4\13\1\256\1\120"+
    "\2\1\3\13\1\25\1\120\3\1\1\13\1\77\1\41\1\120\26\1\4\13\1\120\1\166\34\1\3"+
    "\13\1\145\20\1\1\34\2\13\1\14\1\62\1\120\1\1\1\207\1\13\1\207\1\131\1\177"+
    "\64\1\71\13\1\120\6\1\6\13\1\117\1\1\14\13\1\150\53\1\2\13\1\117\75\1\44\13"+
    "\1\177\33\1\43\13\1\145\1\13\1\117\1\120\6\1\1\13\1\40\1\147\3\13\1\177\1"+
    "\150\1\120\1\223\1\257\1\13\67\1\4\13\1\147\2\13\1\117\1\166\1\13\4\1\1\62"+
    "\1\1\76\13\1\132\1\1\57\13\1\31\20\1\1\16\77\1\6\13\1\30\1\132\1\145\1\260"+
    "\114\1\1\261\1\262\1\263\1\1\1\264\11\1\1\265\33\1\5\13\1\133\3\13\1\146\1"+
    "\266\1\267\1\270\3\13\1\271\1\272\1\13\1\273\1\274\1\76\24\13\1\254\1\13\1"+
    "\76\1\136\1\13\1\136\1\13\1\133\1\13\1\133\1\117\1\13\1\117\1\13\1\34\1\13"+
    "\1\34\1\13\1\275\3\13\40\1\3\13\1\217\2\13\1\132\1\276\1\167\1\155\1\4\25"+
    "\1\1\14\1\210\1\277\75\1\14\13\1\147\1\177\2\1\4\13\1\30\1\120\112\1\1\270"+
    "\1\13\1\300\1\301\1\302\1\303\1\304\1\305\1\306\1\41\1\307\1\41\47\1\1\13"+
    "\1\120\1\13\1\120\1\13\1\120\47\1\55\13\1\177\2\1\103\13\1\147\15\13\1\40"+
    "\150\13\1\16\25\1\41\13\1\40\56\1\17\13\41\1");

  /* The ZZ_CMAP_A table has 3200 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\21\1\22\1\23\1\1\22\0\1\2\11\0\1\7\2\0\1\3\1\6\1\0\1\25\6\5\3"+
    "\25\1\24\6\0\32\25\4\0\1\25\1\0\2\25\1\11\1\13\1\14\1\20\1\25\1\4\1\16\4\25"+
    "\1\17\1\12\13\25\1\10\1\0\1\15\7\0\1\22\24\0\1\25\12\0\1\25\4\0\1\25\5\0\27"+
    "\25\1\0\12\25\4\0\14\25\16\0\5\25\7\0\1\25\1\0\1\25\1\0\5\25\1\0\2\25\2\0"+
    "\4\25\1\0\1\25\6\0\1\25\1\0\3\25\1\0\1\25\1\0\4\25\1\0\23\25\1\0\20\25\2\0"+
    "\1\25\6\0\10\25\10\0\16\25\1\0\1\25\1\0\2\25\1\0\2\25\1\0\1\25\10\0\13\25"+
    "\5\0\3\25\15\0\12\25\4\0\6\25\1\0\10\25\2\0\12\25\1\0\23\25\2\0\14\25\2\0"+
    "\11\25\4\0\1\25\5\0\16\25\2\0\14\25\4\0\5\25\1\0\10\25\6\0\20\25\2\0\13\25"+
    "\2\0\16\25\1\0\1\25\3\0\4\25\2\0\11\25\2\0\2\25\2\0\4\25\10\0\1\25\4\0\2\25"+
    "\1\0\1\25\1\0\3\25\1\0\6\25\4\0\2\25\1\0\2\25\1\0\2\25\1\0\2\25\2\0\1\25\1"+
    "\0\5\25\4\0\2\25\2\0\3\25\3\0\1\25\7\0\4\25\1\0\1\25\7\0\20\25\13\0\3\25\1"+
    "\0\11\25\1\0\2\25\1\0\2\25\1\0\5\25\2\0\12\25\1\0\3\25\1\0\3\25\2\0\1\25\30"+
    "\0\1\25\7\0\3\25\1\0\10\25\2\0\6\25\2\0\2\25\2\0\3\25\10\0\2\25\4\0\2\25\1"+
    "\0\1\25\1\0\1\25\20\0\2\25\1\0\6\25\3\0\3\25\1\0\4\25\3\0\2\25\1\0\1\25\1"+
    "\0\2\25\3\0\2\25\3\0\3\25\3\0\5\25\3\0\3\25\1\0\4\25\2\0\1\25\6\0\1\25\10"+
    "\0\4\25\1\0\10\25\1\0\3\25\1\0\30\25\3\0\10\25\1\0\3\25\1\0\4\25\7\0\2\25"+
    "\1\0\3\25\5\0\4\25\1\0\5\25\2\0\4\25\5\0\2\25\7\0\1\25\2\0\2\25\16\0\3\25"+
    "\1\0\10\25\1\0\7\25\1\0\3\25\1\0\5\25\5\0\4\25\7\0\1\25\12\0\6\25\2\0\2\25"+
    "\1\0\22\25\3\0\10\25\1\0\11\25\1\0\1\25\2\0\7\25\3\0\1\25\4\0\6\25\1\0\1\25"+
    "\1\0\10\25\2\0\2\25\14\0\17\25\1\0\12\25\7\0\2\25\1\0\1\25\2\0\2\25\1\0\1"+
    "\25\2\0\1\25\6\0\4\25\1\0\7\25\1\0\3\25\1\0\1\25\1\0\1\25\2\0\2\25\1\0\15"+
    "\25\1\0\3\25\2\0\5\25\1\0\1\25\1\0\6\25\2\0\12\25\2\0\4\25\10\0\2\25\13\0"+
    "\1\25\1\0\1\25\1\0\1\25\4\0\12\25\1\0\24\25\3\0\5\25\1\0\12\25\6\0\1\25\11"+
    "\0\6\25\1\0\1\25\5\0\1\25\2\0\13\25\1\0\15\25\1\0\4\25\2\0\7\25\1\0\1\25\1"+
    "\0\4\25\2\0\1\25\1\0\4\25\2\0\7\25\1\0\1\25\1\0\4\25\2\0\16\25\2\0\6\25\2"+
    "\0\13\25\3\0\13\25\7\0\15\25\1\0\7\25\13\0\4\25\14\0\1\25\1\0\2\25\14\0\4"+
    "\25\3\0\1\25\4\0\2\25\15\0\3\25\11\0\1\25\23\0\10\25\1\0\23\25\1\0\2\25\6"+
    "\0\6\25\5\0\15\25\1\0\1\25\1\0\1\25\1\0\1\25\1\0\6\25\1\0\7\25\1\0\1\25\3"+
    "\0\3\25\1\0\7\25\3\0\4\25\2\0\6\25\14\0\2\22\25\0\1\25\4\0\1\25\14\0\1\25"+
    "\15\0\1\25\2\0\1\25\4\0\1\25\2\0\12\25\1\0\1\25\3\0\5\25\6\0\1\25\1\0\1\25"+
    "\1\0\1\25\1\0\4\25\1\0\1\25\5\0\5\25\4\0\1\25\1\0\5\25\6\0\15\25\7\0\10\25"+
    "\11\0\7\25\1\0\7\25\6\0\3\25\11\0\5\25\2\0\5\25\3\0\7\25\2\0\2\25\2\0\3\25"+
    "\5\0\16\25\1\0\12\25\1\0\1\25\7\0\11\25\2\0\27\25\2\0\15\25\3\0\1\25\1\0\1"+
    "\25\2\0\1\25\16\0\1\25\2\0\5\25\12\0\6\25\2\0\6\25\2\0\6\25\11\0\13\25\1\0"+
    "\2\25\2\0\7\25\4\0\5\25\3\0\5\25\5\0\12\25\1\0\5\25\1\0\1\25\1\0\2\25\1\0"+
    "\2\25\1\0\12\25\3\0\15\25\3\0\2\25\30\0\3\25\2\0\6\25\2\0\6\25\2\0\6\25\2"+
    "\0\3\25\3\0\14\25\1\0\16\25\1\0\2\25\1\0\1\25\15\0\1\25\2\0\4\25\4\0\10\25"+
    "\1\0\5\25\12\0\6\25\2\0\1\25\1\0\14\25\1\0\2\25\3\0\1\25\2\0\4\25\1\0\2\25"+
    "\12\0\10\25\6\0\6\25\1\0\2\25\5\0\10\25\1\0\3\25\1\0\13\25\4\0\3\25\4\0\5"+
    "\25\2\0\1\25\11\0\5\25\5\0\3\25\3\0\13\25\1\0\1\25\3\0\10\25\6\0\1\25\1\0"+
    "\7\25\1\0\1\25\1\0\4\25\1\0\2\25\6\0\1\25\5\0\7\25\2\0\7\25\3\0\6\25\1\0\1"+
    "\25\10\0\6\25\2\0\10\25\10\0\6\25\2\0\1\25\3\0\1\25\13\0\10\25\5\0\15\25\3"+
    "\0\2\25\6\0\5\25\3\0\6\25\10\0\10\25\2\0\7\25\16\0\4\25\4\0\3\25\15\0\1\25"+
    "\2\0\2\25\2\0\4\25\1\0\14\25\1\0\1\25\1\0\7\25\1\0\21\25\1\0\4\25\2\0\10\25"+
    "\1\0\7\25\1\0\14\25\1\0\4\25\1\0\5\25\1\0\1\25\3\0\11\25\1\0\10\25\2\0\2\25"+
    "\5\0\1\25\12\0\2\25\1\0\2\25\1\0\5\25\6\0\2\25\1\0\1\25\2\0\1\25\1\0\12\25"+
    "\1\0\4\25\1\0\1\25\1\0\1\25\6\0\1\25\4\0\1\25\1\0\1\25\1\0\1\25\1\0\3\25\1"+
    "\0\2\25\1\0\1\25\2\0\1\25\1\0\1\25\1\0\1\25\1\0\1\25\1\0\1\25\1\0\2\25\1\0"+
    "\1\25\2\0\4\25\1\0\7\25\1\0\4\25\1\0\4\25\1\0\1\25\1\0\12\25\1\0\5\25\1\0"+
    "\3\25\1\0\5\25\1\0\5\25");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\16\0\1\1\1\2\6\1\1\3\12\1\1\4\2\1"+
    "\1\5\13\1\1\6\1\1\1\7\7\1\1\0\3\10"+
    "\1\11\2\0\1\12\6\0\3\13\1\0\1\12\5\0"+
    "\3\14\1\0\1\12\4\0\1\4\2\0\1\15\1\12"+
    "\5\0\3\16\2\0\1\12\4\0\1\6\1\0\1\17"+
    "\1\0\3\20\2\0\1\12\4\0\1\21\5\0\1\22"+
    "\4\0\1\23\10\0\1\24\5\0\1\25\5\0\2\26"+
    "\1\27\2\0\2\26\2\0\2\26\2\0\2\26\2\0"+
    "\1\26\1\0\1\26\2\0\1\26\1\0\1\26\2\0"+
    "\1\30\1\31\1\30\1\31\1\30\1\31\1\30\1\31"+
    "\1\0\1\30\1\31\1\0\1\30\1\31\1\32\1\33";

  private static int [] zzUnpackAction() {
    int [] result = new int[200];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\26\0\54\0\102\0\130\0\156\0\204\0\232"+
    "\0\260\0\306\0\334\0\362\0\u0108\0\u011e\0\u0134\0\u014a"+
    "\0\u0160\0\u0176\0\u018c\0\u01a2\0\u01b8\0\u01ce\0\u014a\0\u01e4"+
    "\0\u01fa\0\u0210\0\u0226\0\u023c\0\u0252\0\u0268\0\u027e\0\u0294"+
    "\0\u02aa\0\u014a\0\u02c0\0\u02d6\0\u02aa\0\u02ec\0\u0302\0\u0318"+
    "\0\u032e\0\u0344\0\u014a\0\u035a\0\u0370\0\u0386\0\u039c\0\u03b2"+
    "\0\u014a\0\u03c8\0\u02aa\0\u03de\0\u03f4\0\u040a\0\u0420\0\u0436"+
    "\0\u044c\0\u0462\0\u0134\0\u0478\0\u02aa\0\u0134\0\u014a\0\u014a"+
    "\0\u048e\0\u0134\0\u04a4\0\u01a2\0\u04ba\0\u04d0\0\u04e6\0\u01ce"+
    "\0\u04fc\0\u02aa\0\u01ce\0\u0512\0\u01ce\0\u0528\0\u0210\0\u053e"+
    "\0\u0554\0\u023c\0\u056a\0\u02aa\0\u023c\0\u0580\0\u023c\0\u0596"+
    "\0\u027e\0\u05ac\0\u05c2\0\u02aa\0\u02c0\0\u05d8\0\u02ec\0\u02aa"+
    "\0\u05ee\0\u0318\0\u0604\0\u061a\0\u0344\0\u0630\0\u02aa\0\u0344"+
    "\0\u0646\0\u065c\0\u0344\0\u0672\0\u039c\0\u0688\0\u069e\0\u02aa"+
    "\0\u03c8\0\u03de\0\u03f4\0\u06b4\0\u02aa\0\u03f4\0\u06ca\0\u06e0"+
    "\0\u03f4\0\u06f6\0\u044c\0\u070c\0\u0722\0\u02aa\0\u0738\0\u074e"+
    "\0\u0764\0\u077a\0\u0790\0\u02aa\0\u07a6\0\u07bc\0\u07d2\0\u07e8"+
    "\0\u02aa\0\u07fe\0\u0814\0\u082a\0\u0840\0\u0856\0\u086c\0\u0882"+
    "\0\u0898\0\u02aa\0\u08ae\0\u08c4\0\u08da\0\u08f0\0\u0906\0\u02aa"+
    "\0\u091c\0\u0932\0\u0948\0\u095e\0\u0974\0\u0134\0\u01a2\0\u0134"+
    "\0\u098a\0\u09a0\0\u01ce\0\u0210\0\u09b6\0\u09cc\0\u023c\0\u027e"+
    "\0\u09e2\0\u09f8\0\u02aa\0\u0318\0\u0a0e\0\u0a24\0\u0344\0\u0a3a"+
    "\0\u039c\0\u0a50\0\u0a66\0\u03f4\0\u0a7c\0\u044c\0\u0a92\0\u0aa8"+
    "\0\u0134\0\u0134\0\u01ce\0\u01ce\0\u023c\0\u023c\0\u02aa\0\u02aa"+
    "\0\u0abe\0\u0abe\0\u0344\0\u0ad4\0\u03f4\0\u0ad4\0\u0344\0\u03f4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[200];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\17\1\20\1\17\1\21\15\17\1\20\5\17\1\20"+
    "\1\17\1\22\1\23\2\17\1\24\1\25\10\17\1\20"+
    "\4\17\1\26\1\27\1\26\1\30\15\26\1\27\5\26"+
    "\1\27\1\26\1\31\3\26\1\32\1\33\10\26\1\27"+
    "\4\26\1\34\1\27\1\34\1\35\15\34\1\27\5\34"+
    "\1\27\1\34\1\36\3\34\1\37\1\40\10\34\1\27"+
    "\4\34\1\41\1\42\1\43\1\44\11\41\1\45\3\41"+
    "\1\42\1\41\1\43\1\46\2\41\1\42\1\43\1\47"+
    "\3\41\1\50\1\51\4\41\1\45\3\41\1\42\1\41"+
    "\1\43\1\46\1\41\1\52\1\53\1\52\1\54\4\52"+
    "\1\55\10\52\1\53\5\52\1\53\1\52\1\56\3\52"+
    "\1\57\1\60\10\52\1\53\4\52\1\41\1\61\1\62"+
    "\1\44\11\41\1\63\3\41\1\61\1\41\1\62\1\64"+
    "\2\41\1\61\1\62\1\47\3\41\1\50\1\51\4\41"+
    "\1\63\3\41\1\61\1\41\1\62\1\64\1\41\1\65"+
    "\1\20\1\65\1\66\4\65\1\67\10\65\1\20\5\65"+
    "\1\20\1\65\1\70\3\65\1\71\1\72\10\65\1\20"+
    "\4\65\1\73\1\74\17\73\1\75\2\76\2\73\1\0"+
    "\1\77\1\100\16\0\1\77\1\0\1\100\2\0\1\73"+
    "\1\74\1\73\1\101\15\73\1\75\2\76\3\73\1\74"+
    "\1\102\1\103\3\73\1\104\11\73\1\75\1\76\1\102"+
    "\3\73\1\74\3\73\1\105\13\73\1\75\2\76\3\73"+
    "\1\74\1\102\1\104\3\73\1\104\11\73\1\75\1\76"+
    "\1\102\3\73\1\74\7\73\1\106\4\73\1\107\2\73"+
    "\1\75\2\76\2\73\1\110\1\111\17\110\1\112\2\113"+
    "\3\110\1\111\1\110\1\114\15\110\1\112\2\113\3\110"+
    "\1\111\1\115\1\116\3\110\1\117\11\110\1\112\2\113"+
    "\3\110\1\111\1\115\1\117\3\110\1\117\11\110\1\112"+
    "\2\113\3\110\1\111\7\110\1\120\4\110\1\121\2\110"+
    "\1\112\2\113\2\110\1\122\1\123\17\122\1\124\2\125"+
    "\3\122\1\123\1\122\1\126\15\122\1\124\2\125\3\122"+
    "\1\123\1\127\1\130\3\122\1\131\11\122\1\124\1\125"+
    "\1\127\3\122\1\123\1\127\1\131\3\122\1\131\11\122"+
    "\1\124\1\125\1\127\3\122\1\123\7\122\1\132\4\122"+
    "\1\133\2\122\1\124\2\125\2\122\27\0\1\134\1\135"+
    "\16\0\1\134\1\0\1\135\5\0\1\136\26\0\2\137"+
    "\3\0\4\137\1\0\3\137\4\0\1\137\2\0\1\140"+
    "\1\141\3\0\1\142\13\0\1\140\4\0\1\140\1\142"+
    "\3\0\1\142\13\0\1\140\13\0\1\143\4\0\1\144"+
    "\7\0\1\145\1\146\17\145\1\147\2\150\3\145\1\146"+
    "\1\145\1\151\15\145\1\147\2\150\3\145\1\146\7\145"+
    "\1\152\7\145\1\147\2\150\3\145\1\146\1\153\1\154"+
    "\3\145\1\155\11\145\1\147\1\150\1\153\3\145\1\146"+
    "\1\153\1\155\3\145\1\155\11\145\1\147\1\150\1\153"+
    "\3\145\1\146\7\145\1\156\4\145\1\157\2\145\1\147"+
    "\2\150\2\145\1\0\1\160\1\161\16\0\1\160\1\0"+
    "\1\161\6\0\2\162\3\0\4\162\1\0\3\162\4\0"+
    "\1\162\1\163\1\164\17\163\1\165\2\166\3\163\1\164"+
    "\1\163\1\167\15\163\1\165\2\166\3\163\1\164\14\163"+
    "\1\170\2\163\1\165\2\166\3\163\1\164\1\171\1\172"+
    "\3\163\1\173\11\163\1\165\1\166\1\171\3\163\1\164"+
    "\1\171\1\173\3\163\1\173\11\163\1\165\1\166\1\171"+
    "\3\163\1\164\7\163\1\174\4\163\1\175\2\163\1\165"+
    "\2\166\2\163\21\0\1\176\4\0\1\73\1\74\1\73"+
    "\1\177\15\73\1\75\2\76\3\73\1\74\1\102\1\200"+
    "\3\73\1\104\11\73\1\75\1\76\1\102\3\73\1\74"+
    "\4\73\1\201\12\73\1\75\2\76\3\73\1\74\10\73"+
    "\1\202\6\73\1\75\2\76\3\73\1\74\15\73\1\203"+
    "\1\73\1\75\2\76\2\73\21\0\1\204\4\0\1\110"+
    "\1\111\1\110\1\205\15\110\1\112\2\113\3\110\1\111"+
    "\1\115\1\206\3\110\1\117\11\110\1\112\2\113\3\110"+
    "\1\111\10\110\1\207\6\110\1\112\2\113\3\110\1\111"+
    "\15\110\1\210\1\110\1\112\2\113\2\110\21\0\1\211"+
    "\4\0\1\122\1\123\1\122\1\212\15\122\1\124\2\125"+
    "\3\122\1\123\1\127\1\213\3\122\1\131\11\122\1\124"+
    "\1\125\1\127\3\122\1\123\10\122\1\214\6\122\1\124"+
    "\2\125\3\122\1\123\15\122\1\215\1\122\1\124\2\125"+
    "\2\122\3\0\1\216\24\0\1\140\1\217\3\0\1\142"+
    "\13\0\1\140\14\0\1\220\32\0\1\221\27\0\1\222"+
    "\4\0\1\145\1\146\1\145\1\223\15\145\1\147\2\150"+
    "\3\145\1\146\10\145\1\224\6\145\1\147\2\150\3\145"+
    "\1\146\1\153\1\225\3\145\1\155\11\145\1\147\1\150"+
    "\1\153\3\145\1\146\10\145\1\226\6\145\1\147\2\150"+
    "\3\145\1\146\15\145\1\227\1\145\1\147\2\150\2\145"+
    "\21\0\1\230\4\0\1\163\1\164\1\163\1\231\15\163"+
    "\1\165\2\166\3\163\1\164\15\163\1\232\1\163\1\165"+
    "\2\166\3\163\1\164\1\171\1\233\3\163\1\173\11\163"+
    "\1\165\1\166\1\171\3\163\1\164\10\163\1\234\6\163"+
    "\1\165\2\166\3\163\1\164\15\163\1\235\1\163\1\165"+
    "\2\166\2\163\1\73\1\74\1\73\1\236\15\73\1\75"+
    "\2\76\3\73\1\74\1\102\1\237\3\73\1\104\11\73"+
    "\1\75\1\76\1\102\3\73\1\74\1\240\16\73\1\75"+
    "\1\76\1\240\3\73\1\74\11\73\1\241\5\73\1\75"+
    "\2\76\3\73\1\74\16\73\1\242\1\75\2\76\2\73"+
    "\1\110\1\111\1\110\1\243\15\110\1\112\2\113\3\110"+
    "\1\111\1\115\1\244\3\110\1\117\11\110\1\112\2\113"+
    "\3\110\1\111\11\110\1\245\5\110\1\112\2\113\3\110"+
    "\1\111\16\110\1\246\1\112\2\113\2\110\1\122\1\123"+
    "\1\122\1\247\15\122\1\124\2\125\3\122\1\123\1\127"+
    "\1\250\3\122\1\131\11\122\1\124\1\125\1\127\3\122"+
    "\1\123\11\122\1\251\5\122\1\124\2\125\3\122\1\123"+
    "\16\122\1\252\1\124\2\125\2\122\3\0\1\253\24\0"+
    "\1\140\1\254\3\0\1\142\13\0\1\140\15\0\1\255"+
    "\32\0\1\256\5\0\1\145\1\146\1\145\1\257\15\145"+
    "\1\147\2\150\3\145\1\146\11\145\1\260\5\145\1\147"+
    "\2\150\3\145\1\146\1\153\1\261\3\145\1\155\11\145"+
    "\1\147\1\150\1\153\3\145\1\146\11\145\1\262\5\145"+
    "\1\147\2\150\3\145\1\146\16\145\1\263\1\147\2\150"+
    "\2\145\1\163\1\164\1\163\1\264\15\163\1\165\2\166"+
    "\3\163\1\164\16\163\1\265\1\165\2\166\3\163\1\164"+
    "\1\171\1\266\3\163\1\173\11\163\1\165\1\166\1\171"+
    "\3\163\1\164\11\163\1\267\5\163\1\165\2\166\3\163"+
    "\1\164\16\163\1\270\1\165\2\166\2\163\1\73\1\74"+
    "\12\73\1\271\4\73\1\75\2\76\3\73\1\74\10\73"+
    "\1\272\6\73\1\75\2\76\2\73\1\110\1\111\12\110"+
    "\1\273\4\110\1\112\2\113\3\110\1\111\10\110\1\274"+
    "\6\110\1\112\2\113\2\110\1\122\1\123\12\122\1\275"+
    "\4\122\1\124\2\125\3\122\1\123\10\122\1\276\6\122"+
    "\1\124\2\125\2\122\14\0\1\277\23\0\1\300\13\0"+
    "\1\145\1\146\12\145\1\301\4\145\1\147\2\150\3\145"+
    "\1\146\12\145\1\302\4\145\1\147\2\150\3\145\1\146"+
    "\10\145\1\303\6\145\1\147\2\150\2\145\1\163\1\164"+
    "\10\163\1\304\6\163\1\165\2\166\3\163\1\164\12\163"+
    "\1\305\4\163\1\165\2\166\3\163\1\164\10\163\1\306"+
    "\6\163\1\165\2\166\2\163\1\145\1\146\13\145\1\307"+
    "\3\145\1\147\2\150\2\145\1\163\1\164\13\163\1\310"+
    "\3\163\1\165\2\166\2\163";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2794];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\16\0\22\1\1\11\3\1\1\11\15\1\1\11\7\1"+
    "\1\0\1\1\1\11\2\1\2\0\1\1\6\0\1\1"+
    "\1\11\1\1\1\0\1\1\5\0\1\1\1\11\1\1"+
    "\1\0\1\1\4\0\1\11\2\0\1\1\1\11\5\0"+
    "\1\1\1\11\1\1\2\0\1\1\4\0\1\11\1\0"+
    "\1\1\1\0\1\1\1\11\1\1\2\0\1\1\4\0"+
    "\1\11\5\0\1\11\4\0\1\11\10\0\1\11\5\0"+
    "\1\11\5\0\3\1\2\0\2\1\2\0\2\1\2\0"+
    "\1\11\1\1\2\0\1\1\1\0\1\1\2\0\1\1"+
    "\1\0\1\1\2\0\6\1\2\11\1\0\2\1\1\0"+
    "\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[200];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  TextileLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL.charAt(zzMarkedPosL-1)) {
        case '\n':
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':  // fall through
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            } 
            // fall through
          case 28: break;
          case 2: 
            { return TextileType.EOL;
            } 
            // fall through
          case 29: break;
          case 3: 
            { yybegin(YYINITIAL);
    return TextileType.EOL;
            } 
            // fall through
          case 30: break;
          case 4: 
            { yybegin(code);
    return TextileType.EOL;
            } 
            // fall through
          case 31: break;
          case 5: 
            { return TextileType.CODE_START;
            } 
            // fall through
          case 32: break;
          case 6: 
            { yybegin(info);
    return TextileType.EOL;
            } 
            // fall through
          case 33: break;
          case 7: 
            { return TextileType.INFO_START;
            } 
            // fall through
          case 34: break;
          case 8: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return TextileType.TEXT;
            } 
            // fall through
          case 35: break;
          case 9: 
            { return TextileType.PARAGRAPH_BREAK;
            } 
            // fall through
          case 36: break;
          case 10: 
            { yybegin(list);
    return TextileType.LIST_DELIM;
            } 
            // fall through
          case 37: break;
          case 11: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return TextileType.HEADER_TEXT;
            } 
            // fall through
          case 38: break;
          case 12: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return TextileType.LIST_TEXT;
            } 
            // fall through
          case 39: break;
          case 13: 
            { String codeLanguage = yytext().toString().substring(1);
    return TextileType.CODE_START;
            } 
            // fall through
          case 40: break;
          case 14: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return TextileType.CODE;
            } 
            // fall through
          case 41: break;
          case 15: 
            { // get info title, if present
    return TextileType.INFO_START;
            } 
            // fall through
          case 42: break;
          case 16: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return TextileType.INFO;
            } 
            // fall through
          case 43: break;
          case 17: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return TextileType.TEXT;
            } 
            // fall through
          case 44: break;
          case 18: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return TextileType.HEADER_TEXT;
            } 
            // fall through
          case 45: break;
          case 19: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return TextileType.LIST_TEXT;
            } 
            // fall through
          case 46: break;
          case 20: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return TextileType.CODE;
            } 
            // fall through
          case 47: break;
          case 21: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return TextileType.INFO;
            } 
            // fall through
          case 48: break;
          case 22: 
            { return TextileType.CHAPTER_BREAK;
            } 
            // fall through
          case 49: break;
          case 23: 
            { yybegin(header);
    return TextileType.HEADER_START;
            } 
            // fall through
          case 50: break;
          case 24: 
            { yybegin(code_start);
    return TextileType.CODE_START;
            } 
            // fall through
          case 51: break;
          case 25: 
            { yybegin(info_start);
    return TextileType.INFO_START;
            } 
            // fall through
          case 52: break;
          case 26: 
            { yybegin(YYINITIAL);
    return TextileType.CODE_END;
            } 
            // fall through
          case 53: break;
          case 27: 
            { yybegin(YYINITIAL);
    return TextileType.INFO_END;
            } 
            // fall through
          case 54: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
