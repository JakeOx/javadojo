package my.lang.basics;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SplitStringFunctionals {
	
	public static void main(String[] args){
		String[] arr = {"chocolate:brown", "green:giant", "black:mamba"};
		Map<String, String> arrayToMap = arrayToMap(arr);
		
		arrayToMap.forEach((k,v) -> System.out.println(k));
		
	}
	public static Map<String, String> arrayToMap(String[] arrayOfString) {
	    return Arrays.asList(arrayOfString)
	      .stream()
	      .map(str -> str.split(":"))
	      .collect(Collectors.toMap(str -> str[0], str -> str[1]));
	}

}
