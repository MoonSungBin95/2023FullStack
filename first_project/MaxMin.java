package first_project;
import java.util.Arrays;
import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			System.out.printf("%d. 숫자를 입력해주세요. :",i+1);
			int a = scan.nextInt();
			arr[i] = a;
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<5; i++) {
			if(arr[i]>=max) {
				max = arr[i];
			} else if (arr[i]<=min) {
				min = arr[i];
			}
		}
		
		System.out.printf("최댓값은 %d입니다.\n",max);
		System.out.printf("최소값은 %d입니다.\n",min);

		
		
		
		
	}                                                        
                            
}
