package day03.practice.animal.fish;

import day03.practice.animal.Animal;
import day03.practice.animal.Swim;

public abstract class Fish extends Animal implements Swim {
	public Fish() {;}
	
	public Fish(String name, int age, String type) {
		super(name, age, type);
	}
	
	
}
