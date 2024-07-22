package day08.task.stream;

import java.util.stream.Stream;

public class StreamSorted {

	public static void main(String[] args) {
		// sorted()
		// 스트림의 요소들을 정해진 순서대로 정렬한다.
		// 파라미터를 전달하지 않으면, 기본적으로 사전순으로 정렬한다
		Stream<String> streamStr = Stream.of(
				"Java",
				"C", "C++", "C#",
				"Python", "Ruby"
				);
		streamStr.sorted() // 사전순 정렬
			.map(e->e + " ") // 각 값의 뒤에 공백 추가
			.forEach(System.out::print); // 한 줄로 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
