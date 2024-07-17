package day05.practice.arrayList;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		// 추가된 순서대로 저장된다.
		// 인덱스를 통해 그 값에 접근할 수 있다.
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		// 요소의 추가
		arrInt.add(3);
		arrInt.add(9);
		arrInt.add(2);
		arrInt.add(4);
		arrInt.add(1);
		
		System.out.println("\n======foreach========");
		for (Integer integer : arrInt) {
			System.out.print(integer + " ");
		}
		System.out.println("\n========get==========");
		for (int i = 0; i < arrInt.size(); i++) {
			System.out.print(arrInt.get(i) + " ");
		}
		System.out.println("\n========remove==========");
		// 요소의 제거
		// remove()
		// 3 9 2 4 1
		arrInt.remove(0);
		for (int i = 0; i < arrInt.size(); i++) {
			System.out.print(arrInt.get(i) + " ");
		} // 9 2 4 1
		
		System.out.println("\n========set==========");
		// 요소의 변경
		// set()
		arrInt.set(0, 90);
		for (int i = 0; i < arrInt.size(); i++) {
			System.out.print(arrInt.get(i) + " ");
		} // 90 2 4 1
		
		System.out.println("\n========size==========");
		// 요소의 개수
		// size()
		System.out.println(arrInt.size());
		
		
		
		
		
		
		
		
		
		
		
	}

}
