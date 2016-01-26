package harbour;

public class Gioco {

	Porto porto;
	Invasore[] invasori;
	
	public Porto getPorto() {
		return porto;
	}

	public void setPorto(Porto porto) {
		this.porto = porto;
	}

	public Invasore[] getInvasori() {
		return invasori;
	}

	public void setInvasori(Invasore[] invasori) {
		this.invasori = invasori;
	}

	public void attacco(){
		for(int i=0;i<invasori.length;i++){
			porto.setMetriQuadri(porto.getMetriQuadri()-(invasori[i].getIndiceP()*1.5));
		}
	}
	
	public boolean isDistrutto(){
		return porto.getMetriQuadri()<=0;
	}
	
}

