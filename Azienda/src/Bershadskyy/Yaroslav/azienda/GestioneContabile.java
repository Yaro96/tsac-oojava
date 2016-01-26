package Bershadskyy.Yaroslav.azienda;
public class GestioneContabile {

	Azienda azienda;
	
	public GestioneContabile(Azienda azienda) {
		this.azienda=azienda;
	}
	
	public int sommaStipendi(){
		int somma=0;
		for(int i=0;i<azienda.dipendenti.length;i++){
			somma+=azienda.dipendenti[i].calcoloStipendio();
		}
		return somma;
	}
	
	public Dipendente dipendentiMaxStipendi(){
		Dipendente[] dips=azienda.getDipendenti();
		int max=0;
		int j=0;
		for(int i=0;i<dips.length;i++){
			if(dips[i].calcoloStipendio()>max){
				max=dips[i].calcoloStipendio();
				j=i;
			}
		}
		return dips[j];
	}
	
	public void elencoStipendioMassimo(int stipendioMassimo){
		System.out.println("\nStipendi piu' grandi di "+stipendioMassimo);
		for(int i=0;i<azienda.dipendenti.length;i++){
			if(azienda.dipendenti[i].calcoloStipendio()>=stipendioMassimo)
				System.out.println(azienda.dipendenti[i].getNome()+"\t"+azienda.dipendenti[i].getCognome()+"\t"+azienda.dipendenti[i].calcoloStipendio());
		}
	}
	
}
