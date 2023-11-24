package first_project;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 길이를 입력하세요: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			int rand = (int)(Math.random()*10);
			arr[i] = rand;
		}
		System.out.println("바뀌기 전 배열 : " + Arrays.toString(arr));
		
		for(int i=0; i<=(n-1)/2; i++) {
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		System.out.println("바귄 후 배열 : " + Arrays.toString(arr));
		

	}

	
}
