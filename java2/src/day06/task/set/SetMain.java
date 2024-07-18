package day06.task.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class SetMain {

	public static void main(String[] args) {
		// Set 컬렉션 클래스
		// HashSet
		// 주로 중복을 걸러내는 용도로 쓰인다.

		// 리스트 초기화
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		arrInt.add(1);
		arrInt.add(3);
		arrInt.add(1);
		arrInt.add(5);
		arrInt.add(2);
		arrInt.add(9);
		System.out.println(arrInt.size());

		HashSet<Integer> hashInt = new HashSet<Integer>();
		for (Integer e : arrInt) {
			if (hashInt.add(e)) {
				System.out.println(e + "값은 잘 들어감.");
			} else {
				System.out.println("중복된 값을 넣으려고 했습니다.");
			}
		}
		System.out.println("==========실습=============");
		// 랜덤으로 주어지는 10개의 숫자(1~10)
		// ArrayList에 담아서
		// set 사용해서 중복 제거 후
		// 해당 값들을 새로운 리스트 담아서 출력해보자.
		
		// 랜덤 객체 생성
		Random r = new Random();
		
		// 랜덤값이 먼저 들어갈 리스트 선언
		ArrayList<Integer> arrIntBefore = new ArrayList<Integer>();
		// 중복을 제거하기 위해 사용할 Set 선언
		HashSet<Integer> hs = new HashSet<Integer>();
		// 중복이 제거된 값들이 들어갈 리스트 선언
		ArrayList<Integer> arrIntAfter = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			arrIntBefore.add(r.nextInt(10)+1);
		}
		System.out.println(arrIntBefore);
		for (Integer e : arrIntBefore) {
			hs.add(e);
		}
		
		for (Integer e : hs) {
			arrIntAfter.add(e);
		}
		System.out.println(arrIntAfter);
		System.out.println("================");
		
		
		
		
		
		
		
		
	}

}
