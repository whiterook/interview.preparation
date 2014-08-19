package com.splotnikov.algorithms.sort;
import com.splotnikov.utils.Utils;

public class Quick {

	
	public static void sort(Comparable[] theArray){
		sort(theArray, 0, theArray.length - 1);
	}
	
	private static void sort(Comparable[] theArray, int lo, int hi){
		if(lo >= hi) 
			return;
		int pivotIndex = portion(theArray, lo, hi);
		sort(theArray, lo, pivotIndex - 1);
		sort(theArray, pivotIndex + 1, hi);		
	}
	
	
	private static int portion(Comparable[] theArray, int lo, int hi){
		Comparable pivot = theArray[lo];
		int i = lo;
		int j = hi + 1;
		while(true){
			while(Utils.less(theArray[++i], pivot) && (i < hi))
				;
			while(Utils.less(pivot, theArray[--j]) && (j > lo))
				;
			if(i >= j) break;
			Utils.swap(theArray, i, j);
		}
		Utils.swap(theArray, lo, j);
		return j;
	}
	
	
	
}
