package GameSimulation;

public class MagicKnight extends Knight implements Magician{
	int mp;
	
	MagicKnight(String name){
		super(name);
	}
	
	public void magicShield() {
		System.out.println("매직쉴드!");
	}
	
	public void teleport() {
		System.out.println("순간이동");
	}
}
