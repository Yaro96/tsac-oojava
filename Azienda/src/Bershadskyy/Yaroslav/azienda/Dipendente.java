package Bershadskyy.Yaroslav.azienda;

public class Dipendente {

	String nome;
	String cognome;
	int anzianita;
	Contratto contratto;
	
	public Dipendente(String name, String surname, int seniority, Contratto contract){
		nome=name;
		cognome=surname;
		anzianita=seniority;
		contratto=contract;
	}
	
	public int calcoloStipendio(){
		int stipendio=contratto.getStipendioBase()+((contratto.getStipendioBase()/200)*anzianita);
		return stipendio;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnzianita() {
		return anzianita;
	}

	public void setAnzianita(int anzianita) {
		this.anzianita = anzianita;
	}

	public Contratto getContratto() {
		return contratto;
	}

	public void setContratto(Contratto contract) {
		this.contratto = contract;
	}

}
