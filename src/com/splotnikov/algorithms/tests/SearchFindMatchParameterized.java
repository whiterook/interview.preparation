package com.splotnikov.algorithms.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.splotnikov.algorithms.search.Search;

@RunWith(Parameterized.class)
public class SearchFindMatchParameterized {

	
	 @Parameters(name = "{index}: findMatch({0}, {1}) expected={2}")
	 public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	                 { "aba", "dbababc", 2 },
	                 {"abc", "abcdef", 0},
	                 {"abc", "fghtabc", 4}
 
	           });
	    }
	
	private String pattern;
	private String text;
	private int expected;
	 
	public SearchFindMatchParameterized(String pattern, String text, 
			int expected) {
		this.pattern = pattern;
		this.text = text;
		this.expected = expected;
	}
	
	
	@Test
	public void canSearchPattern() {
		Search search = new Search();
		int res = search.findMatch(pattern, text);
	    assertEquals("Result", expected, res);
	}

}
