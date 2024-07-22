package day08.task.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		// map()
		// 앞선 스트림의 요소를 파라미터로 하여 연산을 한 뒤,
		// 그 반환값들로 새로운 스트림을 만드는 기능이다
		IntStream streamInt = IntStream.of(1, 2, 3, 5, 4, 2, 3, 1);
		streamInt.map(e -> e * 2).forEach(System.out::println);

		Stream<String> stream = Stream.of("Hello", "world", "Java");
		stream.map(e -> e + " ")
			.forEach(System.out::print);
		System.out.println("\n============flatMap()===============");
		// flatMap()
		String[] animals = new String[] {"cat", "dog", "snake"};
		Stream<String> madeStream = Arrays.stream(animals); // Stream<String> 만들고
		madeStream.map(e->e.split("")) // 각 요소를 한글자씩 떼서 새로운 배열들로 만들기
			.flatMap(Arrays::stream) // 만들어진 배열들을 스트림으로 만들고->합치는 과정
			.forEach(System.out::println);
		
		
	}

}
















