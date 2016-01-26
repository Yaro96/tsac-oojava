package videoteca;

public class Film {

	private String titolo;
	private String regista;
	private int anno;
	private String[] attoriPrinicipali;
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public String[] getAttoriPrinicipali() {
		return attoriPrinicipali;
	}
	public void setAttoriPrinicipali(String[] attoriPrinicipali) {
		this.attoriPrinicipali = attoriPrinicipali;
	}
	
	public double getCostoNoleggio(int giorniNoleggio){
		return 0;
	}
}
