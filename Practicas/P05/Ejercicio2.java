import java.io.*;
public class Ejercicio2{
    public static void main(String[] args){
        int tam;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);
        
        System.out.println("ingresa el tamño del arreglo:");
        tam = Integer.parseInt(flujoE.readLine());
        
        int[] a = new int[tam];
        
        int i = 0;
        
        System.out.println("Introducir los valores del arreglo");
        for (i =0; i < tam; i++) {
            System.out.println("["+ i +"] = ");
            a[i] = Integer.parseInt(flujoE.readLine());
        }
    }
}
