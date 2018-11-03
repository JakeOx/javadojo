package my.algo.datastructures;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class MergeSorter {

    public static int[] mergeSort(int[] data) {
        mergeSort(data, 0, data.length - 1);
        return data;

    }

    public static void mergeSort(int[] data, int start, int end) {
        if (start < end) {
            int mid = (int) Math.floor((start + end) / 2);
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }

    }

    private static void merge(int[] data, int start, int mid, int end) {
        int sizeOfLeft = mid + 1 - start;
        int sizeOfRight = end - mid;

        //Clone
        int[] left = new int[sizeOfLeft];
        int[] right = new int[sizeOfRight];

        for (int i = 0; i < sizeOfLeft; i++) {
            left[i] = data[start + i];
        }

        for (int j = 0; j < sizeOfRight; j++) {
            right[j] = data[mid + 1 + j];
        }
        int i = 0;
        int j = 0;

        for (int k = start; k <= end; k++) {
            if ((i >= sizeOfLeft) || (j < sizeOfRight && right[j] < left[i])) {
                data[k] = right[j];
                j++;
            } else {
                data[k] = left[i];
                i++;
            }

            //Alternatively:
            // if ((j>=sizeOfRight)||(i<sizeOfLeft && left[i]<=right[j])){
            //     data[k]=left[i];
            //     i++;
            // }else{
            //     data[k] = right[j];
            //     j++;
            // }

            }
        }

    }

