package day02.castingTask;

public class Gangnam extends Shop {
	// 메뉴를 다르게 해서 
	// 내용을 채워준다
	
	{
		
	}
	
	public Gangnam() {
		menus[6] = "치즈와퍼";
		menus[7] = "주니어와퍼";
	}
	
	@Override
	public void menuOrder(String menuName) {
		super.menuOrder(menuName);
	}
	
	// 자식클래스에서 정의한 메서드
	// 부모클래스는 없는 메서드
	public String getMenu(int menuNumber) {
		return menus[menuNumber];
	}
	
	
	
	
	
	
	
	
	
	
}
