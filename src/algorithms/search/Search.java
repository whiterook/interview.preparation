package algorithms.search;

import java.security.InvalidParameterException;

public class Search {

	public int findMatch(String pattern, String text)
			throws InvalidParameterException {

		int patternLength = pattern.length();
		int textLength = text.length();

		if (textLength < patternLength)
			throw new InvalidParameterException();

		for (int i = 0; i <= (textLength - patternLength); i++) {
			int j = 0;
			while (j < patternLength && pattern.charAt(j) == text.charAt(i + j)) {
				j++;
			}
			if (j == patternLength)
				return i;
		}

		return -1;
	}
	
	public int binary(int[] values, int key){
		
		int hi = values.length, lo = 0;
		
		while (lo < hi) {
			int mid = (hi + lo) / 2;
			
			if(values[mid] > key){
				hi = mid - 1;
			}else if(values[mid] < key){
				lo = mid + 1;
			}else 
				return mid;	
		}
		
		return -1;		
	}
}
