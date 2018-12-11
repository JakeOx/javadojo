package my.nested;

public class PersonProcessor {
	
	public static void main(String[] args){
		
		Person p =  new Person() {
			
			//Overloading the method using Anonymous inner class 
			public void setAttrib(String name, String sex){
				this.setName(name);
				this.setSex(sex);	
			}
			
			@Override 
			public void setAttrib(String name){
			   this.setName("Name is :" + name);
				
			}
		};
		
		p.toString();
	}

}
