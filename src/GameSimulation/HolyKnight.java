package GameSimulation;

public class HolyKnight extends Knight implements Healer {
	int dp;
	
	HolyKnight(String name){
		super(name);
	}
	public void heal() {
		System.out.println("힐");
	}
	
	public void recovery() {
		System.out.println("회복");
	}
}
