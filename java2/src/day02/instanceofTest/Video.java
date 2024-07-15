package day02.instanceofTest;

// 비디오 -> 부모
// 드라마, 영화, 만화
// 비디오 -> 메서드 정의
// 자식 타입에 따라 다른 내용을 출력하는 메서드를 정의
public class Video {
	
	
	public static void checkType(Video obj) {
		// 검사할 대상 자식 객체를 파라미터(매개변수)로 받아야 한다.
		// 부모 클래스 타입으로 받고 이를 검사하는 로직을 짜야 한다.
		// instanceof 연산자 사용
		String text = "";
		
		if(obj instanceof Drama) {
			text = "Drama";
		} else if(obj instanceof Movie) {
			text = "Movie";
		} else if(obj instanceof Animation) {
			text = "Animation";
		}
		
		System.out.println("해당 객체는 " + text + "타입의 객체입니다.");
		
		
		
		
		
	}
}











