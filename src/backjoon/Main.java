package backjoon;
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int[] arr2 = new int[9];
		
		for(int i=0; i<9; i++) {
			
			arr[i] = Integer.parseInt(bf.readLine());
			arr2[i] = arr[i];

		}
		
		Arrays.sort(arr2);
		
		for(int item : arr) {
			if(arr2[8] == item) {
				System.out.println(item);
				System.out.println(Arrays.toString(arr));
				
			}
		}

		
		
		
		
		
	}
}
