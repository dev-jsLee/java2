package model;

public class Student {
	private static Integer sqc; // 고유번호 등록을 위한 공유 변수
	private Integer id; // 학생 고유 번호
	private String name; // 학생 이름
	
	static {
		sqc = 1;
	}
	
	{
		id = sqc++;
	}
	
	
	public Student() {;}
	
	public Student(String name) {
		this.name =name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
