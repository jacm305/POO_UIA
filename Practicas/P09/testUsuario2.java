public class testUsuario2{

	public static void main(String[] args){

	Scanner leer = new Scanner(System.in);
	registro t[] = new registro[3];

	String nombre = " ";
	int telefono = 0;
	String direccion = " ";
	String mail = " ";
	String nickname = " ";
	int fechadenacimiento = 0;


	for (int i=0; i<a.length; i++){
		System.out.println("Ingresa tu Nombre");
		nombre = leer.netxLine();
		System.out.println("Ingresa tu telefono");
		nombre = leer.netxInt();
		System.out.println("Ingresa tu direccion");
		nombre = leer.netxLine();
		System.out.println("Ingresa tu mail");
		nombre = leer.netxLine();
		System.out.println("Ingresa tu nickname");
		nombre = leer.netxLine();
		System.out.println("Ingresa tu fecha de nacimiento");
		nombre = leer.netxInt();
		leer.netxLine();

		t[i] = new testUsuario2(nombre, telefono, direccion, mail, nickname, fechadenacimiento);
		}

		for (int i=0; i<t.length; i++){

			System.out.println(t[i].getNom()+ " "+ t[i].getTel()+" "+t[i].getDir()+" "+t[i].getMl()+" "+t[i].getNick()+" "+t[i]getFecha());
		}
	}
}	