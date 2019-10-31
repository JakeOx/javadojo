package com.jak.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/*
*Refer: Studies: Java Collections: ArrayList
*/
public class MyListExercises {

    public static void main(String[] args){

    }


    /*
    *Refer: Studies: Java Collections: ArrayList
    */
    private void doCreateListWithFuncPrg(){

        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);

        List<Long> list2 = Arrays.asList(4L, 5L, 6L);

        List<Long> list3 = LongStream.range(8, 15).boxed().collect(Collectors.toCollection(ArrayList::new));
        list2.addAll(list3);
        list.addAll(list2);
    


    }
}