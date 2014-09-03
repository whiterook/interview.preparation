package com.splotnikov.algorithms.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.splotnikov.algorithms.sort.Insertion;
import com.splotnikov.algorithms.sort.Merge;
import com.splotnikov.algorithms.sort.Quick;
import com.splotnikov.utils.Utils;

@RunWith(Parameterized.class)
public class SortsTests {

	 private Integer[] values;
	
	 @Parameters(name = "{index}: Quick.sort({0})")
	 public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	                 { new Integer[] {6, 10, 13, 5, 8, 3, 2, 11}},	                 
	                 { new Integer[] {1, 2, 7, 8, 8, 10, 12, 15}},
	                 { new Integer[] {21, 2, 7, 8, 8, 10, 12, 21}}
	           });
	    }
	
	public SortsTests(Integer[] values){
		this.values = values;
	}
	 
	@Test
	public void quickSortTest(){
		Utils.shuffle(values);
		Quick.sort(values);
		boolean isSorted = Utils.isSorted(values);
		assertEquals("Result", true, isSorted);
	}
	
	@Test
	public void insertionSortTest(){
		Utils.shuffle(values);
		Insertion.sort(values);
		boolean isSorted = Utils.isSorted(values);
		assertEquals("Result", true, isSorted);
	}
	
	@Test
	public void mergeSortTest(){
		Utils.shuffle(values);
		Utils.printArray(values);
		Merge.sort(values);
		Utils.printArray(values);
		boolean isSorted = Utils.isSorted(values);
		assertEquals("Result", true, isSorted);
	}
	
}
