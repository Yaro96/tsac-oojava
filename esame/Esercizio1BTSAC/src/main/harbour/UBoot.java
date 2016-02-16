package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class UBoot extends Invasore{

	private int armaK;
	private int armaH;
	
	public void setArmaK(int i) {
		armaK=i;
	}

	public void setArmaH(int i) {
		armaH=i;
	}
	
	public int potenzaFuoco(){
		return 20*armaK+30*armaH;
	}
	
}