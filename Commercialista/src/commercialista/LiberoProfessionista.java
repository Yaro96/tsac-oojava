package commercialista;

public class LiberoProfessionista extends Cliente{

	private String piva;
	private int numFatture;
	
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public int getNumFatture() {
		return numFatture;
	}
	public void setNumFatture(int numFatture) {
		this.numFatture = numFatture;
	}
	
	@Override
	public double getParcella() {
		// TODO Auto-generated method stub
		return 50+0.5*numFatture;
	}
	
}
