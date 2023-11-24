package sumPointEx;
import java.util.*;
public class sumPointC {
	
	public int getToTalPoint(int cnt) {
		Scanner scan = new Scanner(System.in);
		int sumPoint = 0;
		
		for(int i=1; i <= cnt; i++) {
			System.out.println(i+ "첫번째 사람의 점수 : ");
			int point = scan.nextInt();
			sumPoint += point;
		}
		return sumPoint;
		
	}
	
	
	public void showMenu(String[] menu) {
		for(int i=0; i < menu.length; i++) {
			System.out.printf("%s\n", menu[i]);
		}
	}

}
