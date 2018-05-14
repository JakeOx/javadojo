package my.datastructure.sorting;

import java.util.Arrays;

public class SelectionSortReview2 {
	
	public static void main(String[] args){
		int[] data = {3,2,1,7,8,9,0,4,34,4,100};
		new SelectionSortReview2().sort(data);
		System.out.println(Arrays.toString(data));
	}

	public void sort (int[] data){	
		for(int i=0; i<data.length; i++){
			for(int j=i+1; j<data.length; j++){
				if (data[j] < data[i]){
					int tmp = data[j];
					data[j]= data[i];
					data[i] = tmp;
				}
			}
		}
	}
}
