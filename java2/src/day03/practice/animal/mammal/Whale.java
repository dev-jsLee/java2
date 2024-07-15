package day03.practice.animal.mammal;

import day03.practice.animal.Swim;

public class Whale extends Mammal implements Swim{

	@Override
	public void walking() {;}

	@Override
	public void swimming() {
		System.out.println("바다에서 생활하는 수생 생물이다.");
	}
}
