package programmers.solution;

import java.util.Scanner;

public class Solution120812 {

	public static void main(String[] args) {
		/*
		 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
		 * 최빈값을 return 하도록 solution 함수를 완성해보세요.
		 * 최빈값이 여러 개면 -1을 return 합니다.
		 * */
		Scanner sc = new Scanner(System.in);
		int result = solution(new int[]{1, 1, 1, 3, 3, 4});
		System.out.println(result);	// 1

		result = solution(new int[]{1,1,2,2});
		System.out.println(result);		// -1
		
		result = solution(new int[]{3});
		System.out.println(result);	// 3
		
		while(true) {
			System.out.print("입력: ");
			String input = sc.nextLine();
			if(input.equals("exit")) break;
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
        int[] arrCount = new int[10]; // index 0~9
        for (int i = 0; i < array.length; i++) {
        	// array의 요소를 들고와서
        	int current = array[i];
        	// 해당 값-1인덱스의 값을 1 추가한다
        	arrCount[current-1]++;
		}
        System.out.println("=================");
        // {1, 1, 1, 3, 3, 4}
        boolean maxSame = false;
        for (int i = 0; i < arrCount.length; i++) {
        	if(arrCount[i] == 0) continue;
        	if(i==0) {
        		answer = i+1;
        		continue;
        	}
        	if(answer < arrCount[i]) {
				answer = i+1;
				maxSame = false;
			} else if(answer == arrCount[i]){
				maxSame = true;
			}
		}
        System.out.println(maxSame);
        return maxSame ? -1 : answer;
    }

}







