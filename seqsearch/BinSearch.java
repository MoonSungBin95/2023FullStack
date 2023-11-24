package seqsearch;
import java.util.*;
public class BinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("x[0]: ");
		arr[0] = scan.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i +"]: ");
				arr[i] = scan.nextInt();
			} while (arr[i] <= arr[i-1]);
		}
	
		System.out.print("검색 값: ");
		int key = scan.nextInt();
		int idx = Arrays.binarySearch(arr, key);
		
		if(idx<0) {
			System.out.println("검색 값의 요소가 없습니다.");
		} else {
			System.out.println("검색 값은 x["+ idx +"]에 있습니다.");
		}
	
		
		
	}
	
	

}
