public class CalcularMaterialesGrandes extends Materiales{
	private double preciopintura,preciocinta,preciotablaroca,aux1;
	private double cubrelitropintura,cubrecinta,pliegotablaroca;

	public CalcularMaterialesGrandes(){
		super(14,20);
		preciopintura=150;
		preciocinta=50;
		preciotablaroca=290;
		cubrelitropintura=10;
		cubrecinta=30;
		pliegotablaroca=0.38;
	}

	public void calcularPintura(){
		if(resultado>=cubrelitropintura){
			System.out.println("tu Superficie es: "+ resultado +" m2");
				aux1 = (resultado / cubrelitropintura);
				aux1 = aux1*2;
				System.out.println("Nesesitas: "+ aux1 + " litros de Pintura" );
			
		}else{
			System.out.println("tienes que cubrir son: "+ resultado+" m2 y un blitro cubre"+cubrelitropintura);

		}
	}	
		public void calcularTablaroca(){
			aux1=resultado*pliegotablaroca;
			aux1=aux1/1;
			System.out.println("Nesesitas: "+ aux1 + " m2 de Tablaroca" );
		}
}