package day02.castingTask;

public class Shop {
	// 기본 메뉴가 있고
	// 메서드를 내용을 비운 채 구현해놓고
	// 지점 클래스에서 내용을 지점에 맞게 재정의
	
	final static int 
		CHEESE = 0, 
		BURGER_BULGOGI = 1,
		BURGER_CHICKEN = 2,
		COLA = 3,
		COLA_ZERO = 4,
		CIDER = 5;
	
	static String[] menus = new String[]{
		"치즈버거", 
		"불고기버거", 
		"치킨버거", 
		"콜라", 
		"제로콜라", 
		"사이다",
		"",
		"",
		"",
		"",
	};
		
	
	
	// 입력받은 메뉴(menuName)가 메뉴판(menus)에 있으면
	// "주문이 들어갔습니다"
	// 없으면
	// "해당 지점에 없는 메뉴입니다"
	// 출력
	public void menuOrder(String menuName) {
		// Scanner 사용하지 않는다
		// menuName => 메뉴명을 입력받은 것
		// foreach 실습
		for (String menu : menus) {
//			System.out.println(menuName.equals(menu));
//			System.out.println(menu + " " + menuName);
			if(menuName.equals(menu)) {
				System.out.println("주문이 들어갔습니다.");
				return;
			} else {
//				System.out.println("해당 지점에 없는 메뉴입니다.");
				continue;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.menuOrder("치즈와퍼"); // 없는 메뉴
		System.out.println("======gangnam====");
		Shop gangnam = new Gangnam(); // 업캐스팅
		gangnam.menuOrder("치즈와퍼");// 있는 메뉴
//		gangnam.getMenu();
		// 자식클래스에서 정의한 메서드/필드는
		// 업캐스팅한 상태에서는 사용할 수 없다
		
		System.out.println("====downcasting======");
		Gangnam g = (Gangnam)gangnam;
		g.menuOrder("치즈와퍼");
		String gotMenu = g.getMenu(6); // 치즈와퍼
		System.out.println(gotMenu);
		
		
	}
	
}







