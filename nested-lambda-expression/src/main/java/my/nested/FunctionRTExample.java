package my.nested;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.function.Function;

public class FunctionRTExample {
	

	public static void main(String[] args){
		
		List<Employee> roster = Arrays.asList( new Employee("Tom Jones", 45), 
		      new Employee("Harry Major", 25),
		      new Employee("Ethan Hardy", 65),
		      new Employee("Nancy Smith", 15),
		      new Employee("Deborah Sprightly", 29)
		      );
		Function<Employee, String> funcEmpToString = p -> {
			System.out.println(p.getName());
			return p.getName();
		};
		
		Function<String, String> funcFirstLetter = s -> s.substring(0,1);
		List<String> convertEmpListToNamesList = convertEmpListToNamesList(roster, funcEmpToString.andThen(funcFirstLetter));
		convertEmpListToNamesList.forEach(s -> System.out.println(s));
		
	}
	
	
	public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
		   
		List<String> empNameList=new ArrayList<String>(); 
		
		for(Employee emp:employeeList){
		     empNameList.add(funcEmpToString.apply(emp));
		   }
		   return empNameList;
		  }

	
}
