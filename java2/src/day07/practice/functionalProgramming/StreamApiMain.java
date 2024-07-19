package day07.practice.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import day01.inheritance.Cat;

public class StreamApiMain {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		// 컬렉션에서 스트림 생성
		Stream<Integer> stream = list.stream();
		
		// forEach() 메서드를 이용한 스트림 요소의 순차 접근
//		stream.forEach((e)-> System.out.println(e));
		stream.forEach(System.out::println);
		System.out.println("=======배열->스트림=========");
		String[] arrStr = new String[] {
				"하나", "둘", "셋", "야!", 
				"천방지축", "어리둥절", 
				"빙글빙글", "돌아가는", 
				"짱구의 하루"
		};
		
//		Stream<String> streamStr = Arrays.stream(arrStr);
//		streamStr.forEach(System.out::println);
		
		Stream<String> streamStr = Arrays.stream(arrStr, 4, arrStr.length);
		streamStr.forEach(e -> System.out.print(e + " "));
		System.out.println("============가변 매개변수==============");
		Stream.of(1, 3, 3.1, 'c', false, "asd", new Cat());
		
		System.out.println("=============특정 타입의 난수들=====================");
		IntStream rStream = new Random().ints();
		// stream의 사이즈라 함은 요소의 개수를 말한다.
		
		rStream.limit(3).forEach(System.out::println);
		System.out.println("==============람다식====================");
		
		Stream<Integer> streamInt = Stream.iterate(2, (n)->n+2);
		streamInt.limit(50).forEach(e->System.out.print(e + " "));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
