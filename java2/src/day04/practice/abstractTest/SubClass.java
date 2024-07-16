package day04.practice.abstractTest;

public class SubClass extends SuperClass implements SuperInterface {
	@Override
	public void superMethod1() {
		System.out.println("부모 클래스로부터 상속받아 오버라이드하여"
				+ "그 내용을 채워넣어야 하는 메서드다");
	}
	
	// 강제성
	@Override
	public void InterMethod() {
		System.out.println("상속받은 인터페이스의 추상메서드도"
				+ "오버라이드하여 그 내용을 채워넣어야 한다.");
	}
}














