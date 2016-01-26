package videoteca;

public class Cassetta extends Film{

	public double getCostoNoleggio(int giorniNoleggio){
		if(giorniNoleggio<=1)
			return 1;
		else 
			return 1+2*(giorniNoleggio-1);
	}
}
