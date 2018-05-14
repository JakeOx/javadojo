package my.hackerrank.crackingcode;

import java.util.Scanner;

public class ArrayRotate {

    static int[] queue;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
    	
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];    
        queue = new int[k];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
    
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
    	int[] f = pushQ(a,k);
    	return popQ(f, k , n-k);
    }

	private static int[] popQ(int[] a, int k, int pos) {
		for (int j=0; j<k; j++){
			a[pos+j] = queue[j];
		}
		return a;
	}

	private static int[] pushQ(int[] a, int k) {
		//push to Q
		for(int j=0; j<k; j++){
			queue[j] = a[j];
		}
			
		//Shift items
		int j=0;
		for(int i=k; i<a.length; i++){
			a[j]=a[i];
			j++;
		}
		return a;
	}

}
