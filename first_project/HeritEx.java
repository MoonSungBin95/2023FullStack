package first_project;

class Novice {
	String name;
	int hp;
	void punch() {
		System.out.printf("%s(HP: %d)의 펀치!\n", name, hp);
	}
}

class Wizard extends Novice {
	int mp;
	void fireball() {
		System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n", name,hp,mp);
	}
}


public class HeritEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard wizard = new Wizard();
		wizard.name = "간달프";
		wizard.hp = 100;
		wizard.mp = 80;
		wizard.punch();
		wizard.fireball();
	}

}
