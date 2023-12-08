package heritage;

public class Heritage_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novice novice = new Novice("park", 100);
		Wizard wizard = new Wizard("moon", 200, 400);
		InFighter infighter = new InFighter("kim", 300, 300);
		
		wizard.punch();
		wizard.move("left");
		
	}

}
