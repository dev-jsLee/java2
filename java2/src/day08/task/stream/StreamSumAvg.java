package day08.task.stream;

import java.util.stream.IntStream;

public class StreamSumAvg {

	public static void main(String[] args) {
		// sum()
		// 모든 요소의 합을 반환하는 메서드다
		int[] scores = {70, 80, 95, 65};
		
		IntStream stream1 = IntStream.of(scores);
		int sum = stream1.sum();
		System.out.println(sum);
//		System.out.println(sum/scores.length); // 정수형 평균
		
		// average()
		// 모든 요소의 평균을 반환하는 메서드다
		stream1 = IntStream.of(scores);
		double avg = stream1.average().getAsDouble();
		System.out.println(avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
