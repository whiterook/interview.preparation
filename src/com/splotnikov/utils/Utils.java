package com.splotnikov.utils;


public class Utils {
	
	public static Integer[] generateIntArray(int size){
		Integer[] theArray = new Integer[size];	
		
		for (int i = 0; i < theArray.length; i++) {
			theArray[i] = (int)(Math.random() * 1000) + 10;			
		}		
		return theArray;
	}
	
	public static void swap(Object[] theArray, int i, int j){
		Object temp = theArray[i];
		theArray[i] = theArray[j];
		theArray[j] = temp;		
	}
	
	public static boolean less(Comparable left, Comparable right) {
        return (left.compareTo(right) < 0);
    }
	
	public static boolean isSorted(Comparable[] a) {
	        return isSorted(a, 0, a.length - 1);
	    }

	public static boolean isSorted(Comparable[] a, int lo, int hi) {
	        for (int i = lo + 1; i <= hi; i++)
	            if (less(a[i], a[i-1])) return false;
	        return true;
	    }
}
