import java.io.*;
public class CValorAscii {
public static void main(String[] args){
char[] cadena = new char[80];
int car, i = 0;
System.out.println("Escriba una cadena de caracteres:");
while((car = System.in.read)) != '\r' && i < cadena.length;
{
cadena[i++] = (char) car;
}
i = 0;
do {
System.out.println("Caracter = " + cadena[i] + "Codigo ASCII = " + (int)cadena[i]);
}while(i < cadena.length && cadena[i] != '\0');
}
} 