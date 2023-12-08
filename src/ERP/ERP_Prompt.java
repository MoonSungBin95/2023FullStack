package ERP;

public class ERP_Prompt {
	
	public void Prompt_Main() {
		
		String prompt = """
				=====================================================
						<< Java ERP Program >>
					
					0. 관리자 모드
					1. 사원정보 등록
					2. 점수 조회
					3. 종료하기
					
				=====================================================
				""";
		System.out.println(prompt);
	}
	
	public void Prompt_manage() {
		String prompt = """
				=====================================================
							<< 관리자 모드 >>
					
					1. 전체성적 조회
					2. 부서성적 조회
					3. 사원정보 수정
					4. 종료하기
				
				=====================================================
				""";
		System.out.println(prompt);
	}
	
}
