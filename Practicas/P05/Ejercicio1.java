
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, i, numImpares;
        int suma = 0, media;


        System.out.print("Ingrese numeros: ");
            num = sc.nextInt();
        if(num%2==0){  
             System.out.println(num +" es par");  
        }else{  
                       
            int[] numeros = new int[numImpares = 0]; 
        
            for (i = 0; i < numeros.length; i++) {
                System.out.print("Numeros impares " + (i + 1) + " Media: ");
                numeros[i] = sc.nextInt();
            }
        
            for (i = 0; i < numeros.length; i++) {
                suma = suma + numeros[i];
            }

        
            media = suma / numeros.length;

        
            System.out.printf("La media de los numeros: %.2f %n", media);

        
            System.out.println("Numeros superiores a la media: ");
            for (i = 0; i < numeros.length; i++) {
                if (numeros[i] > media) {
                    System.out.println("Numeros Impares " + (i + 1)+ " Media: " + numeros[i]);
                }
            }
        }
    }
}
