package day03.practice.animal.bird;

import day03.practice.animal.Walk;

public class Penguin extends Bird implements Walk{

	@Override
	public void flying() {
		System.out.println("날개가 퇴화되어 날지는 못한다.");
	}
	
	@Override
	public void walking() {
		System.out.println("뒤뚱뒤뚱 두 발로 걷는다.");
	}
	
	public void sliding() {
		System.out.println("빙판 위에서 배로 미끄러져 이동할 수 있다.");
	}

}






