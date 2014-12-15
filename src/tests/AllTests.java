package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SearchFindMatchTests.class, SearchBinaryTests.class,
		SortsTests.class, PairsTests.class })
public class AllTests {

}
