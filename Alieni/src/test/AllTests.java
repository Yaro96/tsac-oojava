package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.alieni.AlienoTest;
import test.alieni.GiocatoreTest;
import test.alieni.GiocoTest;

@RunWith(Suite.class)
@SuiteClasses({ AlienoTest.class, GiocatoreTest.class, GiocoTest.class })
public class AllTests {

}
