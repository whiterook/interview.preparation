package puzzles;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	public List<String> Get(String input){
		if( (input == null) || (input.isEmpty() ))
			return null;
		
		List<String> result = new ArrayList<String>();
		
		if(input == null || input.isEmpty())
			return result;
		
		if(input.length() == 1){
			result.add(input);
			return result;
		}
		
		if(input.length() == 2){
			result.add(input);
			result.add( new StringBuilder().append(input.charAt(1)).append(input.charAt(0)).toString());
			return result;
		}
		
		List<String> prevResult = Get(input.substring(0, input.length() - 1));
		
		for (String str : prevResult) {
			
			for (int i = 0; i < str.length(); i++) {
				StringBuilder builder = new StringBuilder();
				builder.append(str.substring(0, i));
				builder.append(input.substring(input.length() - 1));
				builder.append(str.substring(i));
				
				result.add(builder.toString());
			}
			result.add(str.concat(input.substring(input.length() - 1)));
		}			
		
		return result;
	}
	
}
