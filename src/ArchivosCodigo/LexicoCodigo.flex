package ArchivosCodigo;
import java.io.*;
import java_cup.runtime.Symbol;

%%
%cupsym CaracterCodigo
%class ArchivosCodigo
%public
%full
%char
%line
%cup
%unicode
Lt=[a-zA-ZÑñ_]
Dg=[0-9]
blanco=[" "]
linea=[\n]
retorno=[\r]
tab=[\t]
%%
{blanco}                     {/*Se ingnora*/}
{linea}                      {/*Se ingnora*/}
{retorno}                    {/*Se ingnora*/}
{tab}                        {/*Se ingnora*/}


/*
*
*Comentarios
*
*/

"#*"                      {return new Symbol(CaracterCodigo.Tk_OpenC,yychar,yyline,new String(yytext()));} 
"*#"                      {return new Symbol(CaracterCodigo.Tk_CloseC,yychar,yyline,new String(yytext()));} 
"//"                      {return new Symbol(CaracterCodigo.Tk_DobleB,yychar,yyline,new String(yytext()));}

/*
*
*Tipos de Datos
*
*/

"string"                          {return new Symbol(CaracterCodigo.Tk_string,yychar,yyline,new String(yytext()));} 
"double"                          {return new Symbol(CaracterCodigo.Tk_double,yychar,yyline,new String(yytext()));} 
"bool"                            {return new Symbol(CaracterCodigo.Tk_bool,yychar,yyline,new String(yytext()));} 
"int"                             {return new Symbol(CaracterCodigo.Tk_int,yychar,yyline,new String(yytext()));} 
"char"                            {return new Symbol(CaracterCodigo.Tk_char,yychar,yyline,new String(yytext()));} 
"void"                            {return new Symbol(CaracterCodigo.Tk_void,yychar,yyline,new String(yytext()));} 


/*
*
*Operaciones arimeticas
*
*/

"+"                               {return new Symbol(CaracterCodigo.Tk_suma,yychar,yyline,new String(yytext()));} 
"-"                               {return new Symbol(CaracterCodigo.Tk_resta,yychar,yyline,new String(yytext()));} 
"/"                               {return new Symbol(CaracterCodigo.Tk_div,yychar,yyline,new String(yytext()));} 
"*"                               {return new Symbol(CaracterCodigo.Tk_multi,yychar,yyline,new String(yytext()));} 
"++"                              {return new Symbol(CaracterCodigo.Tk_plus,yychar,yyline,new String(yytext()));} 
"--"                              {return new Symbol(CaracterCodigo.Tk_minus,yychar,yyline,new String(yytext()));} 
"^"                               {return new Symbol(CaracterCodigo.Tk_pote,yychar,yyline,new String(yytext()));} 

/*
*
*Operaciones Relacionales
*
*/

"<"                             {return new Symbol(CaracterCodigo.Tk_mayor,yychar,yyline,new String(yytext()));} 
">"                             {return new Symbol(CaracterCodigo.Tk_menor,yychar,yyline,new String(yytext()));} 
">="                            {return new Symbol(CaracterCodigo.Tk_mayorq,yychar,yyline,new String(yytext()));} 
"<="                            {return new Symbol(CaracterCodigo.Tk_menorq,yychar,yyline,new String(yytext()));} 
"=="                            {return new Symbol(CaracterCodigo.Tk_igualIgual,yychar,yyline,new String(yytext()));} 
"!="                            {return new Symbol(CaracterCodigo.Tk_dif,yychar,yyline,new String(yytext()));} 

/*
*
*
*Signos de Agrupacion
*
*/

"("                            {return new Symbol(CaracterCodigo.Tk_Abrir,yychar,yyline,new String(yytext()));} 
")"                            {return new Symbol(CaracterCodigo.Tk_Cerrar,yychar,yyline,new String(yytext()));} 

/*
*
*Operaciones logicas
*
*/

"!!"                           {return new Symbol(CaracterCodigo.Tk_Not,yychar,yyline,new String(yytext()));} 
"||"                           {return new Symbol(CaracterCodigo.Tk_Or,yychar,yyline,new String(yytext()));} 
"??"                           {return new Symbol(CaracterCodigo.Tk_xOr,yychar,yyline,new String(yytext()));} 
"%%"                           {return new Symbol(CaracterCodigo.Tk_And,yychar,yyline,new String(yytext()));} 

/*
*
*Componentes Generales
*
*/

