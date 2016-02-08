package ArchivosXml;

import java.io.*;
import java_cup.runtime.Symbol;

%%
%cupsym CaracterXml
%class ArchivosXml
%public
%full
%char
%line
%cup
%ignorecase
%unicode
Lt=[a-zA-ZÑñ_]
Dg=[0-9]
Luga=(["/"]([a-zA-ZÑ_]))([A-Za-z0-9]|["_"]|["-"]|["/"]|[":"]|["\\"]|["."])*
%%


/*
*
*Elementos de los archivos XML 
*
*/



"<"                          {return new Symbol(CaracterXml.Tk_Abrir,yychar,yyline,new String(yytext()));}
">"                          {return new Symbol(CaracterXml.Tk_Cerrar,yychar,yyline,new String(yytext()));}
"/"                          {return new Symbol(CaracterXml.Tk_Diag,yychar,yyline,new String(yytext()));}
"\""                         {return new Symbol(CaracterXml.Tk_Comillas,yychar,yyline,new String(yytext()));}
"-"                          {return new Symbol(CaracterXml.Tk_Guion,yychar,yyline,new String(yytext()));}
/*
*
* Palabras reservadas a utilizar en la estructura XML
*
*/

"proyecto"                  {return new Symbol(CaracterXml.Tk_Proy,yychar,yyline,new String(yytext()));}
"nombre"                    {return new Symbol(CaracterXml.Tk_Name,yychar,yyline,new String(yytext()));}
"fecha_creacion"            {return new Symbol(CaracterXml.Tk_Date,yychar,yyline,new String(yytext()));}
"archs"                     {return new Symbol(CaracterXml.Tk_Arch,yychar,yyline,new String(yytext()));}
"archivo"                  {return new Symbol(CaracterXml.Tk_Files,yychar,yyline,new String(yytext()));}
"ruta"                      {return new Symbol(CaracterXml.Tk_Ruta,yychar,yyline,new String(yytext()));}


/*
*
* Elementos Globales
*
*/

{Lt}({Lt}|{Dg})*              {return new Symbol(CaracterXml.Tk_Cont,yychar,yyline,new String(yytext()));}
{Luga}                        {return new Symbol(CaracterXml.Tk_Luga,yychar,yyline,new String(yytext()));}
{Dg}{Dg}{Dg}{Dg}              {return new Symbol(CaracterXml.Tk_Year,yychar,yyline,new String(yytext()));}
{Dg}{Dg}                      {return new Symbol(CaracterXml.Tk_Dia,yychar,yyline,new String(yytext()));}
{Lt}*                         {return new Symbol(CaracterXml.Tk_Mes,yychar,yyline,new String(yytext()));}
({Dg})*                       {return new Symbol(CaracterXml.Tk_Puntos,yychar,yyline,new String(yytext()));}
[  \t\r\f\n]+                 {}
.                             {return new Symbol(CaracterXml.Tk_Error,yychar,yyline,new String(yytext()));}