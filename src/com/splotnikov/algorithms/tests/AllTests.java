package com.splotnikov.algorithms.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{ SearchFindMatchParameterized.class, 
		  SearchBinaryParameterized.class,
		  QuickSortTests.class
		  })
public class AllTests {

}
