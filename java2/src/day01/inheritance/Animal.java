package day01.inheritance;

public class Animal {
	// 동물	: 먹고 자고 하는 생식활동을 하는 존재
	// 사람	: 동물 중 도구를 쓸 줄 아는 존재
	// 홍길동	: 사람 중 ~~동에 사는 어떤 존재
	// is-A관계 : A is B ?
	// 홍길동이 사람이니? -> B가 상위 개념, A가 하위 개념이다
	// 동물이 사람이니? false
	
	// 상위 개념일수록 추상화되고 개념적인 내용이 들어간다.
	// 특징적인 부분이 줄어든다
	
	String name;
	int age;
	
	public Animal() {
		this.age = 0;
	}
	
	// 먹는다
	public void eat() {
		System.out.println("음식을 섭취한다");
	}
	
	// 잔다
	public void sleep() {
		System.out.println("수면활동을 한다");
	}
	
	// 늙다
	public void old() {
		this.age++;
		System.out.println("나이를 먹어 " + this.age + " 살이 되다");
	}
	
	
	
	
	
	
	
	
}
