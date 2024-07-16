package day04.task.abstractTest;

public class StudentMain {

	public static void main(String[] args) {
		SoccerStudent sst = new SoccerStudent();
		sst.setName("홍길동");
		sst.setAge(20);
		
		MovieStudent mst = new MovieStudent();
		mst.setAge(21);
		mst.setName("김길동");
		
		Student[] students = new Student[2];
		
		students[0] = sst;
		students[1] = mst;
		
		for (Student student : students) {
			System.out.print(student.name + "은 ");
			student.hobby();
		}
		// 추상메서드를 오버라이드하여 그 내용을
		// 자식클래스마다 다르게 설정해야 하는 경우
		// 자식클래스들을 부모클래스 타입으로 묶어
		// 사용할 때에는 같은 메서드 이름으로
		// 서로 다른 기능을 호출할 수 있다.
		
		
		
		
		
		
		
		
		
		
		
	}

}
