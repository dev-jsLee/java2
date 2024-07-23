package day08.task.stream;

import java.util.stream.IntStream;

public class StreamMatch {

	public static void main(String[] args) {	
		// anyMatch()
		// 스트림의 일부 요소가 특정 조건을 만족할 경우에 true 반환
		IntStream stream1 = IntStream.of(30, 90, 45, 70, 81);
		
		// 요소 중에 하나라도 90을 넘어가는 값이 있니?
		System.out.println(stream1.anyMatch(e-> e > 90)); // false
		
		// allMatch()
		// 모든 요소가 특정 조건을 만족할 경우 true
		stream1 = IntStream.of(30, 90, 45, 70, 81);
		
		// 모든 요소가 짝수이니?
		System.out.println(stream1.allMatch(e->e%2==0)); // false
		
		// noneMatch()
		// 모든 요소가 특정 조건을 만족하지 않을 경우 true
		stream1 = IntStream.of(30, 90, 45, 70, 81);
		
		// 모든 요소가 30보다 작지 않니?
		System.out.println(stream1.noneMatch(e->e < 30)); // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
