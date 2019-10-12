package my.lang.basics.domains;

import java.util.List;

import my.lang.basics.domains.Person.Sex;

public class Person {
	
	public enum Race { INDIAN, AMERICAN, BRITISH};
	public enum Sex {MALE, FEMALE};
//    public static class Sex {
//
//		public static Sex MALE = null;
//
//	}
    
    private Sex gender;

	private String name;
    //
    private int age;
	
	
	public void setAttrib(String name){
		this.setName(name);
	}


	public String getName() {
		return name;
	}
	
	public Sex getGender(){
		return gender;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static List<Person> createRoster() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object printPerson() {
		// TODO Auto-generated method stub
		return null;
	}

}
