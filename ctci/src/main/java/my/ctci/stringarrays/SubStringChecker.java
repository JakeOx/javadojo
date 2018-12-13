package my.ctci.stringarrays;

public class SubStringChecker {
	
	public static void main(String[] args){
		
		System.out.println(isSubstring("dale", "hopedale"));
		System.out.println(isSubstring("dad", "hopedale"));	
	}
		
	
/*
 * ALGORITHM: 
 * 
 * Eg: s2 = hopedale
 *     s1 = peda
 *     
 isSubstring(String s1, String s2)
	
	- Get the length of s1, s2
	   'n, m'
	
	- Loop1 through elems of s2
	
	    --Loop2 with a slide pat[] one by one of s1 in s2
		 'i=0; i<s2.len - s1.len'
		 
		 --break if loop index reaches size of s1 and return true
		 'j==m'
 */
	static int isSubstring(String s1, String s2) 
	{ 
        int M = s1.length(); 
        int N = s2.length(); 
      
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) { 
            int j; 
      
            /* For current index i, check for 
            pattern match */
            for (j = 0; j < M; j++) {
                if (s2.charAt(i + j) != s1.charAt(j)) 
                    break; 
            }
  
            if (j == M) 
                return i; 
        } 
        return -1; 
    } 
}
