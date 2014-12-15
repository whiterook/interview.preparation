package algorithms.sort;

import lib.Utils;

public class Insertion {

	public static <T extends Comparable<T> > void sort(T[] values) {
		for (int i = 1; i < values.length; i++) {
			for (int j = i; j > 0 && Utils.less(values[j], values[j-1]); j--) {
				Utils.swap(values, j, j-1);
			}
		}		
	}

}
