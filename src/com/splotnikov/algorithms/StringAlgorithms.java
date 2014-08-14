package com.splotnikov.algorithms;

import java.security.InvalidParameterException;

public class StringAlgorithms {

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
}
