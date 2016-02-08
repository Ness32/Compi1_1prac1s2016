
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Feb 03 23:33:45 CST 2016
//----------------------------------------------------

package ArchivosXml;

import java.io.*;
import java_cup.runtime.*;
import java.util.*;
import javax.swing.JOptionPane;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Feb 03 23:33:45 CST 2016
  */
public class ParseXml extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParseXml() {super();}

  /** Constructor which sets the default scanner. */
  public ParseXml(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParseXml(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\004\000\002\002\004\000\002\003" +
    "\005\000\002\004\004\000\002\005\005\000\002\005\005" +
    "\000\002\005\005\000\002\005\005\000\002\005\005\000" +
    "\002\006\006\000\002\007\006\000\002\007\006\000\002" +
    "\007\006\000\002\007\006\000\002\007\006\000\002\010" +
    "\004\000\002\010\004\000\002\011\004\000\002\012\006" +
    "\000\002\013\005\000\002\014\005\000\002\015\004\000" +
    "\002\016\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\004\004\005\001\002\000\004\002\101\001" +
    "\002\000\004\010\006\001\002\000\004\005\010\001\002" +
    "\000\004\002\000\001\002\000\004\004\011\001\002\000" +
    "\014\011\015\012\020\014\017\022\013\023\014\001\002" +
    "\000\004\002\uffff\001\002\000\004\005\077\001\002\000" +
    "\004\005\071\001\002\000\004\005\067\001\002\000\004" +
    "\002\ufffe\001\002\000\004\005\061\001\002\000\004\005" +
    "\021\001\002\000\004\017\023\001\002\000\004\002\ufff9" +
    "\001\002\000\004\016\024\001\002\000\004\024\025\001" +
    "\002\000\004\016\027\001\002\000\004\002\uffee\001\002" +
    "\000\004\021\030\001\002\000\004\004\032\001\002\000" +
    "\004\002\uffed\001\002\000\004\006\034\001\002\000\004" +
    "\002\uffec\001\002\000\014\011\035\012\040\014\041\022" +
    "\036\023\037\001\002\000\004\005\052\001\002\000\004" +
    "\005\042\001\002\000\004\005\042\001\002\000\004\005" +
    "\042\001\002\000\004\005\042\001\002\000\004\004\044" +
    "\001\002\000\004\002\ufff7\001\002\000\016\006\034\011" +
    "\015\012\020\014\017\022\013\023\014\001\002\000\004" +
    "\002\ufff1\001\002\000\004\002\ufff2\001\002\000\004\002" +
    "\ufff3\001\002\000\004\002\ufff4\001\002\000\004\002\ufff5" +
    "\001\002\000\004\004\054\001\002\000\004\002\ufff6\001" +
    "\002\000\004\006\056\001\002\000\004\002\ufff0\001\002" +
    "\000\004\010\057\001\002\000\004\005\060\001\002\000" +
    "\004\002\uffef\001\002\000\004\007\062\001\002\000\004" +
    "\024\064\001\002\000\004\002\ufffd\001\002\000\004\007" +
    "\065\001\002\000\004\004\032\001\002\000\004\002\ufff8" +
    "\001\002\000\004\004\011\001\002\000\004\002\ufffc\001" +
    "\002\000\004\007\072\001\002\000\004\015\074\001\002" +
    "\000\004\002\ufffa\001\002\000\004\007\075\001\002\000" +
    "\004\004\032\001\002\000\004\002\uffeb\001\002\000\004" +
    "\004\011\001\002\000\004\002\ufffb\001\002\000\004\002" +
    "\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\004\002\003\001\001\000\002\001\001\000" +
    "\004\003\006\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\011\001\001\000\004\005\015\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\013\021\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\014\025\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\015\030\001\001\000\004\007\032" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\011\052\001\001\000\004" +
    "\010\050\001\001\000\004\010\047\001\001\000\004\010" +
    "\046\001\001\000\004\010\042\001\001\000\006\004\045" +
    "\007\044\001\001\000\002\001\001\000\004\005\015\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\054\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\062\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\065\001\001\000\002\001" +
    "\001\000\004\004\067\001\001\000\002\001\001\000\004" +
    "\016\072\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\075\001\001\000\002\001\001" +
    "\000\004\004\077\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParseXml$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParseXml$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParseXml$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



/**Metodo al que se llama automáticamente ante algún error sintactico.*/
public void syntax_error(Symbol s){
System.out.println("Error en la Línea " + (s.right+1) +" Columna "+s.left+ " Identificador " +s.value + " no reconocido." );
}
/**Metodo al que se llama en el momento en que ya no es posible una recuperación de errores.*/
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
System.out.println("Error en la Línea " + (s.right+1)+ "Columna "+s.left+". Identificador " + s.value + " no reconocido.");
}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParseXml$actions {


/*
static Stack pilaXml= new Stack();
static Stack erroresXmL= new Stack();
*/

  private final ParseXml parser;

  /** Constructor */
  CUP$ParseXml$actions(ParseXml parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParseXml$do_action(
    int                        CUP$ParseXml$act_num,
    java_cup.runtime.lr_parser CUP$ParseXml$parser,
    java.util.Stack            CUP$ParseXml$stack,
    int                        CUP$ParseXml$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParseXml$result;

      /* select the action based on the action number */
      switch (CUP$ParseXml$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Linea12 ::= Tk_Comillas Tk_Luga Tk_Comillas Linea5 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea12",12, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-3)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Linea11 ::= Tk_Year Linea5 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea11",11, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Linea10 ::= Tk_Cont Tk_Guion Linea11 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea10",10, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-2)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Linea9 ::= Tk_Dia Tk_Guion Linea10 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea9",9, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-2)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Linea8 ::= Tk_Abrir Tk_Diag Tk_Proy Tk_Cerrar 
            {
              Object RESULT =null;
		JOptionPane.showMessageDialog(null, "Copilacion Exitosa ", "Copilacion", JOptionPane.WARNING_MESSAGE);
              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea8",8, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-3)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Linea7 ::= Tk_Cerrar Linea8 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea7",7, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Linea6 ::= Tk_Cerrar Linea5 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea6",6, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Linea6 ::= Tk_Cerrar Linea2 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea6",6, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Linea5 ::= Tk_Abrir Tk_Diag Tk_Date Linea6 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea5",5, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-3)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Linea5 ::= Tk_Abrir Tk_Diag Tk_Ruta Linea6 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea5",5, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-3)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Linea5 ::= Tk_Abrir Tk_Diag Tk_Files Linea6 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea5",5, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-3)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Linea5 ::= Tk_Abrir Tk_Diag Tk_Arch Linea7 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea5",5, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-3)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Linea5 ::= Tk_Abrir Tk_Diag Tk_Name Linea6 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea5",5, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-3)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Linea4 ::= Tk_Comillas Tk_Cont Tk_Comillas Linea5 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea4",4, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-3)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Linea3 ::= Tk_Date Tk_Cerrar Linea9 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea3",3, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-2)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Linea3 ::= Tk_Ruta Tk_Cerrar Linea12 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea3",3, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-2)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Linea3 ::= Tk_Files Tk_Cerrar Linea2 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea3",3, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-2)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Linea3 ::= Tk_Arch Tk_Cerrar Linea2 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea3",3, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-2)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Linea3 ::= Tk_Name Tk_Cerrar Linea4 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea3",3, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-2)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Linea2 ::= Tk_Abrir Linea3 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea2",2, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Linea1 ::= Tk_Proy Tk_Cerrar Linea2 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea1",1, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-2)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Linea0 ::= Tk_Abrir Linea1 
            {
              Object RESULT =null;

              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("Linea0",0, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          return CUP$ParseXml$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Linea0 EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)).value;
		RESULT = start_val;
              CUP$ParseXml$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParseXml$stack.elementAt(CUP$ParseXml$top-1)), ((java_cup.runtime.Symbol)CUP$ParseXml$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParseXml$parser.done_parsing();
          return CUP$ParseXml$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

