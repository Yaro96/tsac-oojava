
public class Dipendente {

	String nome;
	String cognome;
	int anzianita;
	Contratto contract;
	
	Dipendente(String name, String surname, int seniority, Contratto contratto){
		nome=name;
		cognome=surname;
		anzianita=seniority;
		contract=contratto;
	}
	
	int getStipendio(){
		int stipendio=contract.stipendio+((contract.stipendio/200)*anzianita);
		return stipendio;
	}
}
