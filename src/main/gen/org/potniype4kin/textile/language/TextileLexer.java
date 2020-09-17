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
  public static final int numbered_list = 6;
  public static final int inline_code = 8;
  public static final int code_def = 10;
  public static final int code_delim = 12;
  public static final int code = 14;
  public static final int info_start = 16;
  public static final int info_start_title = 18;
  public static final int info = 20;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2,  2,  3,  3,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10
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
    "\11\0\1\2\1\31\1\32\1\33\1\1\22\0\1\35\1\24\1\0\1\10\4\0\1\23\1\25\1\7\1\26"+
    "\1\0\1\3\1\6\1\27\1\0\6\5\3\0\1\17\2\0\1\40\1\0\1\30\1\0\32\34\6\0\2\34\1"+
    "\12\1\14\1\15\1\22\1\34\1\4\1\20\2\34\1\37\1\34\1\21\1\13\4\34\1\36\6\34\1"+
    "\11\1\0\1\16\7\0\1\32\242\0\2\32\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\13\0\1\1\1\2\1\3\1\4\1\5\4\1\1\6"+
    "\1\7\1\3\1\4\1\10\3\11\1\12\1\3\1\13"+
    "\1\14\1\4\1\3\1\4\1\15\1\3\1\11\1\4"+
    "\1\16\1\3\1\17\1\4\2\17\1\20\2\21\1\4"+
    "\1\22\2\0\1\23\3\1\1\24\1\25\6\0\1\26"+
    "\5\0\2\1\1\27\1\30\1\31\1\32\1\33\5\0"+
    "\1\1\1\34\3\0\1\35\1\36\3\37\3\0\1\40"+
    "\1\0\1\41\1\42";

  private static int [] zzUnpackAction() {
    int [] result = new int[99];
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
    "\0\0\0\41\0\102\0\143\0\204\0\245\0\306\0\347"+
    "\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c\0\u01ad\0\u01ce\0\u018c"+
    "\0\u01ef\0\u0210\0\u0231\0\u0252\0\u0273\0\u018c\0\u0294\0\u018c"+
    "\0\u02b5\0\u02d6\0\u02f7\0\u0318\0\u018c\0\u0339\0\u018c\0\u018c"+
    "\0\u035a\0\u037b\0\u039c\0\u018c\0\u03bd\0\u03de\0\u03ff\0\u018c"+
    "\0\u0420\0\u018c\0\u0441\0\u0462\0\u0483\0\u018c\0\u04a4\0\u04c5"+
    "\0\u04e6\0\u018c\0\u0507\0\u0528\0\u018c\0\u0549\0\u056a\0\u058b"+
    "\0\u018c\0\u018c\0\u05ac\0\u05cd\0\u05ee\0\u060f\0\u0630\0\u039c"+
    "\0\u018c\0\u0651\0\u0672\0\u0693\0\u06b4\0\u06d5\0\u06f6\0\u0717"+
    "\0\u018c\0\u018c\0\u018c\0\u018c\0\u018c\0\u0738\0\u0759\0\u077a"+
    "\0\u079b\0\u07bc\0\u07dd\0\u018c\0\u07fe\0\u081f\0\u0840\0\u018c"+
    "\0\u018c\0\u0861\0\u018c\0\u016b\0\u0882\0\u08a3\0\u08c4\0\u018c"+
    "\0\u08e5\0\u018c\0\u018c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[99];
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
    "\1\14\1\15\1\16\6\14\1\17\17\14\1\15\1\14"+
    "\1\16\1\14\1\16\4\14\1\20\1\16\1\21\1\22"+
    "\2\14\1\23\1\24\1\17\17\14\1\20\1\14\1\16"+
    "\1\14\1\16\3\14\1\25\1\26\1\27\6\25\1\30"+
    "\17\25\1\26\1\25\1\27\1\25\1\27\3\25\1\31"+
    "\1\26\1\27\6\31\1\30\17\31\1\26\1\31\1\27"+
    "\1\31\1\27\3\31\1\32\1\30\1\33\6\32\1\30"+
    "\4\32\1\34\12\32\1\30\1\32\1\33\1\32\1\33"+
    "\3\32\1\30\1\35\1\36\13\30\1\37\1\40\3\30"+
    "\1\41\5\30\1\35\1\30\1\36\1\30\1\36\5\30"+
    "\1\42\1\30\1\43\5\30\4\43\1\44\1\30\3\43"+
    "\1\41\7\30\1\42\1\43\1\45\2\43\1\30\1\32"+
    "\1\15\1\46\6\32\1\47\17\32\1\15\1\32\1\46"+
    "\1\32\1\46\3\32\1\30\1\50\1\51\13\30\1\52"+
    "\1\53\3\30\1\41\5\30\1\50\1\30\1\51\1\30"+
    "\1\51\3\30\1\54\1\50\1\55\6\54\1\30\4\54"+
    "\1\56\12\54\1\50\1\54\1\55\1\54\1\55\3\54"+
    "\1\57\1\15\1\60\6\57\1\61\4\57\1\30\12\57"+
    "\1\15\1\57\1\60\1\57\1\60\3\57\1\14\2\0"+
    "\13\14\1\0\12\14\1\0\1\14\1\0\1\14\1\0"+
    "\3\14\42\0\1\15\1\16\26\0\1\15\1\0\1\16"+
    "\1\0\1\16\14\0\1\62\1\63\5\0\1\64\20\0"+
    "\1\14\1\0\1\65\1\66\3\14\1\67\6\14\1\0"+
    "\12\14\1\0\1\14\1\65\1\14\1\65\4\14\2\0"+
    "\2\14\1\70\10\14\1\0\12\14\1\0\1\14\1\0"+
    "\1\14\1\0\4\14\1\0\1\65\1\67\3\14\1\23"+
    "\1\24\5\14\1\0\12\14\1\0\1\14\1\65\1\14"+
    "\1\65\4\14\1\0\1\71\4\14\2\24\5\14\1\0"+
    "\12\14\1\0\1\14\1\71\1\14\1\71\3\14\1\25"+
    "\2\0\13\25\1\0\12\25\1\0\1\25\1\0\1\25"+
    "\1\0\3\25\1\0\1\26\1\27\26\0\1\26\1\0"+
    "\1\27\1\0\1\27\3\0\1\31\2\0\13\31\1\0"+
    "\12\31\1\0\1\31\1\0\1\31\1\0\3\31\1\32"+
    "\2\0\13\32\1\0\12\32\1\0\1\32\1\0\1\32"+
    "\1\0\3\32\2\0\1\33\30\0\1\33\1\0\1\33"+
    "\3\0\1\32\2\0\13\32\1\72\12\32\1\0\1\32"+
    "\1\0\1\32\1\0\3\32\1\0\1\35\1\36\26\0"+
    "\1\35\1\0\1\36\1\0\1\36\6\0\1\73\20\0"+
    "\1\74\1\0\1\75\1\76\1\77\12\0\1\42\30\0"+
    "\1\42\1\0\1\42\7\0\1\100\5\0\4\100\1\101"+
    "\1\0\3\100\11\0\4\100\3\0\1\42\1\0\1\100"+
    "\5\0\4\100\1\101\1\0\3\100\10\0\1\42\1\100"+
    "\1\45\2\100\2\0\1\15\1\46\26\0\1\15\1\0"+
    "\1\46\1\0\1\46\15\0\1\102\27\0\1\50\1\51"+
    "\26\0\1\50\1\0\1\51\1\0\1\51\41\0\1\103"+
    "\2\0\1\54\2\0\13\54\1\0\12\54\1\0\1\54"+
    "\1\0\1\54\1\0\3\54\1\0\1\50\1\55\26\0"+
    "\1\50\1\0\1\55\1\0\1\55\3\0\1\57\2\0"+
    "\13\57\1\0\12\57\1\0\1\57\1\0\1\57\1\0"+
    "\3\57\1\0\1\15\1\60\26\0\1\15\1\0\1\60"+
    "\1\0\1\60\23\0\1\104\33\0\1\105\46\0\1\106"+
    "\17\0\1\14\1\0\1\65\1\107\3\14\1\67\6\14"+
    "\1\0\12\14\1\0\1\14\1\65\1\14\1\65\4\14"+
    "\1\0\1\65\1\67\3\14\1\67\6\14\1\0\12\14"+
    "\1\0\1\14\1\65\1\14\1\65\4\14\2\0\3\14"+
    "\1\110\7\14\1\0\12\14\1\0\1\14\1\0\1\14"+
    "\1\0\3\14\25\0\1\111\40\0\1\112\40\0\1\113"+
    "\40\0\1\114\40\0\1\115\26\0\1\116\45\0\1\117"+
    "\41\0\1\120\33\0\1\121\46\0\1\122\16\0\1\14"+
    "\1\0\1\65\1\123\3\14\1\67\6\14\1\0\12\14"+
    "\1\0\1\14\1\65\1\14\1\65\4\14\1\0\1\124"+
    "\13\14\1\0\12\14\1\0\1\14\1\124\1\14\1\124"+
    "\3\14\14\0\1\125\62\0\1\126\24\0\1\127\33\0"+
    "\1\130\36\0\1\131\25\0\1\14\1\132\1\65\1\67"+
    "\3\14\1\67\6\14\1\0\12\14\1\133\1\134\1\133"+
    "\1\14\1\65\3\14\15\0\1\135\62\0\1\136\14\0"+
    "\1\137\56\0\1\133\25\0\1\140\37\0\1\141\41\0"+
    "\1\142\62\0\1\143";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2310];
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
    "\13\0\1\1\1\11\2\1\1\11\5\1\1\11\1\1"+
    "\1\11\4\1\1\11\1\1\2\11\3\1\1\11\3\1"+
    "\1\11\1\1\1\11\3\1\1\11\3\1\1\11\2\0"+
    "\1\11\3\1\2\11\6\0\1\11\5\0\2\1\5\11"+
    "\5\0\1\1\1\11\3\0\2\11\1\1\1\11\1\1"+
    "\3\0\1\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[99];
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
          case 35: break;
          case 2: 
            { return TextileType.EOL;
            } 
            // fall through
          case 36: break;
          case 3: 
            { return TextileType.SPACE;
            } 
            // fall through
          case 37: break;
          case 4: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 38: break;
          case 5: 
            { return TextileType.PARAGRAPH_BREAK;
            } 
            // fall through
          case 39: break;
          case 6: 
            { return TextileType.HEADER_TEXT;
            } 
            // fall through
          case 40: break;
          case 7: 
            { yybegin(YYINITIAL);
        return TextileType.EOL;
            } 
            // fall through
          case 41: break;
          case 8: 
            { return TextileType.LIST_TEXT;
            } 
            // fall through
          case 42: break;
          case 9: 
            { return TextileType.CODE;
            } 
            // fall through
          case 43: break;
          case 10: 
            { yybegin(code);
        return TextileType.EOL;
            } 
            // fall through
          case 44: break;
          case 11: 
            { return TextileType.CODE_DEF_END;
            } 
            // fall through
          case 45: break;
          case 12: 
            { yybegin(code_delim);
        return TextileType.CODE_DELIM;
            } 
            // fall through
          case 46: break;
          case 13: 
            { yybegin(code);
        return TextileType.CODE_DEF_END;
            } 
            // fall through
          case 47: break;
          case 14: 
            { yybegin(info);
        return TextileType.EOL;
            } 
            // fall through
          case 48: break;
          case 15: 
            { return TextileType.INFO_START;
            } 
            // fall through
          case 49: break;
          case 16: 
            { yybegin(info);
        return TextileType.INFO_START;
            } 
            // fall through
          case 50: break;
          case 17: 
            { return TextileType.INFO_TEXT;
            } 
            // fall through
          case 51: break;
          case 18: 
            { yybegin(inline_code);
        return TextileType.INLINE_CODE_START;
            } 
            // fall through
          case 52: break;
          case 19: 
            { yybegin(list);
        return TextileType.LIST_DELIM;
            } 
            // fall through
          case 53: break;
          case 20: 
            { yybegin(numbered_list);
        return TextileType.ORDERED_LIST_DELIM;
            } 
            // fall through
          case 54: break;
          case 21: 
            { yybegin(YYINITIAL);
        return TextileType.INLINE_CODE_END;
            } 
            // fall through
          case 55: break;
          case 22: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return TextileType.CODE_LANGUAGE;
            } 
            // fall through
          case 56: break;
          case 23: 
            { return TextileType.SIGN_MINUS;
            } 
            // fall through
          case 57: break;
          case 24: 
            { return TextileType.SIGN_WARNING;
            } 
            // fall through
          case 58: break;
          case 25: 
            { return TextileType.SIGN_PLUS;
            } 
            // fall through
          case 59: break;
          case 26: 
            { return TextileType.SIGN_OK;
            } 
            // fall through
          case 60: break;
          case 27: 
            { return TextileType.SIGN_QUESTION;
            } 
            // fall through
          case 61: break;
          case 28: 
            { yybegin(header);
        return TextileType.HEADER_START;
            } 
            // fall through
          case 62: break;
          case 29: 
            { yybegin(code_def);
        return TextileType.CODE_DEF;
            } 
            // fall through
          case 63: break;
          case 30: 
            { yybegin(info_start);
        return TextileType.INFO_START;
            } 
            // fall through
          case 64: break;
          case 31: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 4);
            { return TextileType.CHAPTER_BREAK;
            } 
            // fall through
          case 65: break;
          case 32: 
            { yybegin(YYINITIAL);
        return TextileType.CODE_END;
            } 
            // fall through
          case 66: break;
          case 33: 
            { yybegin(YYINITIAL);
        return TextileType.INFO_END;
            } 
            // fall through
          case 67: break;
          case 34: 
            { yybegin(info_start_title);
        return TextileType.INFO_START;
            } 
            // fall through
          case 68: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
