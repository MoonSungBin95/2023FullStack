package first_project;
import java.util.*;
public class Dice_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주사위의 개수를 입력하세요> ");
		int input = Integer.parseInt(scan.nextLine());
		Dice[] dice = new Dice[input];
		int[] num = new int[input];
		int sum = 0;
		
		for(int i=0; i<dice.length; i++) {
			System.out.print("dice"+(i+1)+" 주사위의 면의 개수를 입력하세요> ");
			input = Integer.parseInt(scan.nextLine());
			dice[i] = new Dice(input); 
		}
		
		for(int i=0; i<num.length; i++) {
			num[i] = dice[i].Roll();
			sum += num[i];	
		}
		
		System.out.println("<< 주사위 눈 >>");
		for(int i=0; i<num.length; i++) {
			System.out.println("dice"+(i+1)+": "+ num[i]);
		}
		
		System.out.println("주사위의 합: "+ sum);
	}	

}
