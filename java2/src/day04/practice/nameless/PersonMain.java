package day04.practice.nameless;

public class PersonMain {
	public static void main(String[] args) {
		// 익명클래스는 상속을 받지만
		// 자체적인 이름이 없기 때문에
		// 부모클래스 타입으로 업캐스팅된 상태로 사용할 수밖에 없다.
		// 따라서, 자식클래스로서 새로 정의하는 메서드는
		// 업캐스팅되면서 사용할 수 없게 되기 때문에
		// 익명클래스에서 새로운 메서드를 정의할 수 없는 셈이 된다.
		Person p = new Person() {
			
			@Override
			public void showInfo() {
				System.out.println(this.name 
						+ "은 " + 
						this.age + "살입니다.");
			}
		};
		
		p.name = "홍길동";
		p.age = 20;
		p.showInfo();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
