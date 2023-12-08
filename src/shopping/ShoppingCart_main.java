package shopping;
import java.util.ArrayList;
import java.util.Arrays;
public class ShoppingCart_main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingItem item1 = new ShoppingItem("newbalance", 3000000);
		ShoppingItem item2 = new ShoppingItem("shirts", 5000000);
		ShoppingItem item3 = new ShoppingItem("premiumperfume", 9000000);
		ShoppingItem item4 = new ShoppingItem("Rollsroyce", 500000000);
		
		ArrayList<ShoppingItem> item = new ArrayList<ShoppingItem>();
		
		item.add(item1);
		item.add(item2);
		item.add(item3);
		item.add(item4);
		
		String[] list = new String[item.size()];
		
		int sum = 0;
		
		for(int i=0; i<item.size(); i++) {
			System.out.println(item.get(i).toStr());
			sum += item.get(i).GetPrice();		
		}
		System.out.println("합계: "+sum);
	}

}
