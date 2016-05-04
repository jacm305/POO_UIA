public class Cb extends Ca {
	
	private int z;

	public Cb () {

		super();
		z = 1;
	}

	public Cb ( int x, int y, int z ) {

		super( x, y );
		z = z;
	}

	public int Sumar( ) { return super.Sumar( ) + z;}
}