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
public class ConvertToBaseTests {
	
	 @Parameters(name = "{index}: canConvertToBase({0}, {1}) expected={2}")
	 public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	                 { "8706", 16, 34566 },
	                 {"6C0", 16, 1728},
	                 {"4F", 16, 79},
	                 {"10011010010", 2, 1234},
	                 {"110110000000", 2, 3456},
	                 {"100001", 2, 33}
 
	           });
	    }
	
	 private String number;
	 private int base;
	 private int expected;
	 
	 public ConvertToBaseTests(String number, int base, int expected){
		 this.number = number;
		 this.base = base;
		 this.expected = expected;
	 }

	 
	 @Test
	 public void canConvertToBase() {
		 BinaryArithmetic util = new BinaryArithmetic();
		 int res = util.convertToBase(number, base);
		 assertEquals("Result", expected, res);
	}
}