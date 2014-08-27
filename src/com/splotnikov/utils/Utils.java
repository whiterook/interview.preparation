package com.splotnikov.utils;

import java.util.Random;


public class Utils {
	
	private static Random random; 
	private static long seed; 
	
	 static {
	        // this is how the seed was set in Java 1.4
	        seed = System.currentTimeMillis();
	        random = new Random(seed);
	    }
	 
	private Utils() {}
	
	public static Integer[] generateIntArray(int size){
		Integer[] values = new Integer[size];	
		
		for (int i = 0; i < values.length; i++) {
			values[i] = (int)(Math.random() * 1000) + 10;			
		}		
		return values;
	}
	
	 public static void shuffle(Integer[] a) {
	        int N = a.length;
	        for (int i = 0; i < N; i++) {
	            int r = i + uniform(N-i);     // between i and N-1
	            int temp = a[i];
	            a[i] = a[r];
	            a[r] = temp;
	        }
	 }
	 
	 public static int uniform(int N) {
	        if (N <= 0) throw new IllegalArgumentException("Parameter N must be positive");
	        return random.nextInt(N);
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
	
	public static <T extends Comparable<T>> void printArray(T[] values){
		for (T t : values) {
			System.out.print(" " + t.toString());
		}
		System.out.println();
	}
}
