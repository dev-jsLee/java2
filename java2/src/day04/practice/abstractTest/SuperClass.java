package day04.practice.abstractTest;

public abstract class SuperClass {
	// 추상클래스
	// - 추상메서드가 하나 이상 있으면 반드시 추상클래스로 선언되어야 한다.
	// - 추상메서드가 없어도 추상 클래스로 선언 가능하다
	// - 추상클래스 자체로는 객체화가 불가능하다
	// - 상속받은 자식클래스대에서 추상메서드를 오버라이드하여
	// 내용을 다 채워넣은 후 객체화가 가능하다.
	
	public abstract void superMethod1();
	
	
}
