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
  public static final int code_def = 6;
  public static final int code_delim = 8;
  public static final int code = 10;
  public static final int info_start = 12;
  public static final int info_start_title = 14;
  public static final int info = 16;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7,  8,  8, 
     9, 9
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\30\1\31\1\32\1\1\22\0\1\2\1\23\6\0\1\22\1\24\1\7\1\25\1\0\1\3"+
    "\1\6\1\26\1\0\6\5\3\0\1\15\2\0\1\35\1\0\1\27\43\0\1\11\1\13\1\14\1\21\1\0"+
    "\1\4\1\17\2\0\1\34\1\0\1\20\1\12\4\0\1\33\6\0\1\10\1\0\1\16\7\0\1\31\242\0"+
    "\2\31\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\12\0\1\1\1\2\1\3\1\4\1\5\3\1\1\6"+
    "\1\7\1\3\1\4\1\10\1\11\1\3\1\12\1\13"+
    "\2\4\1\13\1\4\2\14\1\4\1\15\1\16\2\15"+
    "\1\3\2\17\1\4\2\0\1\20\2\1\6\0\1\21"+
    "\6\0\1\15\3\0\2\1\1\22\1\23\1\24\1\25"+
    "\1\26\1\22\1\23\1\24\1\25\1\26\1\0\1\15"+
    "\3\0\1\1\1\27\1\0\1\15\1\0\1\30\1\31"+
    "\3\32\1\0\1\15\1\0\1\33\1\15\1\34\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[98];
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
    "\0\0\0\36\0\74\0\132\0\170\0\226\0\264\0\322"+
    "\0\360\0\u010e\0\u012c\0\u014a\0\u0168\0\u0186\0\u014a\0\u01a4"+
    "\0\u01c2\0\u01e0\0\u01fe\0\u014a\0\u021c\0\u014a\0\u023a\0\u014a"+
    "\0\u0258\0\u014a\0\u014a\0\u0276\0\u0294\0\u0294\0\u02b2\0\u02d0"+
    "\0\u02ee\0\u030c\0\u032a\0\u014a\0\u0348\0\u0366\0\u0384\0\u03a2"+
    "\0\u03c0\0\u03de\0\u03fc\0\u041a\0\u014a\0\u0438\0\u0456\0\u0474"+
    "\0\u0492\0\u04b0\0\u04ce\0\u04ec\0\u0294\0\u014a\0\u050a\0\u0528"+
    "\0\u0546\0\u0564\0\u0582\0\u05a0\0\u05be\0\u05dc\0\u05fa\0\u0618"+
    "\0\u0636\0\u0654\0\u014a\0\u014a\0\u014a\0\u014a\0\u014a\0\u0294"+
    "\0\u0294\0\u0294\0\u0294\0\u0294\0\u0672\0\u0690\0\u06ae\0\u06cc"+
    "\0\u06ea\0\u0708\0\u014a\0\u0726\0\u0744\0\u0762\0\u014a\0\u014a"+
    "\0\u0780\0\u014a\0\u012c\0\u079e\0\u07bc\0\u07da\0\u014a\0\u07f8"+
    "\0\u014a\0\u032a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[98];
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
    "\1\13\1\14\1\15\5\13\1\16\17\13\1\14\1\13"+
    "\1\15\4\13\1\17\1\15\1\20\1\21\2\13\1\22"+
    "\1\16\17\13\1\17\1\13\1\15\3\13\1\23\1\24"+
    "\1\25\5\23\1\26\17\23\1\24\1\23\1\25\3\23"+
    "\1\27\1\24\1\25\5\27\1\26\17\27\1\24\1\27"+
    "\1\25\3\27\1\26\1\30\1\31\12\26\1\32\1\33"+
    "\3\26\1\34\5\26\1\30\1\26\1\31\3\26\1\35"+
    "\1\30\1\31\5\35\1\26\5\35\1\36\3\35\1\37"+
    "\5\35\1\30\1\35\1\31\3\35\1\40\1\14\1\41"+
    "\5\40\1\42\17\40\1\14\1\40\1\41\3\40\1\43"+
    "\1\44\1\45\5\43\1\26\4\43\1\46\12\43\1\44"+
    "\1\43\1\45\3\43\2\26\1\47\17\26\1\34\7\26"+
    "\1\47\3\26\1\50\1\14\1\51\5\50\1\52\17\50"+
    "\1\14\1\50\1\51\3\50\1\13\2\0\13\13\1\0"+
    "\11\13\1\0\1\13\1\0\3\13\37\0\1\14\1\15"+
    "\25\0\1\14\1\0\1\15\14\0\1\53\5\0\1\54"+
    "\16\0\1\13\1\0\1\55\1\56\3\13\1\22\6\13"+
    "\1\0\11\13\1\0\1\13\1\55\4\13\2\0\2\13"+
    "\1\57\10\13\1\0\11\13\1\0\1\13\1\0\4\13"+
    "\1\0\1\55\1\22\3\13\1\22\6\13\1\0\11\13"+
    "\1\0\1\13\1\55\3\13\1\23\2\0\13\23\1\0"+
    "\11\23\1\0\1\23\1\0\3\23\1\0\1\24\1\25"+
    "\25\0\1\24\1\0\1\25\3\0\1\27\2\0\13\27"+
    "\1\0\11\27\1\0\1\27\1\0\3\27\1\0\1\30"+
    "\1\31\25\0\1\30\1\0\1\31\6\0\1\60\17\0"+
    "\1\61\1\0\1\62\1\63\1\64\6\0\1\65\2\0"+
    "\13\65\1\66\11\65\1\0\1\65\1\0\4\65\2\0"+
    "\1\67\12\65\1\66\4\65\1\70\1\65\1\71\1\72"+
    "\1\73\1\0\1\65\1\0\3\65\1\40\2\0\13\40"+
    "\1\0\11\40\1\0\1\40\1\0\3\40\1\0\1\14"+
    "\1\41\25\0\1\14\1\0\1\41\14\0\1\74\24\0"+
    "\1\43\2\0\13\43\1\0\11\43\1\0\1\43\1\0"+
    "\3\43\1\0\1\44\1\45\25\0\1\44\1\0\1\45"+
    "\3\0\1\43\2\0\13\43\1\0\11\43\1\0\1\43"+
    "\1\0\1\75\2\43\2\0\1\47\27\0\1\47\3\0"+
    "\1\50\2\0\13\50\1\0\11\50\1\0\1\50\1\0"+
    "\3\50\1\0\1\14\1\51\25\0\1\14\1\0\1\51"+
    "\22\0\1\76\30\0\1\77\43\0\1\100\15\0\1\13"+
    "\1\0\1\55\1\101\3\13\1\22\6\13\1\0\11\13"+
    "\1\0\1\13\1\55\4\13\2\0\3\13\1\102\7\13"+
    "\1\0\11\13\1\0\1\13\1\0\3\13\24\0\1\103"+
    "\35\0\1\104\35\0\1\105\35\0\1\106\35\0\1\107"+
    "\11\0\1\65\2\0\13\65\1\66\5\65\1\110\3\65"+
    "\1\0\1\65\1\0\4\65\2\0\13\65\1\66\5\65"+
    "\1\111\3\65\1\0\1\65\1\0\4\65\2\0\13\65"+
    "\1\66\5\65\1\112\3\65\1\0\1\65\1\0\4\65"+
    "\2\0\13\65\1\66\5\65\1\113\3\65\1\0\1\65"+
    "\1\0\4\65\2\0\13\65\1\66\5\65\1\114\3\65"+
    "\1\0\1\65\1\0\3\65\12\0\1\115\23\0\1\43"+
    "\2\0\13\43\1\0\1\116\10\43\1\0\1\43\1\0"+
    "\3\43\20\0\1\117\30\0\1\120\43\0\1\121\14\0"+
    "\1\13\1\0\1\55\1\122\3\13\1\22\6\13\1\0"+
    "\11\13\1\0\1\13\1\55\4\13\1\0\1\123\13\13"+
    "\1\0\11\13\1\0\1\13\1\123\3\13\13\0\1\124"+
    "\22\0\1\43\2\0\13\43\1\0\11\43\1\0\1\43"+
    "\1\0\1\125\2\43\21\0\1\126\30\0\1\127\33\0"+
    "\1\130\23\0\1\13\1\131\1\55\1\22\3\13\1\22"+
    "\6\13\1\0\11\13\1\132\1\133\1\132\3\13\14\0"+
    "\1\134\21\0\1\43\2\0\13\43\1\0\11\43\1\0"+
    "\1\43\1\0\1\43\1\135\1\43\12\0\1\136\53\0"+
    "\1\132\23\0\1\137\17\0\1\43\2\0\11\43\1\140"+
    "\1\43\1\0\11\43\1\0\1\43\1\0\3\43\16\0"+
    "\1\141\17\0\1\43\2\0\13\43\1\0\11\43\1\0"+
    "\1\43\1\0\2\43\1\142";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2070];
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
    "\12\0\1\1\1\11\2\1\1\11\4\1\1\11\1\1"+
    "\1\11\1\1\1\11\1\1\2\11\10\1\1\11\6\1"+
    "\2\0\1\11\2\1\6\0\1\11\6\0\1\1\3\0"+
    "\2\1\5\11\5\1\1\0\1\1\3\0\1\1\1\11"+
    "\1\0\1\1\1\0\2\11\1\1\1\11\1\1\1\0"+
    "\1\1\1\0\1\11\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[98];
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
            { return TextileType.TEXT;
            } 
            // fall through
          case 30: break;
          case 2: 
            { return TextileType.EOL;
            } 
            // fall through
          case 31: break;
          case 3: 
            { return TextileType.SPACE;
            } 
            // fall through
          case 32: break;
          case 4: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 33: break;
          case 5: 
            { return TextileType.PARAGRAPH_BREAK;
            } 
            // fall through
          case 34: break;
          case 6: 
            { return TextileType.HEADER_TEXT;
            } 
            // fall through
          case 35: break;
          case 7: 
            { yybegin(YYINITIAL);
        return TextileType.EOL;
            } 
            // fall through
          case 36: break;
          case 8: 
            { return TextileType.LIST_TEXT;
            } 
            // fall through
          case 37: break;
          case 9: 
            { yybegin(code);
        return TextileType.EOL;
            } 
            // fall through
          case 38: break;
          case 10: 
            { yybegin(code_delim);
        return TextileType.CODE_DELIM;
            } 
            // fall through
          case 39: break;
          case 11: 
            { return TextileType.CODE_DEF_END;
            } 
            // fall through
          case 40: break;
          case 12: 
            { return TextileType.CODE;
            } 
            // fall through
          case 41: break;
          case 13: 
            { return TextileType.INFO_START;
            } 
            // fall through
          case 42: break;
          case 14: 
            { yybegin(info);
        return TextileType.EOL;
            } 
            // fall through
          case 43: break;
          case 15: 
            { return TextileType.INFO_TEXT;
            } 
            // fall through
          case 44: break;
          case 16: 
            { yybegin(list);
        return TextileType.LIST_DELIM;
            } 
            // fall through
          case 45: break;
          case 17: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return TextileType.CODE_LANGUAGE;
            } 
            // fall through
          case 46: break;
          case 18: 
            { return TextileType.SIGN_MINUS;
            } 
            // fall through
          case 47: break;
          case 19: 
            { return TextileType.SIGN_WARNING;
            } 
            // fall through
          case 48: break;
          case 20: 
            { return TextileType.SIGN_PLUS;
            } 
            // fall through
          case 49: break;
          case 21: 
            { return TextileType.SIGN_OK;
            } 
            // fall through
          case 50: break;
          case 22: 
            { return TextileType.SIGN_QUESTION;
            } 
            // fall through
          case 51: break;
          case 23: 
            { yybegin(header);
        return TextileType.HEADER_START;
            } 
            // fall through
          case 52: break;
          case 24: 
            { yybegin(code_def);
        return TextileType.CODE_DEF;
            } 
            // fall through
          case 53: break;
          case 25: 
            { yybegin(info_start);
        return TextileType.INFO_START;
            } 
            // fall through
          case 54: break;
          case 26: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 4);
            { return TextileType.CHAPTER_BREAK;
            } 
            // fall through
          case 55: break;
          case 27: 
            { yybegin(YYINITIAL);
        return TextileType.CODE_END;
            } 
            // fall through
          case 56: break;
          case 28: 
            { yybegin(YYINITIAL);
        return TextileType.INFO_END;
            } 
            // fall through
          case 57: break;
          case 29: 
            { yybegin(info_start_title);
        return TextileType.INFO_START;
            } 
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
