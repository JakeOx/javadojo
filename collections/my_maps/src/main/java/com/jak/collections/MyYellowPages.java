package com.jak.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyYellowPages {

    Map<String, Integer> yellowPages = new TreeMap<>();
    
    
    public MyYellowPages(){

    }

    public static void main(String []argh){

        MyYellowPages solution = new MyYellowPages();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            //Insert into yellowPages
            solution.add(name, phone);
            
        }
        //Validate queries 1<n<10^5
        while(in.hasNext()){
            String s = in.next();

            // Write code here
            String out = String.format("%s = %s", s, ( solution.get(s) == 0 ? "Not Found" : solution.get(s) ));
            System.out.println(out);
        }
        in.close();
    }


    private void add(String name, int phone) {
        
        //Validate phone 1<n<10^5
        //Validate: 8-digit phone number
        if ( name !=null && phone != 0 )
            yellowPages.put(name, phone);
    }

    private int get(String name){
        if (yellowPages.containsKey(name)){
            return yellowPages.get(name);
        }
        return 0;
    }




}