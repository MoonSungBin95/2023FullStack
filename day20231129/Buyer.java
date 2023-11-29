package day20231129;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	public void buy(Product p) {
		if (money >=p.price) {
			System.out.printf("%s을/를 구입하셨습니다.\n", p.toString());
			money -= p.price;
			this.bonusPoint = p.bonusPoint;			
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}
