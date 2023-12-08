package Car;

public class Car {
	String company = "Volvo";
	String model;
	String color;
	int max_speed;
	
	Car() {}
	
//	Car(String m) {
//		model = m;
//	}
	
	Car(String m){
		this(m, "Silver", 280);
	}
	
//	Car(String m, String c){
//		model = m;
//		color = c;
//	}
	
	Car(String m, String c){
		this(m, c, 280);
	}
	
	Car(String m, String c, int ms){
		model = m;
		color = c;
		max_speed = ms;
	}
	
	void Move() {
		System.out.println("움직입니다.");
	}
}
