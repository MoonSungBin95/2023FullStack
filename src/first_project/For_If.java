package first_project;

public class For_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 누적 값 더하기
		printSum(1,10);
	}
	
		public static void printSum(int start, int end) {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				System.out.printf("%d", i);
				sum += i;
				if (i == end) {
					break;
				}
				else {
					System.out.printf(" + ");				
				}
			}
			System.out.printf(" = %d", sum);
		}
}
