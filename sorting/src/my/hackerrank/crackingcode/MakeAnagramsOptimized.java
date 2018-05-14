package my.hackerrank.crackingcode;

import java.util.Scanner;

/*
 * Refer: HackerRank, Editorial solution:
 * Refer: https://www.hackerrank.com/challenges/ctci-making-anagrams
 */
public class MakeAnagramsOptimized {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));	
    }
	
	private static int numberNeeded(String a, String b) {
		int[] charCountersFirst = charCounter(a);
		int[] charCountersSecond = charCounter(b);
		return getDelta(charCountersFirst, charCountersSecond);
	}

	private static int getDelta(int[] charCountersFirst, int[] charCountersSecond) {
		int repeats=0;
		for (int i=0; i<charCountersFirst.length; i++){
			int diff = Math.abs(charCountersFirst[i] - charCountersSecond[i]);
			repeats += diff;
		}
		return repeats;
	}
	

	private static int[] charCounter(String str) {
		int[] alphas = new int[26];
		
		//create offset
		int offset = (int)'a';
		
		for(int i=0; i<str.length(); i++){
			int value = str.charAt(i) - offset;
			alphas[value]++;
		}
		return alphas;
	}
}
