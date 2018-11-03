package my.algo.datastructures;

import java.util.Arrays;

import org.junit.Test;

public class MergeSorterTest{

    @Test
    public void testMergeSort(){
        int[] testData = {11,2, 4,5 };
        int[] mergeSortResult = new MergeSorter().mergeSort(testData);
        org.junit.Assert.assertNotNull(mergeSortResult);

        System.out.println(Arrays.toString(testData));


    }

}
