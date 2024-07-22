package day08.task.stream;

import java.util.stream.IntStream;

public class StreamDistinct {

	public static void main(String[] args) {
		// distinct()는 중복을 제거한 스트림을 반환한다.
		IntStream streamInt = IntStream.of(1, 3, 2, 3, 4, 5, 4);
		streamInt.distinct()
			.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
