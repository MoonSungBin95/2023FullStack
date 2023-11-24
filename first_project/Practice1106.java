package first_project;
import java.util.*;
public class Practice1106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int month = 11;
		int day = 07;
		int n = 2;
		double weight = 5.4;
		String name = "댕댕이";
		
		String sentence = "우리집" + name;
		String copy = sentence;
		System.out.println(copy);
		copy = copy + "항상 건강하게 지내자";
		System.out.println(copy);
		
		System.out.println("--------------------");
		System.out.println("우리집" + " " + name + " " + month + "월 " + day + "일 다이어트 일지");
		System.out.println("--------------------");
		System.out.println("식사 횟수: " + n + "회");
		System.out.println("몸무게: " + weight + "kg");
		
		
		String item = "라면";
		int price = 800;
		double weight = 0.12;
		boolean discounted = false;
		System.out.printf("상품-%s 가격-%d원 무게-%fkg 할인여부-%b", item, price, weight, discounted);
		
		
		// while 문 연습
		
		int n = 1;
		while (n < 4) {
			System.out.println(n);
			n++;
		}
	
		System.out.println("END");
		
		int num = 5;
		while (num-- > 0) {
			System.out.print("* ");
		}
		
		
		for (int i = 1; i <=10; i++) {
			System.out.printf("i = %d, ",	i);
			if (i == 3) {
				break;
			}
		}
		
		
		
	
		
		for(int i = 1; i <= 10; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.printf("짝 ");
				continue;
			}
			System.out.printf("%d ", i);
		}
		
		
		
		// Switch-case 연습
		Scanner scanner = new Scanner(System.in);
		System.out.printf("색깔을 입력해주세요: ");
		String color = scanner.next();
		scanner.close();
		
		switch (color) {
		case "RED":
			System.out.println("빨간불이 켜집니다.");
			break;
		case "YELLOW":
			System.out.println("노란불이 켜집니다.");
			break;
		case "GREEN":
			System.out.println("초록불이 켜집니다.");
			break;
		default:
			System.out.printf("에러, 잘못된 색 입력: %s\n", color);
				
		}
		
		
		// 점수 두개 입력 받기
		Scanner input = new Scanner(System.in);
		System.out.printf("점수를 입력해 주세요: ");
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		
		if (a >= 90 && b >= 90) {
			System.out.println("전액 장학금 지급 대상입니다.");
		} else if (a >= 90 || b >= 90) { 
			System.out.println("반액 장학금 지급 대상입니다.");
		} else {
			System.out.println("장학금 지급 대상이 아닙니다.");
		}
		
		
		// 정수 홀수 구분하기
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수를 입력해 주세요: ");
		int num = scanner.nextInt();
		scanner.close();
		
		String result = ( num % 2 == 0 ) ? "짝수" : "홀수";
		System.out.printf("정수 %d는(은) %s입니다.", num, result);
		
		
		// 문제풀이
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택: ");
			int num = scanner.nextInt();
			int cash = 0;
			switch(num) {
			case 1:
				System.out.println("예금하실 금액을 입력해 주세요.>");
				cash = scanner.nextInt();
				balance += cash;
				System.out.println("예금되었습니다.");
				break;
			case 2:
				System.out.printf("현재 잔액은 %d원 입니다.\n", balance);
				System.out.println("출금하실 금액을 입력해주세요.>");
				cash = scanner.nextInt();
				balance -= cash;
				System.out.printf("출금되었습니다. 현재 잔액은 %d원 입니다.\n", balance);
				break;
			case 3:
				System.out.printf("현재 잔액은 %d원 입니다.%n", balance);
				break;
			}
			if (num == 4) {
				System.out.println("죵료되었습니다.");
				break;
			}
		}
		
		*/
		
	
		
	}
	
}
