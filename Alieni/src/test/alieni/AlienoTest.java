package test.alieni;

import static org.junit.Assert.*;

import org.junit.Test;

import alieni.Alieno;

public class AlienoTest {

	@Test
	public void test() {
		Alieno a=new Alieno("marziano",15);
		assertEquals(15, a.getDanno());
	}

}
