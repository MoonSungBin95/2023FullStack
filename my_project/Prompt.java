package my_project;

public class Prompt {

	
	public void Prompt_main() {
		String prompt = """
				=====================================================
						<< Java Cafe >>
					
					0. 관리자 모드 
					1. 메뉴 조회하기
					2. (비회원) 주문하기
					3. (회원) 주문하기
					4. 회원가입하기
					5. 종료하기
					
				=====================================================
				""";
		System.out.println(prompt);
	}
	
	public void Prompt_manage() {
		String prompt = """
				=====================================================
						<< 관리자 모드 >>
					
					1. 메뉴 등록하기
					2. 메뉴 삭제하기
					3. 회원 관리하기
					4. 매출 조회
					5. 종료하기
					
				=====================================================
				""";
		System.out.println(prompt);
	}
	
	public void Prompt_menu(String[] menu, int[] price) {
		System.out.println("************************************");
		for(int i=0; i < menu.length; i++) {
			System.out.printf("%s\t%d원\n", menu[i],price[i]);
		}
		System.out.println("************************************");
	}
	
	public void Prompt_del(String[] menu, int[] price) {
		System.out.println("************************************");
		for(int i=0; i < menu.length; i++) {
			System.out.printf("%d. %s\t%d원\n", i+1,menu[i],price[i]);
		}
		System.out.println("************************************");
		System.out.println("삭제하실 메뉴를 선택하세요. :");
	}
	
	
}
