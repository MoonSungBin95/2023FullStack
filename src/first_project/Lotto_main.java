package first_project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Lotto_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lottery = new ArrayList<Integer>();
		Random random = new Random();
		int[] arr = new int[6];
		int num = 0;
		for (int i=1; i<=45;i++) {
			lottery.add(i);
		}
		
		// use random
		for(int i=0; i<6; i++) {
			arr[i] = random.nextInt(45)+1;
			if(lottery.contains(arr[i])) {
				lottery.remove(arr[i]);
				System.out.println((i+1)+"번째 당첨번호는: "+arr[i]);
			} else
				i--;
		}
		
		// use Collections.shuffle
		
//		Collections.shuffle(lottery);
//		for(int i=0; i<6; i++) {
//			arr[i] = lottery.get(i);
//			lottery.remove(i);
//		}
		
		System.out.println("이번회차 당첨번호는 "+ Arrays.toString(arr));
		System.out.println("뽑고 남은 숫자: "+lottery.size());
		Arrays.sort(arr);
		System.out.println("이번회차 당첨번호는 "+ Arrays.toString(arr));
	}

}
