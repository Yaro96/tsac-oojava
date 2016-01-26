package videoteca;

public class BluRay {

	public double getCostoNoleggio(int giorniNoleggio){
		if(giorniNoleggio<=1)
			return 1;
		else 
			return penale(1,giorniNoleggio-1);
	}
	
	public double penale(double costoNoleggio,int giorniNoleggio){
		if(giorniNoleggio<=0)
			return costoNoleggio;
		else
			return penale(costoNoleggio+(costoNoleggio/10),giorniNoleggio-1);
	}
}
