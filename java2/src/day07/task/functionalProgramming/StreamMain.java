package day07.task.functionalProgramming;

import java.util.stream.IntStream;

public class StreamMain {

	public static void main(String[] args) {
		// 1부터 100까지의 수 중 짝수만 출력하는 프로그램 작성
		IntStream streamInt = IntStream.rangeClosed(1, 100);
		streamInt.filter(e -> e % 2 == 0).forEach(System.out::println);
		
		// 1부터 100까지의 수 중 홀수만 출력하는데
		// 3의 배수인 홀수만 출력하는
		// 프로그램 작성
		
		
		
		
		
		
		
		
		
		
	}

}
