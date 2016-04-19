class Area{

	private double largo, ancho, alto;
	public Medidas(double ml, double ma, double mal){
		largo = ml; ancho = ma; alto = mal;
	}
}                       


class Plafon{

	private Area res1;
	//private double ;

	public Plafon(){
	}

	protected void msgMedidaErronea(){
		System.out.println("Ingresa una medida correcta");
	}

	public Plafon (double ml, double ma){

		res1 = new Area (ml, ma);

		if (ml < 0 && ma < 0){
			msgMedidaErronea();
			ml = -ml;
			ma = -ma;
		}

		Resultado = ml * ma;
	}

} 


class Muro{

	private Area res2;

	public Muro(){
	}

	protected void msgMedidaErronea(){
	System.out.println("Ingresa un digito correcto");	
	}

	public Muro (double ml, double mal){

		res2 = new Medidas (ml, mal);

		if (ml < 0 && mal < 0){
			msgMedidaErronea();
			ml = -ml;
			ma = -mal;
		}

		Resultado = ml * mal;
	}

} 

class Materiales{

	private lista ;
	private double colgante, amarre, canaleta, liston, angulo, tabr, ps1;
	private double rdmx, cinta;


	public Materiales(){
		
	}

	protected msgIngresaUnaMedida(){
		System.out.println("Ingresa una  Medida");
	}
	protected msgLosMAterialesSon(){
		System.out.println("Los Materiales que requieres para tu proyecto son:");
	}
	public Materiales (double col, double arr, double can, double lis, double ang, double tr, double s1){
		lista = new Muro (res2);
	if ( res2 < 0) {
		msgIngresaUnaMedida();
	}else

	


	}





	}

	}

		return Resultado //para 1m2 de tablaroca se necesita
					    //

	}
}