package Bershadskyy.Yaroslav.azienda;

public class Azienda {

	String ragioneSociale;
	Dipendente[] dipendenti;
	
	public Azienda(String ragioneSociale, Dipendente[] dips){
		this.ragioneSociale=ragioneSociale;
		dipendenti=dips;
	}
	
	public String getRagSociale() {
		return ragioneSociale;
	}

	public void setRagSociale(String ragSociale) {
		this.ragioneSociale = ragSociale;
	}

	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
	
}
