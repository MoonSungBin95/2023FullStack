package heritage;

public class Wizard extends Novice {
	
	int mp;
	
	public Wizard(String n, int hp, int mp) {
		super(n,hp);
		this.mp = mp;
		System.out.println("["+ name +"] hp: "+ hp +" | mp: "+ mp);
	}
	
	public void fireball() {
		System.out.println("파이어볼!");
	}
}
