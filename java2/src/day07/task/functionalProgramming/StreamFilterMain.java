package day07.task.functionalProgramming;

import java.util.stream.IntStream;

public class StreamFilterMain {

	public static void main(String[] args) {
		// IntStream, DoubleStream, LongStream
		// 숫자형 기본 타입을 다루는 stream이 따로 만들어져 있다.
		// 이들을 활용해서 숫자 스트림을 다룰 수 있다.
		// n부터 m-1까지 스트림으로 만들어내는 메서드
		// IntStream.range(n, m)
		IntStream streamInt1 = IntStream.range(1, 100);
		// 1부터 99까지 스트림에 담긴다
		streamInt1.forEach(System.out::println);
		
		IntStream streamIntClosed = IntStream.rangeClosed(1, 100);
		streamIntClosed.forEach(System.out::println);
		System.out.println("=========1번째 문제============");
		
		// 1부터 100까지의 수 중 짝수만 출력하는 프로그램 작성
		IntStream streamInt = IntStream.rangeClosed(1, 100);
		streamInt.filter(e -> e % 2 == 0).forEach(System.out::println);
		
		System.out.println("==============2번째 문제=============");
		// 1부터 100까지의 수 중 홀수만 출력하는데
		// 3의 배수인 홀수만 출력하는
		// 프로그램 작성
		streamInt = IntStream.rangeClosed(1, 100);
		streamInt.filter(e -> e % 2 != 0 && e % 3 == 0).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}

}
