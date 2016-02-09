import java.util.Scanner;
public class Ejercicio3
{
	public static void main (String [] args)
	{
		
		int a, b;
		int resultado = 0;

		Scanner teclado = new Scanner (System.in);

		System.out.println("Ingrese primer numero:");
		a = teclado.nextInt();
        
        System.out.println("Ingrese segundo numero:");
		b = teclado.nextInt();

		if ( a%5 ==0 && b%5==0){

		 
		 	if (a < b){
		 		resultado=a+b;

				if(resultado>0){
					System.out.println ("El primer numero es menor que el segundo" + a);


					if (a > b){
						a=a+b;
						b=a-b;
						a=a-b;
						System.out.println("Los valores ya intercambiados son: a:" + a);
						System.out.println("Los valores ya intercambiados son:b:" + b);
						System.out.println("resultado de la suma es:" + resultado);
		
					}
			
				}
			}
		}	
		System.out.println("El resultado es:" + resultado);

	}
}
