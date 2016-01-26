package harbour;

public class Aereo extends Invasore{

	private int numeroArmamentiAlpha;
	private int numetoArmamentiBeta;
	
	public int getNumeroArmamentiAlpha() {
		return numeroArmamentiAlpha;
	}
	public void setNumeroArmamentiAlpha(int numeroArmamentiAlpha) {
		this.numeroArmamentiAlpha = numeroArmamentiAlpha;
	}
	public int getNumetoArmamentiBeta() {
		return numetoArmamentiBeta;
	}
	public void setNumetoArmamentiBeta(int numetoArmamentiBeta) {
		this.numetoArmamentiBeta = numetoArmamentiBeta;
	}
	
	public void setIndiceP(){
		super.setIndiceP(numeroArmamentiAlpha*10+numetoArmamentiBeta*25);;
	}
	
	
}
