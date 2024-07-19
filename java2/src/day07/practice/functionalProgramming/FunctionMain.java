package day07.practice.functionalProgramming;

import java.util.function.Function;
import java.util.function.IntPredicate;

public class FunctionMain {

	public static void main(String[] args) {
		// Function<T1, T2> 인터페이스는
		// T1 클래스 타입을 전달받아서 T2 클래스타입을 반환하는
		// 추상메서드가 정의되어 있는 인터페이스다.
		Function<String, String> func = (name) -> "이름 " + name;
		String result = func.apply("홍길동");
		System.out.println(result);
		System.out.println("=====================");

		Function<String, Function<String, String>> greeting = (name) -> {
			Function<String, String> fullText = (greetingText) -> {
				return greetingText + " " + name;
			};
			return fullText;
		};

//		Function<String, String> hong = greeting.apply("홍길동");
//		String lastText = hong.apply("Hello");
//		System.out.println(lastText);
		String lastText2 = greeting.apply("김길동").apply("Hi");
		System.out.println(lastText2);
		System.out.println("============직접 만든 인터페이스 사용============");
		// 1부터 100까지의 수 중 짝수인 경우에만 출력
		ThreeConsumer<Integer, Integer, IntPredicate> forI = (start, end, validator) -> {
			// 반복할 시작값 start
			// 반복끝 end
			// 유효성 검사용 IntPredicate
			// start, end
			for (int i = start; i <= end; i++) {
				if (validator.test(i)) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		};

		forI.play(1, 100, (i) -> i % 2 == 0);
		forI.play(1, 100, (i) -> i % 2 != 0);
		forI.play(1, 100, (i) -> i * 2 < 100);
		
		
		
		
		
		
		
		

	}

}
