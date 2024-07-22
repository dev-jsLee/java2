package day08.task.stream;

import java.util.stream.IntStream;

public class StreamReduce {

	public static void main(String[] args) {
		// reduce()
		// 최종 연산 중 하나로, 각 요소를 소모하여 연산을 하는데,
		// 그 반환값을 다음 연산에 사용하는 계단식 연산을 한다
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream
//		.peek(e->System.out.println("e " + e))
		.reduce((before, after) -> before * after)
		.stream().forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
