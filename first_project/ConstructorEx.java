package first_project;

class Hero {
	String name;
	int power;
	int speed;
	
//	Hero(String n, int p, int s){
//		name = n;
//		power = p;
//		speed = s;
//	}
//	
	String toStr() {
		return String.format("Hero{name: %s, power: %d, speed: %d}", name, power, speed);
	}
}



public class ConstructorEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero ironMan = new Hero();
		Hero Hulk = new Hero();
		
		System.out.println(ironMan.toStr());
		System.out.println(Hulk.toStr());
		
		
	}

}
