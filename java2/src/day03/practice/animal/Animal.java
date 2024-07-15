package day03.practice.animal;

public abstract class Animal {
	String name;
	int age;
	String type;
	
	public Animal() {;}
	public Animal(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
}
