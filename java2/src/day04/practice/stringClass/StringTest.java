package day04.practice.stringClass;

public class StringTest {

	public static void main(String[] args) {
		// charAt(int n)
		// 문자열의 n번째 문자를 문자형(char)으로 바꿔서 반환하는 메서드
		String charAtText = "hello";
		System.out.println(charAtText.charAt(2) + 
				"" + charAtText.charAt(4)); // lo
		
		// A.compareTo(String B) - A compare to B
		// 두 문자열을 비교해서 사전순에서 얼마나 떨어져있는지
		// 숫자로 반환된다.
		// 두 문자열이 같다면 0
		// 사전 순서상 A가 B보다 먼저라면 음수
		// B가 A보다 먼저라면 양수
		// 대소문자를 구분한다.
		System.out.println("Abc".compareTo("ace"));
		// compareToIgnoreCase()
		// compareTo()메서드와 동일하지만
		// 대소문자를 무시한다.
		
		System.out.println("======concat======");
		// concat(String)
		// + 연산자로 연결하는 기능을 메서드로 만들어놨다고 봐도 무방하다.
		"cares".concat("s"); // "caress"
		"to".concat("get").concat("her"); // "together"
		
		
		System.out.println("======indexOf======");
		// indexOf(char|String)
		// 전달받은 문자 혹은 문자열 값이 처음 등장하는 인덱스를 반환
		// 만약 찾을 수 없는 경우 -1 반환
		System.out.println("hello".indexOf("a")); // 2
		
		// trim() - 기본메서드
		// strip() - java11
		// 문자열의 앞뒤의 빈 값을 제거하는 메서드
		System.out.println(" hello \t".strip());
		
		// toLowerCase(), toUpperCase()
		// Lower는 대문자->소문자
		// Upper는 소문자->대문자
		// 모든 문자열에 대해서 대소문자 변환을 하는 메서드다
		System.out.println("Hello".toUpperCase()); // HELLO
		System.out.println("Hello".toLowerCase()); // hello
		
		// repeat(int n)
		// n번 만큼 해당 문자열을 반복하여 새로운 문자열을 반환
		System.out.println("hello".repeat(3));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
