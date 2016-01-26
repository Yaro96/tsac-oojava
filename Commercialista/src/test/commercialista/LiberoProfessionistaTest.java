package test.commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

import commercialista.LiberoProfessionista;

public class LiberoProfessionistaTest {

	@Test
	public void test() {
		LiberoProfessionista l=new LiberoProfessionista();
		l.setNumFatture(15);
		assertEquals(57.5, l.getParcella(),0.001);
	}

}
