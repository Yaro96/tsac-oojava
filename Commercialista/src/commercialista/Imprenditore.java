package commercialista;

public class Imprenditore extends LiberoProfessionista{

	private String ragSociale;
	
	public String getRagSociale() {
		return ragSociale;
	}

	public void setRagSociale(String ragSociale) {
		this.ragSociale = ragSociale;
	}

	@Override
	public double getParcella() {
		if(getNumFatture()<=100)
			return 500;
		else
			return 500+getNumFatture()-100;
	}
}
