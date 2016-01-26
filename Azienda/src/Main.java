import Bershadskyy.Yaroslav.azienda.*;

public class Main {

	public static void main(String[] args) {
		Dipendente steve=new Dipendente("Steve", "Jobs", 25, 
				new Contratto("CEO", 1000000));
		Dipendente alice=new Dipendente("Alice", "Smith", 5, 
				new Contratto("Segretary", 200000));
		Dipendente bob=new Dipendente("Bob", "Black", 2, 
				new Contratto("Programmer", 250000));

		Azienda apple=new Azienda("S.r.l.", new Dipendente[]{steve,alice,bob});
		
		GestioneContabile contabileApple=new GestioneContabile(apple);
		System.out.println("Somma stipendi(in centesimi): "+contabileApple.sommaStipendi());
		contabileApple.elencoStipendioMassimo(250000);
		Dipendente max=contabileApple.dipendentiMaxStipendi();
		System.out.println("\nDipendente con stipendio massimo");
		System.out.println(max.getNome()+"\t"+max.getCognome()+"\t"+max.calcoloStipendio());
		
	}

}
