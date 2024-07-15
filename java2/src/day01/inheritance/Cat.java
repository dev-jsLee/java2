package day01.inheritance;

public class Cat extends Animal {
	
	// 자식클래스에서 추가한 필드
	String type; // 고양이의 종
	
	
	// 상속받은 자식클래스
	// 부모 클래스의 메서드를 그대로 상속받지만
	// 자식클래스에서 추가하거나 수정된 내용만 자식클래스에서 작성된다
	// 기본 생성자
	public Cat() {;}
	
	// 1번 생성자(String, int)
	public Cat(String name, int age) {
		this(name, age, "길냥이");
	}
	
	// 2번 생성자(String)
	public Cat(String name) {
		this(name, 0);
		// 파라미터의 개수가 더 많은 1번 생성자를 호출하여
		// 받지 못한 파라미터 정보를 기본값으로 세팅하는 기법
	}
	
	// 3번 생성자(String, int, String)
	public Cat(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	@Override // 부모클래스에서 정의된 메서드를 재정의한다라는 의미
	public void eat() {
		// ※기존에 정의된 메서드의 시그니처를 그대로 적어야 한다.
		// 반환값의 경우, 참조 타입인 경우에는
		// 참조 타입의 부모 클래스 타입으로 반환할 수도 있다. 
		// 부모 클래스에 정의된 메서드를 먼저 실행한다.
//		super.eat();
		System.out.println("츄르를 먹는다");
	}
	
	@Override
	public void old() {
//		super.old();
		// this.age라고 하는 부모 클래스에서 정의된
		// 필드에도 접근이 가능하다.
		System.out.println(++this.age + " 살이 되다.");
	}
	
	
	
	
	
	
	
	
	
	
	
}
