package backjoon;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tot = scan.nextInt();
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			sum += A*B; 
		}
		if(sum == tot) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
}