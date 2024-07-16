package day04.task.abstractTest;

public abstract class Student {
	// 학생의 정보를 입력할 클래스
	String name;
	int age;
	
	public Student() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void hobby();
	
	
	
	
	
	
	
}
