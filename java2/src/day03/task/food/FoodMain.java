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
		
		K_Food bibimbab = new K_Food() {
			
			@Override
			public void cook() {
				System.out.println("밥과 다양한 나물을 참기름과 함께 비빈다.");
			}
		};
		bibimbab.addFlavor(new Flavor() {
			
			@Override
			public void printFlavor() {
				System.out.println("고슬고슬한 밥의 풍미와 참기름의 고소함이 얽혀 입안을 노닌다.");
			}
		});
		
		K_Food ddeokbbokki = new K_Food() {
			
			@Override
			public void cook() {
				System.out.println("가래떡과 떡볶이 소스를 버무려 약불에 익힌다.");
			}
		};
		
		ddeokbbokki.addFlavor(new Flavor() {
			
			@Override
			public void printFlavor() {
				System.out.println("매운맛과 감칠맛이 일품이다.");
			}	
		});
		
		
		
		
	}

}
