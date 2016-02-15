import java.util.Scanner;
public class AdivinarNumero{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double num = Math.random() * 10; //es un metodo Math.random escoge un nuero entre el 1 y el 10
        int numero = (intc) num;
        int n =0;
        int valor = 0;
        do {
           System.out.print("\n * ADIVINA EL NUMERO QUE ESTOY PENSANDO *\n");
           System.out.print("\n * Introduce un valor:  ");
           valor = teclado.nextInt();
           if (valor > numero) {
               System.out.println("\n ¡Te has pasado!");
           }
           if (valor < numero) {
               System.out.println("\n ¡Te quedas corto!");
           }
           n++;
        }while (valor != numero);
 
        System.out.println("\n ¡Correcto! El número es: " + numero);
        System.out.println("\n Ocupaste : " + n + " Intentos");
    }
}