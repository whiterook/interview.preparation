package binary.arithmetic;

public class BinaryArithmetic {

	public boolean compareBinToHex(String bin, String hex){
		int binResult = convertToBase(bin, 2);
		if(binResult == -1) return false;
		
		int hexResult = convertToBase(hex, 16);
		if(hexResult == -1) return false;
		
		return 
				binResult == hexResult;
	}
	
	public int convertToBase(String number, int base){
		if(base < 0 || (base > 10 && base != 16)) 
			return -1;
		
		int result = 0;
		for (int i = 0; i < number.length(); i++) {
		   int parsedInt = charToInt(number.charAt(number.length() - i - 1));
		   if(parsedInt == -1) 
			   return -1;
		   result += parsedInt * Math.pow(base, i);
		}
		return result;
	}
	
	private int charToInt(char ch){
		
		if(ch >= '0' && ch <= '9') 
			return ch - '0';
		
		if(ch >= 'A' && ch <= 'F')
			return ch - 'A' + 10;
		
		if(ch >= 'a' && ch <= 'f')
			return ch - 'a' + 10;
		
		return -1;
	}
}
