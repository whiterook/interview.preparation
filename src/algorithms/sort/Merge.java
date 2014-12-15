package algorithms.sort;

import java.lang.reflect.Array;

import lib.Utils;

public class Merge {

	public static <T extends Comparable<T>> void sort(T[] values) {
		@SuppressWarnings("unchecked")
		T[] aux = (T[]) Array.newInstance(values.getClass().getComponentType(), values.length);
		sort(values, aux, 0, values.length - 1);
	}
	
	private static <T extends Comparable<T>> void sort(T[] values, T[] aux, int lo, int hi){
		if(lo >= hi){
			return;
		}		
		int mid = lo + (hi - lo)/2;
		sort(values, aux, lo, mid);
		sort(values, aux, mid + 1, hi);
		merge(values, aux, lo, mid, hi);		
	}
	
	private static <T extends Comparable<T>> void merge(T[] values, T[] aux, int lo, int mid, int hi){
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
