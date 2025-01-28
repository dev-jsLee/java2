package testStream.stream;

import java.io.Serializable;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		// 배열 선언
		String[] arrStr = new String[]{
			"하나", "둘", "셋", "얍!", 
			"천방지축", "어리둥절", 
			"빙글빙글", "돌아가는", 
			"짱구의 하루"
		};

		// 배열을 스트림으로 변환
		Stream<String> streamStr = Arrays.stream(arrStr);

		// 각 요소를 출력
//		streamStr.forEach(e -> System.out.print(e + " "));

		Stream<String> streamStrRange = Arrays.stream(arrStr, 4, arrStr.length);
//		streamStrRange.forEach(e -> System.out.print(e + " "));

		
		// 가변 매개변수
		Stream<Serializable> streamGa = Stream.of(1, 3.2, '홋', "짱구");
		
		Stream<Integer> streamInt = Stream.iterate(2, n -> n + 2); 
		streamInt.limit(5).forEach(System.out::println);
		
		
		
		
		
		
	}

}
