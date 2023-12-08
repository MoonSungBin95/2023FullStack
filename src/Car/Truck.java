package Car;

public class Truck extends Car{
	
	double Payload;
	
	void Load(){
		System.out.println("물건을 적재합니다.");
	}
	
	Truck(String m, double p){
		super(m);
		Payload = p;
		System.out.println("모델명: "+ m +" 적재량: "+ Payload +"톤");
	}
}
