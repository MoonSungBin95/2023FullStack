package ERP;
import java.util.Scanner;
public class ERP_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기 부서 코드번호 생성
		String[] dep = {"IT", "HR","영업","마케팅","해외"};
		int[] dep_code = {101, 102, 103, 104, 105};
		//사원정보 저장 배열 선언
		String[] emp_name = new String[0];
		String[] emp_dep = new String[0];
		int[] emp_serialNum = new int[0];
		int[] emp_apt = new int[0];
		int[] emp_code = new int[0];
		int[] emp_rank = new int[0];
		int[] IT_rank = new int[0];
		int[] HR_rank = new int[0];
		int[] Sale_rank = new int[0];
		int[] Maket_rank = new int[0];
		int[] global_rank = new int[0];
		
		ERP_Prompt prompt = new ERP_Prompt();
		prompt.Prompt_Main();		
		Scanner scan = new Scanner(System.in);
		
		
	}

}
