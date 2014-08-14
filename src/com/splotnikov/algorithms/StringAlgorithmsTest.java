package com.splotnikov.algorithms;

import org.junit.Test;

import junit.framework.TestCase;

public class StringAlgorithmsTest extends TestCase {

	@Test
	public void testFindMatch() {
		StringAlgorithms stringAlgorithms = new StringAlgorithms();
		int res = stringAlgorithms.findMatch("si", "Geisinger");
	    assertEquals("Result", 3, res);
	}

}
