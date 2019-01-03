package my.ctci.stringarrays;

public class RotationChecker {
	
	
	public int isRotation(String s1, String s2){
		int len = s1.length();
		
		if (len == s2.length() && len > 0){
			
			String s1s1 = s1 + s1;
			return SubStringChecker.isSubstring(s1s1, s1);
			//return isSubString(s1s1, s2);
		}
		
		return -1;
	}

}
