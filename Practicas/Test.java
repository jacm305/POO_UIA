class Punto{
	
	private double x,y;
	public Punto(double cx, double cy){
	x = cx + 10; y = cy + 10;
	}
}

	class Circulo{
	private Punto centro;
	private double radio;


	public Circulo()
	 {
		centro = new Punto(0,0);
		radio = 1;
	}

	protected void msgEsNegativo(){
		System.out.println("El radio es negativo, Se convierte a postivo");
	}
	public Circulo (double cx, double cy, double cr){  // constructor 

	centro = new Punto(cx, cy);
	if (cr < 0) {
		msgEsNegativo();
		cr = -cr;	

		}

		radio = cr;

	}


	public double LongCircunferencia(){

	return  2 * Math.PI * radio;

	}

	public double AreaCirculo(){

	return Math.PI * radio * radio;
	}

	class Test {

		public static  void main (String[] args) {
			Circulo obj1 = new Circulo ();
			System.out.println(obj1.LongCircunferencia() );
			System.out.println(obj1.AreaCirculo() );
		}


	}

}