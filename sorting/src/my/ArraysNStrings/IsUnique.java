package my.ArraysNStrings;

public class IsUnique {
	
	public static void main(String[] args){
		String test = "sSampleE";
		System.out.println(new IsUnique().isUniqueChars(test));
	}
	public boolean isUniqueChars(String str){
		if (str.length() > 256 ) return false;
		boolean[] char_set = new boolean[256];
		
		for (int i =0; i<str.length(); i++){
			char charAt = str.charAt(i);
			int charVal = str.charAt(i);
			System.out.println(charAt + ":" + charVal);
			
			if (char_set[charVal])
				return false;
			
			char_set[charVal] = true;
		}
		return true;
	}

}
