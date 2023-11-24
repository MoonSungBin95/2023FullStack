package Car;

public class Car2 {
		
	String company = "hyundai";
	String model;
	String color;
	int max_speed = 0;
	
	Car2(){

	}
	
	Car2(String model){
		this.model = model;
	}
	Car2(String model, String color, int max_spped){
		this.model = model;
		this.color = "red";
	}
}