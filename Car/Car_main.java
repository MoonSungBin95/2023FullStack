package Car;

public class Car_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();  
		Car car2 = new Car("XC90");
		Car car3 = new Car("S90","Gray");
		Car car4 = new Car("XC90", "Gray", 280);
		
		System.out.println("회사명: "+ car1.company);
		System.out.println("회사명: "+ car2.company +" 모델: "+ car2.model +" 색상: "+ car2.color +" 최고속도: "+ car2.max_speed);
		System.out.println("회사명: "+ car3.company +" 모델: "+ car3.model +" 색상: "+ car3.color +" 최고속도: "+ car3.max_speed);
		System.out.println("회사명: "+ car4.company +" 모델: "+ car4.model +" 색상: "+ car4.color +" 최고속도: "+ car4.max_speed);
		
		Truck truck = new Truck("bongo", 1.5);
	}

}
