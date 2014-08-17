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
public class SearchBinaryParameterized {

	 @Parameters(name = "{index}: binary({0}, {1}) expected={2}")
	 public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	                 { new int[] {1, 2, 3, 4}, 3, 2 },
	                 {new int[] {1, 2, 3, 4}, 4, 3 },
	                 {new int[] {1, 2, 3, 4}, 1, 0 },
	                 {new int[] {1, 2, 3, 4, 8}, 5, -1},
	                 
 
	           });
	    }
	
	 private int[] values;
	 private int key;
	 private int expected;
	 
	 public SearchBinaryParameterized(int[] values, int key, int expected){
		 this.values = values;
		 this.key = key;
		 this.expected = expected;
	 }
	 
	 @Test
		public void canUseBinarySearch() {
			Search search = new Search();
			int res = search.binary(values, key);
		    assertEquals("Result", expected, res);
		}
}
