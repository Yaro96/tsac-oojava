package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.commercialista.DipendenteTest;
import test.commercialista.ImprenditoreTest;
import test.commercialista.LiberoProfessionistaTest;

@RunWith(Suite.class)
@SuiteClasses({ DipendenteTest.class, ImprenditoreTest.class, LiberoProfessionistaTest.class })
public class AllTests {

}
