package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {

	AeroPorto porto;
	
	public Gioco(AeroPorto p) {
		porto=p;
	}

	public void attacco(Invasore[] invasoriA) {
		int sommaPotenza=0;
		for(int i=0;i<invasoriA.length;i++){
			sommaPotenza+=invasoriA[i].potenzaFuoco();
		}
		porto.addMetriQuadriDistrutti(sommaPotenza*2.5);
	}

	public boolean portoDistrutto() {
		if(porto.getDimensioneSqMetersNonDistrutta()>0)
			return false;
		else 
			return true;
	}

}
