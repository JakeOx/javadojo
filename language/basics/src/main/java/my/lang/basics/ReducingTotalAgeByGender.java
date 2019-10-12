package my.lang.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import my.lang.basics.domains.Person;
import my.lang.basics.domains.Person.Sex;

public class ReducingTotalAgeByGender {
	
	public static void main(String[] args){
		
	}
	
	public void printTotalAgeByGender(ArrayList<Person> roster){
        
        System.out.println("Total age by gender:");
        Map<Person.Sex, Integer> totalAgeByGender =
            roster
                .stream()
                .collect(
                     Collectors.groupingBy(
                         Person::getGender,                      
                         Collectors.reducing(
                             0,
                             Person::getAge,
                             Integer::sum)));
        
        Set<Entry<Sex, Integer>> totalAgeByGenderList = totalAgeByGender.entrySet();
                
//        List<Map.Entry<Person.Sex, Integer>>
//            totalAgeByGenderList = new ArrayList<>(totalAgeByGender.entrySet());
                     
        totalAgeByGenderList
            .stream()
            .forEach(e -> 
                System.out.println("Gender: " + e.getKey() +
                    ", Total Age: " + e.getValue()));
		
	}

}
