package com.splotnikov.algorithms.sort;
import com.splotnikov.utils.Utils;

public class Quick {

	
	public static <T extends Comparable<T>> void sort(T[] values){
		sort(values, 0, values.length - 1);
	}
	
	private static <T extends Comparable<T>> void sort(T[] values, int lo, int hi){
		if(lo >= hi) 
			return;
		int pivotIndex = portion(values, lo, hi);
		sort(values, lo, pivotIndex - 1);
		sort(values, pivotIndex + 1, hi);		
	}
	
	
	private static <T extends Comparable<T>> int portion(T[] values, int lo, int hi){
		T pivot = values[lo];
		int i = lo;
		int j = hi + 1;
		while(true){
			while(Utils.less(values[++i], pivot) && (i < hi))
				;
			while(Utils.less(pivot, values[--j]) && (j > lo))
				;
			if(i >= j) break;
			Utils.swap(values, i, j);
		}
		Utils.swap(values, lo, j);
		return j;
	}
	
	
	
}
