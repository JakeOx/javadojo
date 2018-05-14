package my.datastructure.sorting;

import java.util.Arrays;
import java.util.*;

public class MergeSorter {

	
	public void sort(int[] data) {
		mergeSort(data, 0, data.length-1);
	}	
	
	private void mergeSort(int[] data, int start, int end) {
		if (start < end) {
			
			double floor = Math.floor((start+end)/2);
			
			double d = 100.5;
			double floorX = Math.ceil(d);
			
			int mid = (int) Math.floor((start+end)/2);
			mergeSort(data, start, mid);
			mergeSort(data, mid+1, end);
			merge(data, start, mid, end);
		}
	}
	
	private void merge(int[] data, int start, int mid, int end) {
		int sizeOfLeft = mid-start+1;
		int sizeOfRight = end - mid;
		int[] left = new int[sizeOfLeft];
		int[] right = new int[sizeOfRight];
		for (int i = 0; i < sizeOfLeft; i++) {
			left[i] = data[start + i]; // be careful here
		}
		for (int j = 0; j < sizeOfRight; j++) {
			right[j] = data[mid + 1 + j]; // be careful
		}
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			//if we exhausted the copying of all the elements of the right array OR ( if not then,: i still within bounds of leftSize and leftElement <= rightElement )
			if ((j == sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}
			
//			if (i < sizeOfLeft && left[i] <= right[j]) {
//				data[k] = left[i];
//				i++;
//			}else{
//				data[k] = right[j];
//				j++;				
//			}
//			
//			if ( j == sizeOfRight) {
//				data[k] = right[j];
//				j++;
//			}
			
		}
	}
	
	public static void main(String[] args) {
		MergeSorter sorter = new MergeSorter();
		int[] data = {4,1,6,9,5,10,2,3};
		sorter.sort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public static List<Integer> mode(final int[] numbers) {
	    final List<Integer> modes = new ArrayList<Integer>();
	    final Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

	    int max = -1;

	    for (final int n : numbers) {
	        int count = 0;

	        if (countMap.containsKey(n)) {
	            count = countMap.get(n) + 1;
	        } else {
	            count = 1;
	        }

	        countMap.put(n, count);

	        if (count > max) {
	            max = count;
	        }
	    }

	    for (final Map.Entry<Integer, Integer> tuple : countMap.entrySet()) {
	        if (tuple.getValue() == max) {
	            modes.add(tuple.getKey());
	        }
	    }

	    return modes;
	}


}
