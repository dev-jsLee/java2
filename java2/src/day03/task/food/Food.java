package day03.task.food;

public abstract class Food {
	String name;
	String[] materials;
	
	public abstract void cook();
	
	public void addFlavor(Flavor flavor) {
		flavor.printFlavor(); // 맛 설명
	};
	public void explainCooking(Cooking cooking) {
		cooking.explainCook(); // 요리방법 설명
	}
	
}
