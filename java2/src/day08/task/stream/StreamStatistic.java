package day08.task.stream;

import java.util.stream.IntStream;

public class StreamStatistic {

	public static void main(String[] args) {
		// count()
		// 스트림 요소의 개수를 세서 long타입의 값을 반환
		IntStream stream1 = IntStream.rangeClosed(1, 100);
		long count = stream1
			.filter(e->e%2==0)
			.map(e->e*2)
			.filter(e->e%3==0)
			.peek(System.out::println)
			.count()
			;
		System.out.println(count);
		System.out.println("=========min()===========");
		// min()
		// 요소 중 가장 작은 값을 Optional 객체로 반환
		IntStream stream2 = IntStream.of(88, 30, 50, 20, 44, 92, 74);
		System.out.println(stream2.min().getAsInt());
		
		// max()
		// 요소 중 가장 큰 값을 Optional 객체로 반환
		stream2 = IntStream.of(88, 30, 50, 20, 44, 92, 74);
		System.out.println(stream2.max().getAsInt());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
