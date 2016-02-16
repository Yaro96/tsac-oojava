package main.harbour;

public class Invasore{
	
	String id;
	String modello;
	
	public void setId(String string) {
		id=string;
	}
	
	public void setModello(String string) {
		modello=string;
	}
	
	public String getId() {
		return id;
	}

	public String getModello() {
		return modello;
	}

	public int potenzaFuoco(){
		return 0;
	}

}