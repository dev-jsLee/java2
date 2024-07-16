package day04.practice.basicApi;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] arrInt = {3, 4, 1, 3, 2};
		int n = 3;
		// copyOf()
		int[] clonedArr = Arrays.copyOf(arrInt, n);
		// 첫번째 인수는 원본배열을 넣어주고
		// 두번째 인수는 끝자리 값을 넣어주어
		// 원본배열의 n-1번째 값까지 복사를 해서
		// 새로운 배열에 담는 메서드다
		// n에 해당하는 값은 원본배열보다 커도 된다.
		// 만약 새로운 배열의 길이가 원본배열보다 클 경우
		// 큰 부분의 요소들은 기본값으로 세팅된다.
		// int 0, float 0.0, Class null, char 0
		
		// ===========================
		
		
		
	}

}