"\""                           {return new Symbol(CaracterCodigo.Tk_Comillas,yychar,yyline,new String(yytext()));}
"["                            {return new Symbol(CaracterCodigo.Tk_Open,yychar,yyline,new String(yytext()));}
"]"                            {return new Symbol(CaracterCodigo.Tk_Close,yychar,yyline,new String(yytext()));}
","                            {return new Symbol(CaracterCodigo.Tk_Coma,yychar,yyline,new String(yytext()));}
"="                            {return new Symbol(CaracterCodigo.Tk_Igual,yychar,yyline,new String(yytext()));}
"imprimir"                     {return new Symbol(CaracterCodigo.Tk_print,yychar,yyline,new String(yytext()));}
"mientras"                     {return new Symbol(CaracterCodigo.Tk_mientras,yychar,yyline,new String(yytext()));}
"true"                         {return new Symbol(CaracterCodigo.Tk_true,yychar,yyline,new String(yytext()));}
"false"                        {return new Symbol(CaracterCodigo.Tk_false,yychar,yyline,new String(yytext()));}
":"                            {return new Symbol(CaracterCodigo.Tk_Dosp,yychar,yyline,new String(yytext()));}


/*
*
*Palabras Reservadas de Visibilidad
*
*/

"publico"                     {return new Symbol(CaracterCodigo.Tk_public,yychar,yyline,new String(yytext()));} 
"privado"                     {return new Symbol(CaracterCodigo.Tk_private,yychar,yyline,new String(yytext()));} 
"protegido"                   {return new Symbol(CaracterCodigo.Tk_protect,yychar,yyline,new String(yytext()));} 


/*
*
*Caracter de Asignacion
*
*/

"::="                        {return new Symbol(CaracterCodigo.Tk_Asig,yychar,yyline,new String(yytext()));} 
";"                          {return new Symbol(CaracterCodigo.Tk_puntoComa,yychar,yyline,new String(yytext()));} 


/*
*
*Importaciones
*
*/


"importar"                   {return new Symbol(CaracterCodigo.Tk_import,yychar,yyline,new String(yytext()));} 

/*
*
*clases y herencia
*
*/

"clase"                     {return new Symbol(CaracterCodigo.Tk_clase,yychar,yyline,new String(yytext()));} 
"heredar"                   {return new Symbol(CaracterCodigo.Tk_heredar,yychar,yyline,new String(yytext()));} 

/*
*
*Metodo super
*
*/

"super"                   {return new Symbol(CaracterCodigo.Tk_Super,yychar,yyline,new String(yytext()));} 

/*
*
*Metodo Override
*
*/

"@override"             {return new Symbol(CaracterCodigo.Tk_Over,yychar,yyline,new String(yytext()));} 

/*
*
*Metodo Declaracion Asignacion
*
*/

"nuevo"                {return new Symbol(CaracterCodigo.Tk_new,yychar,yyline,new String(yytext()));} 

/*
*
*Metodos y Funciones
*
*/

//En espera


/*
*
*Metodo Retornar
*
*/

"retornar"           {return new Symbol(CaracterCodigo.Tk_return,yychar,yyline,new String(yytext()));} 

/*
*
*Metodo Principal
*
*/

"Principal"          {return new Symbol(CaracterCodigo.Tk_Firts,yychar,yyline,new String(yytext()));} 

/*
*
*Metodo Constructor
*
*/

//En espera

/*
*
*
*Sentencias de Control
*
*/

"SI"                     {return new Symbol(CaracterCodigo.Tk_Si,yychar,yyline,new String(yytext()));} 
"SINO_SI"                {return new Symbol(CaracterCodigo.Tk_SiNoSi,yychar,yyline,new String(yytext()));} 
"SINO"                   {return new Symbol(CaracterCodigo.Tk_SiNo,yychar,yyline,new String(yytext()));} 
"INTERRUMPIR"            {return new Symbol(CaracterCodigo.Tk_Inter,yychar,yyline,new String(yytext()));} 
"CASO"                   {return new Symbol(CaracterCodigo.Tk_Caso,yychar,yyline,new String(yytext()));} 
"DEFECTO"                {return new Symbol(CaracterCodigo.Tk_Defec,yychar,yyline,new String(yytext()));} 
"MIENTRAS"               {return new Symbol(CaracterCodigo.Tk_Mientras,yychar,yyline,new String(yytext()));} 
"HACER"                  {return new Symbol(CaracterCodigo.Tk_Hacer,yychar,yyline,new String(yytext()));} 
"CONTINUAR"              {return new Symbol(CaracterCodigo.Tk_Continuar,yychar,yyline,new String(yytext()));} 
"SALIR"                  {return new Symbol(CaracterCodigo.Tk_Exit,yychar,yyline,new String(yytext()));} 

/*
*
*
*
*/


{Lt}({Lt}|{Dg})*              {return new Symbol(CaracterCodigo.Tk_name,yychar,yyline,new String(yytext()));}
({Dg})*                       {return new Symbol(CaracterCodigo.Tk_Puntos,yychar,yyline,new String(yytext()));}
.                             {return new Symbol(CaracterCodigo.Tk_Error,yychar,yyline,new String(yytext()));}

