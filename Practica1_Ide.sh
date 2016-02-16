#!/bin/bash
#scrip creado para copilar el cup y flex del proyecto


while ["$numero" !=3 ]
do
echo "Bienvenido que archivo desea copilas"
echo "1.-ArchivoXML "
echo "2.-ArchivoCodigo"
echo "3.- Salir"
read -p "Seleccione una Opcion[1-3]" numero 
case $numero in
#opcion de XML
1)
clear
echo "entro en Configuracion";
echo "Que desea copilar"
echo "1.- Jflex"
echo "2.- Cup"
read -p "Seleccione una Opcion[1-3]" numero2
case $numero2 in 

1)
echo "entro en Jlfex";

cd /home/enrique/NetBeansProjects/Ppractica2016_200915715/src/ArchivosXml
jflex LexicoXml.flex

read numero2;;

2)

echo "entro en Cup";
cd /home/enrique/NetBeansProjects/Ppractica2016_200915715/src/ArchivosXml
cup -parser ParseXml -symbols CaracterXml SemanticoXml.cup

read numero2;;
esac

echo "Precio una tecla para continuar...";
read numero;;

#opcion del Codigo
2)
echo "entro en  Codigo";

echo "Que desea copilar"
echo "1.- Jflex"
echo "2.- Cup"
read -p "Seleccione una Opcion[1-3]" numero2
case $numero2 in 
1)
cd /home/enrique/NetBeansProjects/Ppractica2016_200915715/src/ArchivosCodigo 
jflex  LexicoCodigo.flex
echo "entro en Jlfex";
read numero2;;
2)
cd /home/enrique/NetBeansProjects/Ppractica2016_200915715/src/ArchivosCodigo
cup -parser ParseCodigo -symbols CaracterCodigo SemanticoCodigo.cup


echo "entro en Cup";
read numero2;;
esac




echo "Precio una tecla para continuar...";
read numero;;
3) exit 0;;

*)
echo "Ingrese solo 1 o 3";
echo "Precio una tecla para continuar...";
read numero;;

esac
done

