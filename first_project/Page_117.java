package first_project;

import java.util.Scanner;

public class Page_117 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바의 정석 117p 3-25
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		scanner.close();
		
		if ('0' <= ch && ch <='9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		} else if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
	}

}
