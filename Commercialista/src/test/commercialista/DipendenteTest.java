package test.commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

import commercialista.Dipendente;

public class DipendenteTest {

	@Test
	public void test() {
		Dipendente d=new Dipendente();
		assertEquals(50,d.getParcella(),0.001);
	}

}
