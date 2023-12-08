package first_project;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"kim","lee","park","choi"};
		try {
			System.out.printf("0번 인덱스 요소: %s\n", names[0]);
			System.out.printf("4번 인덱스 요소: %s\n", names[4]);
			System.out.printf("3번 인덱스 요소: %s\n", names[3]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("인덱스 접근이 잘못되었습니다.");
		} finally {
			System.out.println("finally 문은 예외 발생과 상관없이 항상 수해됩니다.");
		}
		
		System.out.println("프로그램이 종료됩니다.");
		
	} // close of main
} // close of class
