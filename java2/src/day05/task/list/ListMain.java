package day05.task.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// ArrayList를 선언하고 1부터 100까지의 수를 담은 다음
		// 홀수의 값에 2를 곱하고 치환한 값을 요소에 도로 넣는다.
		// 전체 요소를 출력하는 프로그램 작성
		ArrayList<Integer> arrInt = new ArrayList<Integer>();

		// 값을 세팅
		for (int i = 0; i < 100; i++) { // 0 ~ 99
			arrInt.add(i + 1);
		}

		// 세팅한 값을 확인
		for (Integer integer : arrInt) {
			System.out.println(integer);
		}
		// 1~100

		// 홀수의 값에 2를 곱하고
		for (int i = 0; i < arrInt.size(); i++) {
			int currentVal = arrInt.get(i);
//			if(currentVal%2==1) { // 2로 나눈 나머지가 1이면
//				// -> 홀수면
//			}
			if (currentVal % 2 == 0) { // 짝수인 경우
				continue; // 다음 반복으로
			}
			// 홀수인 경우
			// 홀수인 값에 2를 곱하고
			int newValue = currentVal * 2;
			// 치환한 값을 요소에 도로 넣는다.
			arrInt.set(i, newValue);
		}
		System.out.println("===================");
		// 전체 요소를 출력하는 프로그램 작성
		for (Integer i : arrInt) {
			System.out.println(i);
		}
		System.out.println("=================");
		// 1번문제 : 2, 2, 6, 4,...,198,100
		// 2번 문제
		// ArrayList를 선언하고 1부터 100까지의 수를 담은 다음
		// 홀수의 값에 2를 곱한 값을 리스트에 추가한다.
		// 전체 요소를 출력하는 프로그램 작성
		// 35분~45분
		// 1, 2, 3,..., 100, 2, 4, 6,..., 198
		ArrayList<Integer> arrInt2 = new ArrayList<Integer>();
		// 값을 세팅
		for (int i = 0; i < 100; i++) { // 0 ~ 99
			arrInt2.add(i + 1);
		}

		// 세팅한 값을 확인
		for (Integer integer : arrInt2) {
			System.out.println(integer);
		}
		// 1~100
		// 홀수의 값에 2를 곱하고
		for (int i = 0; i < arrInt2.size(); i++) {
			int currentVal = arrInt2.get(i);
			if(currentVal%2==1) { // 2로 나눈 나머지가 1이면
				// 홀수인 값에 2를 곱하고
				int newValue = currentVal * 2;
				// 추가한다
				arrInt2.add(newValue);
			}
		}
		
		System.out.println("===================");
//		System.out.println(arrInt2.size());
		// 전체 요소를 출력하는 프로그램 작성
		for (Integer i : arrInt2) {
			System.out.println(i);
		}

	}

}
