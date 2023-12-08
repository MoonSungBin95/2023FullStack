package first_project;
import java.util.*;
public class Factorial_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Factorial factorial = new Factorial();
		
		System.out.print("구하려는 팩토리얼을 입력하세요: ");
		int num = Integer.parseInt(scan.nextLine());
		
		int a = factorial.Factorial(num);
		System.out.println(num +"!의 값은 "+ a +"입니다.");
	}

}
