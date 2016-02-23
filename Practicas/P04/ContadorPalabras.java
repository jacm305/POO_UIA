import java.io.*;

  public class ContadorPalabras
{
  public static void main(String[] args) 
 {
  final char eof = (char) - 1;
  char car;
  boolean palabra = false;
  int ncaracteres = 0, npalabras = 0, nlineas = 0;
 
  try
  {
   System.out.println("Introducir texto. " + "Pulse [Enter] despues de cada linea.");
   System.out.println("Para finalizar pulsar Ctrl+z.\n");
   
   while ((car = (char)System.in.read()) != eof)
   {
    //[Enter] = CRLF = \r\n
    if (car == '\r') continue; //Le sigue un \n
    ncaracteres++; //Contador de caracteres
   
    //Elimina blancos, tabuladores y finales de linea entre palabras
    if (car == ' ' || car == '\n' || car == '\t')
    palabra  = false;
    else if (!palabra)//comienza una palabra
    {
     npalabras++; //contador de palabras
     palabra = true;
    }
    if (car == '\n')//Finaliza una linea
     nlineas++;
   }
   System.out.println();
   System.out.println(ncaracteres + " " + npalabras + " " + nlineas);
  }
  catch(IOException ignorada){}
 }   
}