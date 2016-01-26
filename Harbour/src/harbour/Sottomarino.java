package harbour;

public class Sottomarino extends Invasore{

	private int numeroArmamenti;
	private double stazza;
	
	public int getNumeroArmamenti() {
		return numeroArmamenti;
	}

	public void setNumeroArmamenti(int numeroArmamenti) {
		this.numeroArmamenti = numeroArmamenti;
	}

	public double getStazza() {
		return stazza;
	}

	public void setStazza(double stazza) {
		this.stazza = stazza;
	}

	public void setIndiceP(){
		super.setIndiceP(numeroArmamenti*stazza);
	}
}
