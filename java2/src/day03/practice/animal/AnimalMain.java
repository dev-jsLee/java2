package day03.practice.animal;

import day03.practice.animal.bird.Bird;
import day03.practice.animal.mammal.Dog;

public class AnimalMain {

	public static void main(String[] args) {
		// 각 동물을 반려동물로 받았을 때
		// 개
		// 이름과 나이를 설정하고
		Dog dog = new Dog("바둑이", 3, "믹스견");
		dog.bark();
		dog.walking();
		
		// 이들의 세세한 특징을 익명클래스로 작성하는 연습
		Bird egle = new Bird() {
			@Override
			public void flying() {
				System.out.println("두 날개로 멋있게 날다");
			}
		};
		
		egle.flying();
		
		
		
		
	}

}
