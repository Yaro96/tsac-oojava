package videoteca;

public class Main {

	public static void main(String[] args) {
		
		double tot=0;
		
		Cassetta c=new Cassetta();
		tot+=c.getCostoNoleggio(3);
		
		DVD d=new DVD();
		tot+=d.getCostoNoleggio(3);
		
		BluRay b=new BluRay();
		tot+=b.getCostoNoleggio(5);
		
		System.out.println(tot);

	}

}
