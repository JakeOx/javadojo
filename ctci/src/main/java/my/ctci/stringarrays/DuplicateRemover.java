package my.ctci.stringarrays;

import java.util.Arrays;

public class DuplicateRemover {

	public static void main(String[] args) {
		String testStr = "aabbccdddd";
		System.out.println(testStr);
		System.out.println(removeDuplicates(testStr.toCharArray()));
		//System.out.println(removeDuplicates2(testStr.toCharArray(), testStr.length()));

	}

	public static String removeDuplicates(char[] str) {

		if (str == null)
			return "";

		int len = str.length;
		if (len < 2)
			return new String(str);

		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;

			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j])
					break;
			}

			if (j == tail) {
				str[tail] = str[i];
				tail++;
			}
		}
		str[tail] = 0;

		//return new String(str);
		return toUniqueString(str);
	}
	
	public static String toUniqueString(char[] letters) {
		StringBuilder sb = new StringBuilder(letters.length);
		for (char c : letters) {
			if (c != 0) {
				sb.append(c);
			}
		}
		return sb.toString();
	}


	
	public static String removeDuplicates2(char[] str, int n){
		
		 
		   // Used as index in the modified string 
		   int index = 0;    
		     
		   // Traverse through all characters 
		   for (int i=0; i<n; i++) { 
		         
		     // Check if str[i] is present before it   
		     int j;   
		     for (j=0; j<i; j++)  
		        if (str[i] == str[j]) 
		           break; 
		       
		     // If not present, then add it to 
		     // result. 
		     if (j == i) 
		        str[index++] = str[i]; 
		   } 
		     
		   return new String(str); 
		
	}
	
	

}
