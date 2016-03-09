int = a, b, suma;

system.out.printl("ingrega el valor del primer digito");
scanner =a;
system.out.printl("ingresa el valor del segundo digito");
scanner=b;
if(a<b){
	
	suma = a+b;
	if (a>b){
	a=b;
	b=a;

	} else {
		suma = a+b;
			System.out.printl("La suma es:" + suma);
	}
}