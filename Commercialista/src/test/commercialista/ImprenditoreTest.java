package test.commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

import commercialista.Imprenditore;

public class ImprenditoreTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Imprenditore i=new Imprenditore();
		i.setNumFatture(99);
		assertEquals(500, i.getParcella());
		
		Imprenditore j=new Imprenditore();
		j.setNumFatture(101);
		assertEquals(501, j.getParcella());
	}

}
