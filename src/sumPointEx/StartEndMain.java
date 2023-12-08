package sumPointEx;
import java.util.Scanner;
public class StartEndMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("시작값: ");
		
		int start = scan.nextInt();
		System.out.println("종료값: ");
		
		int end = scan.nextInt();
		
		SumNumber sum = new SumNumber();
		sum.sumAll(start, end);
		
		
	}

}
