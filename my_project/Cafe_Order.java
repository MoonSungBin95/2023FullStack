package my_project;
import java.util.*;
public class Cafe_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make_Array make_array = new Make_Array();
		Prompt prompt = new Prompt();
		Scanner scanner = new Scanner(System.in);
		String[] menu = new String[0];
		
		int[] price = new int[0];
		int sum = 0;
		int num = 0;
		int n = 0;
		boolean program = true;
		
	Main : while(program) {
			prompt.Prompt_main();  // 메인메뉴 출력
			System.out.print("번호를 입력해주세요 : ");
			String input = scanner.nextLine();
			num = Integer.parseInt(input);	
			
			switch(num) {
			case 0:  // 관리자 모드
				
			case 1:  // 메뉴 조회하기
				if (menu.length == 0) {
					System.out.println("등록된 메뉴가 없습니다. 메뉴를 등록해 주세요.");
					break;
				} else {
					prompt.Prompt_menu(menu,price);  // 저장된 메뉴 출력
				}
				break;
			case 2:  // 메뉴 등록하기 << (비회원) 주문하기로 바꾸기
				System.out.print("등록하실 메뉴의 이름을 적어주세요. : ");
				input = scanner.nextLine();
				menu = make_array.Arr_Str(menu, input);	  // 메뉴 배열에 추가된 메뉴 포함시키기
				
				System.out.printf("%s 메뉴의 가격을 책정하세요. :", input);
				int input_price = Integer.parseInt(scanner.nextLine());
				price = make_array.Arr_Int(price, input_price);
				
				System.out.printf("%s 메뉴가 등록 되었습니다.",input);
				break;
			case 3: // 주문하기 << (회원) 주무하기로 바꾸기
				if (menu.length == 0) {
					System.out.println("등록된 메뉴가 없습니다. 메뉴를 등록해 주세요.");
					break;
				}
				int count = 1;
				int[] index = new int[0];  // 주문하는 커피 번호 저장하는 배열 선언
				int[] order = new int[0];  // 주문 수량 저장하는 배열 선언
				sub : for(;;) {
					for (int i=0; i < menu.length; i++) {
						System.out.printf("%d. %s\t%d원\n",(int)(i+1), menu[i],price[i]);
					}
					System.out.print("주문하실 메뉴(번호)를 선택해주세요.: ");
					int a = Integer.parseInt(scanner.nextLine());  // a : 마땅히 쓸 변수 생각이 안남
					System.out.println("수량을 입력해주세요.: ");
					int b = Integer.parseInt(scanner.nextLine());
					
					index = make_array.Arr_Int(index, a);
					order = make_array.Arr_Int(order, b);
					
					sum += price[a-1] * b;   // 선택한 커피 번호에 해당하는 가격과 수량 덧셈 
					System.out.println("---------------------");
					for (int i=0; i < count; i++) {
						System.out.printf("%s\t%d잔\n",menu[index[i]-1],order[i]);
					}
					System.out.println("---------------------");
					System.out.printf("Total : %d원\n", sum);
					System.out.print("더 추가하시려면 1번을, 결제하시려면 엔터를 눌러주세요.: ");
					input = scanner.nextLine();
					if (input.isBlank()) {
						break sub;
					} else {
						count +=1;
						continue;						
					}
					}
				System.out.println("음료를 곧 준비해드리겠습니다. 잠시만 기다려 주세요.");
				break Main;
			case 4:  // 삭제하기 << 종료하기
				prompt.Prompt_del(menu,price);
				input = scanner.nextLine();
				n = Integer.parseInt(input);
				
				String[] tmp_menu = new String[menu.length-1];  // 메뉴를 삭제하고 옮길 배열을 기존 배열보다 1 작게 생성
				for(int i=0; i < menu.length; i++) {            // 기존 메뉴를 하나씩 받음
					if (i == n-1)   // 삭제할 메뉴의 인덱스(n-1)와 같으면 다음 메뉴로 넘어감
						continue;
					for(int j=0; j < tmp_menu.length; j++) {   // 옮길 배열의 값을 하나씩 받아서 해당 칸이 비어있는지 확인
						if (tmp_menu[j] == null) {             // 비어있으면 메뉴를 집어넣음
							tmp_menu[j] = menu[i];
							break;
						} else      // 비어있지 않으면 다음 칸으로 이동해서 비어있는지 확인
							continue;		
					}
				}
				menu = tmp_menu;
					
				int[] tmp_arr = new int[price.length-1];
				for(int i=0; i < price.length; i++) {
					if (i == n-1)
						continue;
					for(int j=0; j<price.length; j++) {
						if(tmp_arr[j] == 0) {
							tmp_arr[j] = price[i];
							break;
						} else
							continue;
					}
				}
				price = tmp_arr;
				prompt.Prompt_menu(menu, price);
				break;
			case 5:  // 종료하기
				System.out.println("프로그램을 종료합니다.");
				break Main;
			}
		}
	
	}

}
