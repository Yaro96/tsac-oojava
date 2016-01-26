package test.alieni;

import static org.junit.Assert.*;

import org.junit.Test;

import alieni.*;


public class GiocoTest {

	@Test
	public void test() {
		Gioco game=new Gioco(new Giocatore("player", 100));
		Alieno marziano=new Alieno("marziano", 15);
		Alieno tank=new Alieno("tank", 75);
		boolean vivo=game.isAlive(new Alieno[]{marziano,tank});
		assertEquals(true, vivo);
	}

}
