package day02.interfaceTest;

public abstract class CharactorUnit {
	// 게임캐릭터
	// 몬스터
	
	String name;
	String type;
	
	public abstract void attack();
	
	public static void main(String[] args) {
		CharactorUnit player = new CharactorUnit() {

			@Override
			public void attack() {
				name = "플레이어";
				type = "플레잉 캐릭터";
				System.out.println("적을 타격한다");
			}
		};
		
		CharactorUnit orc = new CharactorUnit() {
			@Override
			public void attack() {
				name = "오크";
				type = "몬스터";
				System.out.println("몽둥이로 때린다");
			}
		};
		
		player.attack();
		orc.attack();
		
		
		
		
	}
}
