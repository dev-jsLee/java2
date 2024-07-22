package day08.task.stream;

import java.util.stream.Stream;

public class StreamPeek {

	public static void main(String[] args) {
		// peek()
		// 결과 스트림으로부터 요소를 소모하여
		// 추가로 명시된 동작을 수행한다.
		// 원본 스트림을 소모하지 않기 때문에
		// 주로 연산과 연산 사이의 결과를 확인하고 싶을 때 사용한다
		// -> 디버깅 용도로 많이 사용된다.
		Stream<String> streamStr = Stream.of(
				"신촌역", "신림역", "홍대입구역", 
				"신도림역", "구로디지털단지역"
				);
		streamStr
//			.peek(e->System.out.println("peek1" + e))
			.filter(e->e.startsWith("신"))
//			.peek(e->System.out.println("peek2" + e))
			.forEach(System.out::println);
//		;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
