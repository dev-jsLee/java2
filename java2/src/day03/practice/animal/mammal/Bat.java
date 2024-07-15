package day03.practice.animal.mammal;

import day03.practice.animal.Fly;

public class Bat extends Mammal implements Fly {
	
	public Bat() {;}
	
	public Bat(String name, int age, String type) {
		super(name, age, type);
	}
	
	@Override
	public void walking() {
		System.out.println("가끔 두 발로 걸어다닌다.");
	}

	@Override
	public void flying() {
		System.out.println("피막 날개로 날 수 있다.");
	}
	
	public void useEcho() {
		System.out.println("초음파로 위치를 파악한다.");
	}
}








