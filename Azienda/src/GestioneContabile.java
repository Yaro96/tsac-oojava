
public class GestioneContabile {

	Azienda azienda;
	
	public GestioneContabile(Azienda azienda) {
		this.azienda=azienda;
	}
	
	int sommaStipendi(){
		int somma=0;
		for(int i=0;i<azienda.dipendenti.length;i++){
			somma+=azienda.dipendenti[i].getStipendio();
		}
		return somma;
	}
	
	void elencoStipendioMassimo(int stipendioMassimo){
		System.out.println("\nStipendi piu' grandi di "+stipendioMassimo);
		for(int i=0;i<azienda.dipendenti.length;i++){
			if(azienda.dipendenti[i].getStipendio()>=stipendioMassimo)
				System.out.println(azienda.dipendenti[i].nome+"\t"+azienda.dipendenti[i].cognome+"\t"+azienda.dipendenti[i].getStipendio());
		}
	}
}
