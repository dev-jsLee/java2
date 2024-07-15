package day03.practice.animal.bird;

import day03.practice.animal.Animal;
import day03.practice.animal.Fly;

public abstract class Bird extends Animal implements Fly {
	public Bird() {;}
	
	public Bird(String name, int age, String type) {
		super(name, age, type);
	}
}
