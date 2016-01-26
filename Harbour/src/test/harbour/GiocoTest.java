package test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import harbour.Aereo;
import harbour.Gioco;
import harbour.Invasore;
import harbour.Porto;
import harbour.Sottomarino;

public class GiocoTest {

	@Test
	public void test() {
		Porto p=new Porto();
		p.setMetriQuadri(140);
		
		Sottomarino s=new Sottomarino();
		s.setNumeroArmamenti(2);
		s.setStazza(10);
		s.setIndiceP();
		
		Aereo a=new Aereo();
		a.setNumeroArmamentiAlpha(3);
		a.setNumetoArmamentiBeta(2);
		a.setIndiceP();
		
		Gioco g=new Gioco();
		g.setPorto(p);
		g.setInvasori(new Invasore[]{a,s});
		
		g.attacco();

		assertEquals(true,g.isDistrutto());
		assertEquals(-10,p.getMetriQuadri(),0);
	}

}
