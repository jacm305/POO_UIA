public Punto{
	
	private double x,y;
	public Punto(doule cx, doublecy){
	x = cx; y = cy;
	}
}

	public Circulo{
	private Punto centro;
	private double radio;


	public Circulo() {}

	protected msgEsNEgativo(){
		System.ot.println("El radio es negativo, Se convierte a postivo")
	}
	public Circulo (double cx, double cy, double cr){

	centro = new Punto(cx, cy);
	if (r < c) {
		msgEs NEgativo();
		radio = -cr;	

		}

	}


	public double LongCircunferencia(){

	return  2 * Math.PI * radio;

	}

	public double AreaCirculo(){

	return Math.PI * radio * radio;
	}

	public Test {

		public static main (String[] args) {
			Circulo obj1 = new Circulo ();
			System.out.println(obj1.LongCircunferencia() );
			System.out.println(obj1.AreaCirculo() );
		}


	}

}