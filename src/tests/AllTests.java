package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.binaryarithmetic.CompareBinToHexTests;

@RunWith(Suite.class)
@SuiteClasses({ 
	SearchFindMatchTests.class, 
	SearchBinaryTests.class,
	SortsTests.class, 
	PairsTests.class,
	PermutationTests.class,
	CompareBinToHexTests.class})

public class AllTests {

}
