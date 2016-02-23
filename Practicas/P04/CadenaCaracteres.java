import java.util.Scanner;
import java.lang.*; //Se importa lang
public class CadenaCaracteres{
 
 public static void main(String... x)
 {
  Scanner palabra=new Scanner(System.in);
  String p="";
  p=palabra.next();
  int len = p.length();
  StringBuffer pala = new StringBuffer(len);
  for(int i=0; i<=(len-1);i++)
  {
   pala.append(p.charAt(i));
  }
  for(int i=0; i<=(len-1);i++)
  {
   
   String tmp = pala.substring(0,(len-1));
   pala.setCharAt(0,pala.charAt(len-1));
   pala.delete(1,len);
   pala.insert(1,tmp);
   System.out.println(pala.toString());
  }
 }
} 