package day09.task.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("정이준", new int[] { 45, 60, 50, 75, 85 }, 90),
				new Student("안도윤", new int[] { 80, 40, 65, 75, 55 }, 70),
				new Student("김하준", new int[] { 50, 65, 70, 80, 40 }, 75),
				new Student("고은우", new int[] { 60, 45, 75, 70, 45 }, 65),
				new Student("백서준", new int[] { 55, 80, 55, 90, 50 }, 60),
				new Student("김서아", new int[] { 90, 85, 90, 65, 50 }, 60),
				new Student("윤이서", new int[] { 35, 55, 80, 70, 45 }, 80),
				new Student("박아윤", new int[] { 50, 40, 75, 70, 60 }, 65),
				new Student("이지아", new int[] { 70, 90, 60, 85, 70 }, 55),
				new Student("정하윤", new int[] { 80, 65, 60, 80, 70 }, 80));
		/*
		 * 1. 필기 점수의 평균을 구하고 평균 점수가 60점 이상인 학생의 이름 출력
		 * 2. 필기 점수 중 하나라도 40점 미만인 학생의 이름 출력
		 * 3. 필기, 실기 통합, 모든 점수가 60점 이상인 학생 수 출력
		 * 4. 필기와 실기 기준에 따른 합격자와 그 평균점수 출력
		 */
		// 1. 필기 점수의 평균을 구하고 평균 점수가 60점 이상인 학생의 이름 출력
		System.out.println("===========첫번째 문제=============");
		Stream<Student> stream = studentList.stream();
		stream
		.filter(e-> {
			double avg = Arrays
					.stream(e.getScoreWritten())
					.average()
					.getAsDouble();
//			System.out.println(avg);
			return avg >= 60;
		})
//		.map(e->"평균점수 " + Arrays.stream(e.getScoreWritten()).average().getAsDouble() 
//				+ "\n합격자 " + e.getName())
		.map(e->e.getName())
		.forEach(System.out::println);
		
		System.out.println("==========두번째 문제===========");
		System.out.println("2. 필기 점수 중 하나라도 40점 미만인 학생의 이름 출력");
		stream = studentList.stream();
		stream.filter(e-> {
			return Arrays.stream(e.getScoreWritten())
					.min()
					.getAsInt() < 40;
		})
		.forEach(e->{
			System.out.println(e.getName() + "의 최저 점수 : " 
		+ Arrays.stream(e.getScoreWritten())
		.min().getAsInt());
		});
		
		System.out.println("==========세번째 문제===========");
		System.out.println("3. 필기, 실기 통합, 모든 점수가 60점 이상인 학생 수 출력");
		stream = studentList.stream();
		
		long count = stream.filter(st->{
			int min1 = Arrays.stream(st.getScoreWritten())
			.min().getAsInt();
			int min2 = st.getScorePractical();
			int small = min1 > min2 ? min2 : min1;
			return small >= 60;
		})
		.peek(e->System.out.println(e.getName()))
		.count();
		System.out.println("count : " + count);
		
		System.out.println("========네번째 문제========");
		System.out.println("필기와 실기 기준에 따른 합격자와 통합 평균점수 출력");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
