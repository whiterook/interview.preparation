package com.splotnikov.algorithms.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.splotnikov.algorithms.sort.Quick;
import com.splotnikov.utils.Utils;


public class QuickSortTests {

	@Test
	public void PerformQuickSort(){
		Integer[] theArray = new Integer[] {6, 10, 13, 5, 8, 3, 2, 11};
		Quick.sort(theArray);
		boolean isSorted = Utils.isSorted(theArray);
		assertEquals("Result", true, isSorted);
	}
	
}
