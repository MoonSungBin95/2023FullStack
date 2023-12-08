package day20231129;

public class Product {
	
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		this.bonusPoint += 0.1*price ;
	}
}
