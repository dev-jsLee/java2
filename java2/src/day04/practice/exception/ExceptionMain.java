package day04.practice.exception;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.print("입력: ");
//		a = sc.nextInt();
		try {
			sc.close();
			a = sc.nextInt();
		} catch (InputMismatchException e) {
			// 입력된 값의 타입이
			// 저장하려고 하는 변수의 타입과 불일치할 때
			System.out.println(e);
			System.out.println("다시 입력하세요");
		} catch(Exception e) {
			// 그외 다른 예외가 발생했을 때 실행될 코드블록
			System.err.println(e);
		} finally {
			sc.close();
		}
		
		
		
		
		
		
		
		
		
	}

}
