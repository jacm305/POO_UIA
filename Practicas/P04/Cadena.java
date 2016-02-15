import java.util.Scanner;

public class Cadena {

	public static void main(String[] args) {

		String cadena="";
		String cadenaAuxiliar="";
		int contador=1;

		Scanner teclado=new Scanner(System.in);

		System.out.println("Introduce la cadena");
				cadena=teclado.nextLine();
				cadena=cadena.toUpperCase();

		int longitud=cadena.length()-1;


		System.out.print(cadena);

			for (int c=longitud;c>=0;c--,contador++){

					cadenaAuxiliar="";

		int contador2=cadena.length()-1;

				for (int s=0;s<contador;s++,contador2--){

						cadenaAuxiliar=cadena.charAt(contador2)+cadenaAuxiliar;
					}

						for (int s=0;s<c;s++,contador2--){

								cadenaAuxiliar=cadenaAuxiliar+cadena.charAt(s);

				}

						System.out.print("-"+cadenaAuxiliar \n);
			}

	}
}
