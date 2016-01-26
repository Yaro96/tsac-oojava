package alieni;
public class Gioco {
	
	Giocatore player;
	
	public Gioco(Giocatore p){
		player=p;
	}
	
	public boolean isAlive(Alieno[] alieni){
		for(int i=0;i<alieni.length;i++){
			player.salute-=alieni[i].danno;
		}
		if(player.salute>0){
			System.out.println("Salute rimasta: "+player.salute);
			return true;
		}else{
			System.out.println("Il giocatore e' morto");
			return false;
		}
	}

}
