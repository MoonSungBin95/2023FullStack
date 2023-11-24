package first_project;

import java.util.Random;

public class Snow_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 눈오는 트리 만들기
		int i = 0;
		Random random = new Random();
		for (i=0; i <=10; i++) {
			int num = random.nextInt(20);
			for (int j=1; j<=20; j++) {
				if( j>=10-i && j<=10+i) {
					System.out.printf("*");
				}
				else if( j == num) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		
		for (i=0; i <=5; i++) {
			int num = random.nextInt(20);
			for (int j=1; j<=20; j++) {
				if ( j>=8 && j<=12) {
					System.out.printf("*");
				}
				else if( j == num) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		
			for (int j=1; j<=20; j++) {
				if (j>=7 && j <=13) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
		}
	}

}
