package day01.inheritance;

public class InheritMain {

	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.eat(); // 섭취
		
		// 상속받은 자식클래스 호출
		Cat cat = new Cat();
		cat.eat(); // 상속받은 메서드 사용이 가능하다
		System.out.println("================");
		
		ani.old(); // 부모 메서드
		cat.old(); // 자식 재정의 메서드
		
		System.out.println("================");
//		ani.type // 자식 클래스에서 추가된 내용은
		// 부모 클래스에서 접근, 사용 불가
		
		// 다형성
		// 다형성이란 하나의 객체가 여러개의 타입을 가질 수 있는 것을 의미한다
		// 자식 클래스는 부모 클래스를 상속받아 그 특성을 그대로 물려받기 때문에
		// 자식 클래스는 부모 클래스 타입도 동시에 가지고 있다
		Cat cat2 = new Cat();
		cat2.type = "샴고양이";
		
		// 자동형변환처럼 다른 조작없이 대입이 된다
		Animal catToAni = cat2; // 업캐스팅(upcasting)
		
		
		catToAni.eat();
//		System.out.println(catToAni.type);
		System.out.println("=======downcasting========");
		// 부모클래스 객체 선언
//		Animal ani3 = new Animal();
//		Cat aniToCat = (Cat)ani3;
//		aniToCat.eat();
		// downcasting 조건
		// 업캐스팅된 자식 객체만 가능하다
		// 업캐스팅된 자식 객체는 원래 본인의 클래스 타입으로만 다운캐스팅이 가능하다
		// -> ※다운캐스팅은 업캐스팅이 선행되어야 한다
		Cat catD = new Cat();
		Animal catToAni2 = catD; // 업캐스팅
		Cat catToCat = (Cat)catToAni2; // 다운캐스팅
		// 다운캐스팅은 명시적으로 변환할 참조 타입을 작성해주어야 한다.
		catToCat.eat();
		
		System.out.println("=========why=======");
		// 업/다운 캐스팅을 왜 사용하는가?
		// 자식 클래스 타입이 여럿 있을 때,
		// 부모 클래스 타입에서 자식 클래스 타입을 받아들이고(업캐스팅)
		// 그 이후 자식 클래스 타입에 따라 다르게 처리하기 위해서
		
		// instanceof
		// 타입을 검사하는 예약어
		// 객체 instanceof 클래스명
		// 객체가 클래스 타입을 가지고 있니? -> true/false
		
		// 비디오 -> 부모
		// 드라마, 영화, 만화
		// 비디오 -> 메서드 정의
		// 자식 타입에 따라 다른 내용을 출력하는 메서드를 정의
		// instanceof 예약어
		
		Cat cats1 = new Cat();
		System.out.println(cats1 instanceof Cat);
		// 타입확인 연산자 true/false 논리값을 반환한다.
		
		if(cats1 instanceof Animal) {
			System.out.println("cats1 객체는 Animal 타입이다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
