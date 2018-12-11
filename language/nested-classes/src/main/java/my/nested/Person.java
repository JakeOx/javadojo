package my.nested;

public class Person {
    private String name;
    private String sex;
	
	
	public void setAttrib(String name){
		this.setName(name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}

}
