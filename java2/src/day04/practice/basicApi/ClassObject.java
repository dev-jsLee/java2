package day04.practice.basicApi;

import day03.task.food.Food;

public class ClassObject {

	public static void main(String[] args) {
		Food f = new Food() {
			
			@Override
			public void cook() {
			}
			
			@Override
			public String toString() {
//				return super.toString();
				String text = "원래 주소값이 있던 값";
				
				return text;
			}
		};
		
		System.out.println(f);
		
		
		
		
		
		
		
		
		
	}

}
