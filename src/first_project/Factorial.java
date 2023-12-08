package first_project;

public class Factorial {
	
	public int Factorial (int num) {
		return num > 0 ? num * Factorial(num-1) : 1;
	}
	
//	public int Factorial(int num) {
//		if(num > 0) {
//			return num * Factorial(num-1);
//		} else
//			return 1;
//	}

	
}
