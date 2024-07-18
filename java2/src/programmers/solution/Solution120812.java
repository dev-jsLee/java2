package programmers.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution120812 {

	public static void main(String[] args) {
		/*
		 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록
		 * solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
		 */
		Scanner sc = new Scanner(System.in);
		int result = solution(new int[] { 1, 1, 1, 3, 3, 4 });
		System.out.println(result); // 1

		result = solution(new int[] { 1, 1, 2, 2 });
		System.out.println(result); // -1

		result = solution(new int[] { 3 });
		System.out.println(result); // 3

		while (true) {
			System.out.print("입력: ");
			String input = sc.nextLine();
			if (input.equals("exit"))
				break;
			String[] arrStr = input.split(" ");
			int[] arrInt = new int[arrStr.length];
			for (int i = 0; i < arrStr.length; i++) {
				arrInt[i] = Integer.parseInt(arrStr[i]);
			}
			System.out.println(solution(arrInt));
		}
	}

	public static int solution(int[] array) {
//      최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
//      정수 배열 array가 매개변수로 주어질 때,
//		최빈값을 return 하도록 solution 함수를 완성해보세요.
//		최빈값이 여러 개면 -1을 return 합니다.
		int answer = 0;
		int max = 0;
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// 중복 제거
		for (Integer integer : array) {
			hs.add(integer);
		}
		
		// 키에는 해당 숫자, 값에는 카운트가 들어갈 맵 객체 생성
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		// 각 키마다 초기값으로 0 세팅
		for (Integer integer : hs) {
			hm.put(integer, 0);
		}
		for (int i = 0; i < array.length; i++) {
			// 입력받은 숫자를 순회하며 해당 키의 값을
			// 기존 키의 값에 1을 더한 값으로 치환
			hm.replace(array[i], hm.get(array[i]) + 1);
		}
		
		// 키 리스트를 순회하여 최빈값을 찾는 부분
		for (Integer integer : hm.keySet()) {
			
			// 현재 수의 빈도수
			int current = hm.get(integer);
			// 최빈값보다 빈도가 많으면
			if (max < current) {
				// 최빈 빈도수를 현재 빈도수로 바꾸고
				max = current;
				// 최빈값 변경
				answer = integer;
			} else if (max == current) {
				// 최빈값의 빈도수가 같다면
				answer = -1; // 최빈값 대신 -1 세팅
			}
		}
		return answer;
	}

}
