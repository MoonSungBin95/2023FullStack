package first_project;

import java.util.Scanner;

public class Loop_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for문에 loop1이라는 이름을 붙임
		/*
		Loop1 : for(int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if(j==5) {
					break Loop1; // end
//					break; // 
//					continue Loop1;  // end of i
//					continue;    // end of for j
				}
				System.out.println(i +"*"+ j +"="+ i*j);
			}
			System.out.println();
		}
		*/
		// 예제 4-34
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
			while(true) {
				System.out.println("(1) square");
				System.out.println("(2) square root");
				System.out.println("(3) log");
				System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0) > ");
				
				String tmp = scanner.nextLine();
				menu = Integer.parseInt(tmp);
				
				if(menu == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (!(1<= menu && menu <= 3 )) {
					System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
					continue;
				}
				
				for(;;) {
					System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99) >");
					tmp = scanner.nextLine();
					num = Integer.parseInt(tmp);
					
					if(num == 0)
						break;
					if(num == 99)
						break outer;
					switch(menu) {
					case 1:
						System.out.println("result="+ num*num);
						break;
					case 2:
						System.out.println("result="+ Math.sqrt(num));
						break;
					case 3:
						System.out.println("result="+ Math.log(num));
					}
				}
			}
	}
}
