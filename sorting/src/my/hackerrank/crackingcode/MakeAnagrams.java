package my.hackerrank.crackingcode;

import java.util.Scanner;

public class MakeAnagrams {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
		
    }
	
	
	public static int numberNeeded(String first, String second) {
		return getUnmatched(first, second) + getUnmatched(second, first);
    }


	private static int getUnmatched(String src, String target) {
		int[] alphabets = new int[256];
		
		for (int i=0; i< src.length(); i++){
			int srcValue = src.charAt(i);
			alphabets[srcValue] = alphabets[srcValue] + 1;
		}
		
		int removeCount=0;
		int repeats=0;
		for (int i=0; i< target.length(); i++){
			int targetValue = target.charAt(i);
			if ( alphabets[targetValue] == 0){ //did not find char
					removeCount++;	
			}else{
				alphabets[targetValue] = alphabets[targetValue] - 1; //found the char and its frequency. Reduce freq 
			}			
		}
		
		return removeCount+repeats;
	}
  
    

}
