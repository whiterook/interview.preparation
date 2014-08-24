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
		int mid = (hi - lo) / 2;
		sort(values, aux, lo, mid);
		sort(values, aux, mid + 1, hi);
		merge(values, aux, lo, mid, hi);		
	}
	
	private static void merge(Comparable[] values, Comparable[] aux, int lo, int mid, int hi){
		for (int i = lo; i <= hi; i++) {
			aux[i] = values[i];
		}		
		int i = lo, j = mid;
		for (int k = lo; k <= hi; k++) {
			if(i > mid)
				values[k] = aux[j++];
			if(j > hi)
				values[k] = aux[i++];
			if(Utils.less(aux[i], aux[j])){
				values[k] = aux[i++];
			}
			else{
				values[k] = aux[j++];
			}
		}
	}
}
