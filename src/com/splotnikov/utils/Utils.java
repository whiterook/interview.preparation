package com.splotnikov.utils;


public class Utils {
	
	public static Integer[] generateIntArray(int size){
		Integer[] values = new Integer[size];	
		
		for (int i = 0; i < values.length; i++) {
			values[i] = (int)(Math.random() * 1000) + 10;			
		}		
		return values;
	}
	
	public static <T extends Comparable<T>> void swap(T[] values, int i, int j){
		T temp = values[i];
		values[i] = values[j];
		values[j] = temp;		
	}
	
	public static <T extends Comparable<T>> boolean less(T left, T right) {
        return (left.compareTo(right) < 0);
    }
	
	public static <T extends Comparable<T>> boolean isSorted(T[] values) {
	        return isSorted(values, 0, values.length - 1);
	    }

	public static <T extends Comparable<T>> boolean isSorted(T[] values, int lo, int hi) {
	        for (int i = lo + 1; i <= hi; i++)
	            if (less(values[i], values[i-1])) return false;
	        return true;
	    }
}
