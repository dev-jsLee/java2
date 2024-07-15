package day03.task.food;

public class FoodMain {

	public static void main(String[] args) {
		Naengmyeon mulNeang = new Naengmyeon();
		mulNeang.addFlavor(new Flavor() {

			@Override
			public void printFlavor() {
				System.out.println("식초를 넣어 시큼한 맛과 시원한 맛이 일품이다.");
			}
		});
		
		
		
		
		
		
	}

}
