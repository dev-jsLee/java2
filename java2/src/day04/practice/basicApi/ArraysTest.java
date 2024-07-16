package day04.practice.basicApi;

import java.util.Arrays;

import day03.practice.animal.bird.Penguin;
import day03.practice.animal.mammal.Bat;
import day03.practice.animal.mammal.Dog;

public class ArraysTest {

	public static void main(String[] args) {
		int[] arrInt = {3, 4, 1, 3, 2};
		int n = 3;
		// copyOf()
		int[] clonedArr = Arrays.copyOf(arrInt, n);
		// 첫번째 인수는 원본배열을 넣어주고
		// 두번째 인수는 끝자리 값을 넣어주어
		// 원본배열의 n-1번째 값까지 복사를 해서(첫번째부터 n개)
		// 새로운 배열에 담는 메서드다
		// n에 해당하는 값은 원본배열보다 커도 된다.
		// 만약 새로운 배열의 길이가 원본배열보다 클 경우
		// 큰 부분의 요소들은 기본값으로 세팅된다.
		// int 0, float 0.0, Class null, char 0
		for (int e : clonedArr) {
			System.out.print(e + " ");
			// 3, 4, 1
		}
		System.out.println("\n=======range========");
		// ===========================
		// copyOfRange(T[], int a, int b)
		// a번째 인덱스부터 b-1번째 인덱스의 요소까지 복사하여
		// 새로운 배열로 만드는 메서드다
		// {3, 4, 1, 3, 2}
		int[] rangeCloned = Arrays.copyOfRange(arrInt, 1, 3);
		for (int e : rangeCloned) {
			System.out.print(e + " "); // 4, 1
		}
		System.out.println("\n=======fill=======");
		// ===========================
		// fill(T[], T) - void
		// 특정 값으로 배열의 모든 요소를 바꾸는 메서드다
		// 특정 값으로 초기화하는 메서드다
		int[] arrInt2 = new int[10];
		// 기본값인 0이 전부 들어가 있을 거다.
		Arrays.fill(arrInt2, 4);
		// 두번째 인수로 채워넣고 싶은 값을 전달해주면 된다.
		for (int i : arrInt2) {
			System.out.print(i + " ");
		}
		// ===========================
		System.out.println("\n=====sort=======");
		// sort(T[]) - void
		// 배열의 요소를 오름차순으로 정렬해주는 메서드다
		int[] notSortedArr = new int[] {3, 7, 2, 1, 4, 9};
		Arrays.sort(notSortedArr);
		for (int i : notSortedArr) {
			System.out.print(i + " ");
		}
		// ===========================
		// asList(T...)
		// 여러 값을 전달하여 해당 값들을 하나의 배열에 담아 반환
		// 해당 값들의 가장 가까운 공통 부모 클래스 타입으로 자동 업캐스팅한다.
		Arrays.asList(1, 'c', "A", new Object());
		Arrays.asList(new Dog(), new Penguin(), new Bat());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
