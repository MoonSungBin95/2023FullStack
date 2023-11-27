package Tire;

public class Tire_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		mycar.tire = new Tire();
		mycar.run();
		
		mycar.tire = new Tire_Gumho();
		mycar.run();
	
	}

}
