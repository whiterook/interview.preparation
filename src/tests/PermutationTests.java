package tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import puzzles.Permutation;

public class PermutationTests {

	@Test
	public void IfStringIsNull_ReturnsNull(){
		String input = null;
		
		Permutation permutation = new Permutation();
		
		List<String> result = permutation.Get(input);
		
		assertEquals(null, result);		
	}
	
	@Test
	public void TwoLettersPermutation_ReturnTwoStrings(){
		
		String input = "ab";
		
		List<String> expectedResult = Arrays.asList("ab", "ba");
					
		Permutation permutation = new Permutation();
		List<String> result = permutation.Get(input);
	
	    assertNotEquals(null, result);	
		assertEquals("TwoLettersPermutation", 2, result.size());
		assertEquals(expectedResult.get(0), result.get(0));
		assertEquals(expectedResult.get(1), result.get(1));
	}
	
	@Test
	public void ThreeLettersPermutation_ReturnSixStrings(){
		
		String input = "abc";
		
		List<String> expectedResult = 
				Arrays.asList("cab", "acb", "abc", "cba", "bca", "bac");
		
		Permutation permutation = new Permutation();
		List<String> result = permutation.Get(input);
		
		assertNotEquals(null, result);	
		assertEquals("ThreeLettersPermutation", 6, result.size());	
		
		for (int i = 0; i < result.size(); i++) {
			assertTrue(expectedResult.contains(result.get(i)));
		}
	}
	
}
