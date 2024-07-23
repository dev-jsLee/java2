package day09.task.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		// collect() 메서드 하위에서 쓰는 것들
		// toArray, toCollection, toList, toSet, toMap
		// 문자열이 담긴 스트림 선언
		Stream<String> streamStr = Stream.of("둘", "하나", "삼", "넷");

		// 문자열 스트림을 리스트로 바꾸기
		List<String> listStr = streamStr.collect(Collectors.toList());
		System.out.println(listStr);

		// 문자열 스트림을 컬렉션 클래스 셋으로 바꾸기
		streamStr = Stream.of("둘", "하나", "삼", "넷", "둘", "하나");
		Set<String> setStr = streamStr.collect(Collectors.toSet());
		System.out.println(setStr);

		System.out.println("=======통계/연산========");
		// counting(), maxBy(), minBy(), summingInt(), averageInt()
		streamStr = Stream.of("둘", "하나", "삼", "넷", "둘", "하나");
		Long count = streamStr.collect(Collectors.counting());
		System.out.println(count);

		// summingInt() averagingInt()
		Stream<Integer> intStream1 = Stream.of(1, 4, 9, 3, 2);
		int sum = intStream1.collect(Collectors.summingInt(v -> v+1));
		System.out.println(sum);
		
		intStream1 = Stream.of(1, 4, 9, 3, 2);
		double avg = intStream1.collect(Collectors.averagingInt(v -> v*2));
		System.out.println(avg);
		
		// reducing(), joining()
		intStream1 = Stream.of(1, 4, 9, 3, 2);
		int reducing = intStream1.collect(Collectors.reducing((t, u) -> t*u)).get();
		System.out.println(reducing);
		
		streamStr = Stream.of("둘", "하나", "삼", "넷", "둘", "하나");
		String joinedStr = streamStr.collect(Collectors.joining(", "));
		System.out.println(joinedStr);
		
		System.out.println("==========minBy maxBy===============");
		intStream1 = Stream.of(1, 4, 9, 3, 2);
		int min = intStream1
				.collect(Collectors
						.minBy((o1, o2) -> o2))
				.get();
		System.out.println(min);
		
		
		
	}

}









