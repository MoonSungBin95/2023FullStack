package first_project;

public class MovieDiscountByGenre {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionMovie am = new ActionMovie("범죄도시");
		HorrorMovie hm = new HorrorMovie("여고괴담");
		ComedyMovie cm = new ComedyMovie("극한직업");
		int sum = 0;
		sum += am.discountedPrice();
		sum += hm.discountedPrice();
		sum += cm.discountedPrice();
		System.out.printf("총 예매 금액: %d원", sum);
	}
}

abstract class Movie {
	String title;
	int price = 10000;
	double discount = 0.1;
	
	Movie(String title){
		this.title = title;
	}
	
	public double discountedPrice() {
		return price*(1-discount);
	}
}

class ActionMovie extends Movie{
	int add_discount = 1000;
	
	ActionMovie(String title){
		super(title);
	}
	
	public double discountedPrice() {		
		return super.discountedPrice()-add_discount;
	}
}

class HorrorMovie extends Movie{
	int add_discount = 800;
	
	HorrorMovie(String title){
		super(title);
	}
	
	public double discountedPrice() {
		return super.discountedPrice()-add_discount;
	}
}
class ComedyMovie extends Movie{
	int add_discount = 1500;
	
	ComedyMovie(String title){
		super(title);
	}
	
	public double discountedPrice() {
		return super.discountedPrice()-add_discount;
	}
}