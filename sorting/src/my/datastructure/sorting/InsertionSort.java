package my.datastructure.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args){
		int[] data={10, 12, 7, 6, 4, 3};
		new InsertionSort().sort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public void sort(int[] data){
		
		for(int i=0;i<data.length;i++){
			int current = data[i];
			int j=i-1;
		
		while(j>=0 && data[j]>current){
			//shift to the right
			data[j+1] = data[j];
			j--;
		}
		data[j+1] = current;
		}
	}
}
