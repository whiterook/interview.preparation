package com.splotnikov.algorithms.sort;

import com.splotnikov.utils.Utils;

public class Merge {

	public static void sort(Comparable[] values) {
		Comparable[] aux = new Comparable[values.length];
		sort(values, aux, 0, values.length - 1);
	}
	
	private static void sort(Comparable[] values, Comparable[] aux, int lo, int hi){
		if(lo >= hi){
			return;
		}		
		int mid = lo + (hi - lo)/2;
		sort(values, aux, lo, mid);
		sort(values, aux, mid + 1, hi);
		merge(values, aux, lo, mid, hi);		
	}
	
	private static void merge(Comparable[] values, Comparable[] aux, int lo, int mid, int hi){
		for (int i = lo; i <= hi; i++) {
			aux[i] = values[i];
		}		
		int i = lo, j = mid+1;
		for (int k = lo; k <= hi; k++) {
			if(i > mid)
				values[k] = aux[j++];
			else if(j > hi)
				values[k] = aux[i++];
			else if(Utils.less(aux[j], aux[i])){
				values[k] = aux[j++];				
			}
			else{
				values[k] = aux[i++];
			}
		}
	}
}
