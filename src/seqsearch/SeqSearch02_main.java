package seqsearch;
import java.util.*;
public class SeqSearch02_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		SeqSearch02 seqsearch02 = new SeqSearch02();
		System.out.print("요솟수: ");
		int num = Integer.parseInt(scanner.nextLine());
		int[] arr = new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+ i +"] = ");
			arr[i] = Integer.parseInt(scanner.nextLine());
		}
		
		System.out.print("검색할 값: ");
		int key = Integer.parseInt(scanner.nextLine());
		
		int idx = seqsearch02.SeqSearch02(arr, num, key);
		
		if(idx != -1) {
			System.out.println(key +"값은 x["+ idx +"] 에 있습니다.");			
		} else {
			System.out.println("해당 값이 없습니다.");
		}
		
		
	}

}
