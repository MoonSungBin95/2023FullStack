package Meeting_Room;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

enum Day  {
	Mon,Tue,Wed,Tur,Fri,Sat,Sun
}
public class Reservation_Prompt {
	static final String black    = "\u001B[30m" ;    
	static final String red      = "\u001B[31m" ;    
	static final String green    = "\u001B[32m" ;    
	static final String yellow   = "\u001B[33m" ;    
	static final String blue     = "\u001B[34m" ;    
	static final String purple   = "\u001B[35m" ;    
	static final String cyan     = "\u001B[36m" ;    
	static final String white    = "\u001B[37m" ;    
	static final String b_black    = "\u001B[40m" ;  
	static final String b_red      = "\u001B[41m" ;  
	static final String b_green    = "\u001B[42m" ;  
	static final String b_yellow   = "\u001B[43m" ;  
	static final String b_blue     = "\u001B[44m" ;  
	static final String b_purple   = "\u001B[45m" ;  
	static final String b_cyan     = "\u001B[46m" ;  
	static final String b_white    = "\u001B[47m" ;  
	                                                 
	static final String exit     = "\u001B[0m" ;     
	
	public void Prompt_calender(Reservation_Arr[][] dayArr) {
		Day[] day = Day.values();
		Calendar today = Calendar.getInstance();
		int last_day = today.getActualMaximum(Calendar.DATE);
		System.out.println("\t\t\t" + (today.get(Calendar.MONTH)+1) + "월");
		
		for(Day d: day) {
			System.out.printf("%s\t", d);
		}
		
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				if(Collections.frequency(Arrays.asList(dayArr[i][j].name), null) <= 1) {
					System.out.print(b_red + dayArr[i][j].day + "\t");
				} else if(Collections.frequency(Arrays.asList(dayArr[i][j].name), null) <= 4) {
					System.out.print(b_yellow + dayArr[i][j].day + "\t");
				} else {
					System.out.print(b_green + dayArr[i][j].day + "\t");
				}
				if(dayArr[i][j].day==last_day) {
					break;
				}
			}
			System.out.println(exit);
		}
	}
	
	public void Prompt_main() {
		String prompt = """
				=====================================================
						<< Reserv System >>
					 
					1. 예약하기
					2. 예약 조회하기
					3. 예약 변경 및 취소
					4. 종료
					
				=====================================================
				""";
		System.out.println(prompt);
	}
			
}
