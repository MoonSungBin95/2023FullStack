package seqsearch;

import java.util.Scanner;

public class SeqSearch_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeqSearch seqsearch = new SeqSearch();
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.print("요솟수 : ");
		int num = scanner.nextInt();
		int[] arr = new int[num];
		
		for (int i=0; i<num; i++) {
			System.out.print("x["+ i + "] = ");
			arr[i] = scanner.nextInt();
		}
		System.out.print("검색할 값: ");
		int key = scanner.nextInt();
		
		int idx = seqsearch.seqSearch(arr,key,num);
	
		if (idx == -1) {
			System.out.println("검색 값의 요소가 없습니다.");
		} else {
		System.out.println(key +" 값은 x["+ idx +"] 에 있습니다.");
		}
	}

}
