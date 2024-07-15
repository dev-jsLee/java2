package day03.practice.animal.mammal;

import day03.practice.animal.Animal;
import day03.practice.animal.Walk;

public abstract class Mammal extends Animal implements Walk {
	public Mammal() {;}
	
	public Mammal(String name, int age, String type) {
		super(name, age, type);
	}
	
}
