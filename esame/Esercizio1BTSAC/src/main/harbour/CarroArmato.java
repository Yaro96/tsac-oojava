package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class CarroArmato extends Invasore{
	
	private int missili;
	private int stazza;
	
	public void setMissili(int missili) {
		this.missili = missili;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	
	
	public int potenzaFuoco(){
		return (int)Math.round(((missili*stazza)/100.0)*30);
	}


}
