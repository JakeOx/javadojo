package my.datastructure.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args){
		int[] data={10, 12, 7, 6, 4, 3};
		new SelectionSort().sort(data);
		System.out.println(Arrays.toString(data));	
	}
	
	public void sort(int[] data){	
		
		for(int i=0; i<data.length-1; i++){
			
			int minIdx=i;
			
			for(int j=i+1; j<data.length; j++ ){
				if(data[j] < data[minIdx]){
					minIdx = j;
				}
			}
			
			int tmp = data[minIdx];
			data[minIdx] = data[i];
			data[i] = tmp;
		}
		
	}

}
