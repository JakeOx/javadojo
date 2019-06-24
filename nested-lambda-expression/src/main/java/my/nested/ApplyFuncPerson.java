package my.nested;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import main.java.my.nested.Person.Sex;

public class ApplyFuncPerson {
	
	public static void main(String[] args){
		
		//Create a List of Persons

		
		List<Person> roster = new  ArrayList<>();
		roster.add(new Person("Jim", null, Sex.MALE, "jim@gmail.com"));
		roster.add(new Person("James", null, Sex.MALE, "james@gmail.com"));
		roster.add(new Person("John", null, Sex.MALE, "john@gmail.com"));
		ApplyFuncPerson engine = new ApplyFuncPerson();
		engine.processPersonsWithFunction(roster, p -> p.getEmailAddress());
		
	
	}
	
	public void processPersonsWithFunction(List<Person> roster, Function<Person, String> fn){
	
		roster.forEach(p -> {
			String value = fn.apply(p);
			System.out.println(value);
		});

	
	}

}
