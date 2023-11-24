package first_project;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다이아 만들기
		int i = 0;
		for (i=0; i <=10; i++) {
			for (int j=1; j<=20; j++) {
				if( j>=10-i && j<=10+i) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		
		for (i=0; i<=10; i++) {
			for (int j=1; j<=20; j++) {
				if (j<=i || j>=20-i) {
					System.out.printf(" ");
				}
				else {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
	}

}
