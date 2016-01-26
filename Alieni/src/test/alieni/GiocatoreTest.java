package test.alieni;

import static org.junit.Assert.*;

import org.junit.Test;

import alieni.Giocatore;
public class GiocatoreTest {

	@Test
	public void test() {
		Giocatore g=new Giocatore("player",100);
		assertEquals(100, g.getSalute());
	}

}
