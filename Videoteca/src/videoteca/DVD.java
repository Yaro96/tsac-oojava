package videoteca;

public class DVD {

	public double getCostoNoleggio(int giorniNoleggio){
		if(giorniNoleggio<=2)
			return 1.5*giorniNoleggio;
		else 
			return 3+2*(giorniNoleggio-2);
	}
}
