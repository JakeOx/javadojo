package com.jak.collections;

import java.util.EnumMap;

public class MyEnums{

    EnumMap<DaysOfWeek, String> schedule;
    
    public static void main(String[] args){
        
        //Build and print the Enums
        MyEnums doEnums = new MyEnums();
        doEnums.buildMap();
        doEnums.printMap();
    }

   public enum DaysOfWeek{ MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY}

   public void buildMap(){
       schedule = new EnumMap<>(DaysOfWeek.class);
       
       schedule.put(DaysOfWeek.MONDAY, "Soccer");
       schedule.put(DaysOfWeek.TUESDAY, "Basketball");
       schedule.put(DaysOfWeek.WEDNESDAY, "Karate");
       schedule.put(DaysOfWeek.THRUSDAY, "Football");
       schedule.put(DaysOfWeek.FRIDAY, "Baseball");
       schedule.put(DaysOfWeek.SATURDAY, "Lacrose");
       schedule.put(DaysOfWeek.SUNDAY, "Church");
    

       assert schedule.get(DaysOfWeek.TUESDAY).equalsIgnoreCase("Basketball");
       assert (schedule.size() == 7);
   }

   public void printMap(){
    schedule.values().stream().forEach(System.out::println);
   }
}