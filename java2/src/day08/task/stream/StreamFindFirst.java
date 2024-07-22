package day08.task.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamFindFirst {

	public static void main(String[] args) {
		// findFirst()
		// 스트림의 요소 중에서 첫번째 요소를
		// 참조하는 옵셔널 클래스 객체를 반환
		IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
		IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

		OptionalInt result1 = stream1
//				.sorted()
				.findFirst();
		System.out.println(result1.getAsInt());

		OptionalInt result2 = stream2
//				.sorted()
				.findAny();
		System.out.println(result2.getAsInt());

	}

}
