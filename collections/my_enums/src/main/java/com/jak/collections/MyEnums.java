package com.jak.collections;

import java.util.EnumMap;

public class MyEnums{
    
    public static void main(String[] args){
        System.out.println("Hello");
    }

   public enum DaysOfWeek{ MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY}

   public void buildMap(){
       EnumMap<DaysOfWeek, String> schedule = new EnumMap<>(DaysOfWeek.class);
   }
}