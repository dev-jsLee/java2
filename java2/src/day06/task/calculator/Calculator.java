package day06.task.calculator;

public class Calculator {
	
	public static void main(String[] args) {
		Summable sum = (a, b) -> a + b; 
		Subbable sub = (a, b) -> a - b;
		Multi multi = (a, b) -> a * b; 
		Division div = (a, b) -> {
			try {
				return a / b;
			} catch (Exception e) {
				return 0;
			}
//			if(b == 0) {
//				return 0;
//			} else {
//				return a / b;
//			}
		};
		System.out.println(div.divide(100, 3));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
