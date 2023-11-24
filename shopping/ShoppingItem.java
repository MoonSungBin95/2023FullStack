package shopping;

public class ShoppingItem {
	String item;
	int price;
	
	ShoppingItem(String item, int price){
		this.item = item;
		this.price = price;
	}
	
	public int GetPrice(){
		return price;
	}
	
	public String toStr() {
		return String.format("Item {name: %s, price: %d}", item,price);
	}
}
