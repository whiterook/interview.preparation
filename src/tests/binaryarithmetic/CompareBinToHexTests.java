package tests.binaryarithmetic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import binary.arithmetic.BinaryArithmetic;


@RunWith(Parameterized.class)
public class CompareBinToHexTests {
	
	 @Parameters(name = "{index}: canCompareBinToHex({0}, {1}) expected={2}")
	 public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	                 { "001111101111", "3ef", true },
	                 {"01001100101010110101", "4cab5", true},
	                 {"101010111100001000110001", "abc231", true}
 
	           });
	    }
	
	 private String bin;
	 private String hex;
	 private boolean expected;
	 
	 public CompareBinToHexTests(String bin, String hex, boolean expected){
		 this.bin = bin;
		 this.hex = hex;
		 this.expected = expected;
	 }

	 
	 @Test
	 public void canCompareBinToHex() {
		 BinaryArithmetic util = new BinaryArithmetic();
		 boolean res = util.compareBinToHex(bin, hex);
		 assertEquals("Result", expected, res);
	}
}