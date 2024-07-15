package day02.abstractClass;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("사료를 먹는다");
	}

	@Override
	public void walk() {
		System.out.println("네 발로 걷는다");
	}

	@Override
	public void sleep() {
		System.out.println("밤에 잔다");
	}
	
}
