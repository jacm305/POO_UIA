public class Ejercicio1
{
	public static void main (String [] args)
	{
		int a = 10, b = 3, c = 1;
		int x, y, d, e; // para resolver la operacion la variable debe de ser del mismo tipo 
		Boolean c1; // darle una variable diferente a ña qie ua esta declaradade
		double resultado;		
		
		x = a / b;

		System.out.println("El resultado es;" + x);

		c1 = a < b && c < a;

		System.out.println("El resultado es:" + c1);

		d = a + b++;

		System.out.println("El resultado es:" + a);

		e = ++a - b;

		System.out.println("El resultado es:" + e);
		
		y = a / b; //primero se realiza la operacion 

		resultado = (float) y; // se declara una variable aparte en double y se hace la convercion a float 

		System.out.println("El resultado es:" + resultado);
	}
}