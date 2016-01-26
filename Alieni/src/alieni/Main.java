package alieni;
public class Main {

	public static void main(String[] args) {

		Gioco game=new Gioco(new Giocatore("Freeman", 100));
		Alieno zombie=new Alieno("zombie", 15);
		Alieno tank=new Alieno("tank", 75);
		boolean vivo=game.isAlive(new Alieno[]{zombie,tank});
		System.out.println(vivo);
	}

}
