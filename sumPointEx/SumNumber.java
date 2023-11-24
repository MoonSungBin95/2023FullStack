package sumPointEx;

public class SumNumber {
	
	public void sumAll(int starNum, int endNum) {
		int sum = 0;
		for(int i=starNum; i<=endNum; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지의 합은: %d", starNum, endNum, sum);
	}
}
