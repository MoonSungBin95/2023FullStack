package day20231130;

public class ThrwoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		try {
			System.out.println("gdgd");
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("gdgdgdgdd");

		} finally {
			System.out.println("gd");
		}
	}

}
