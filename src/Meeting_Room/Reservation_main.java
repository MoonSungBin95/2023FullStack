//package Meeting_Room;
//import com.opencsv.*;
//import com.opencsv.exceptions.CsvValidationException;
//import org.apache.commons.lang3.*;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.*;
//
//public abstract class Reservation_main {
//	
//	/**
//	 * @param args
//	 * @throws IOException
//	 * @throws CsvValidationException
//	 */
//	public static void main(String[] args) throws IOException, CsvValidationException {
//		// TODO Auto-generated method stub
//		Calendar today = Calendar.getInstance();
//		int last_day = today.getActualMaximum(Calendar.DATE);
//		Scanner scanner = new Scanner(System.in);
//		
//		Reservation_Arr[][] dayArr = new Reservation_Arr[5][7];
//		Reservation_Arr reArr = new Reservation_Arr();
//		Reservation_Prompt prompt = new Reservation_Prompt();
//		
//		int x = 0;   // 날짜 입력받으면 이중 배열에서 인덱싱 하기 위한 (x,y)좌표값
//		int y = 0;
//		int index = 0;
//		int input_num = 0;  // scanner 값 받을 변수 선언 및 초기화 - 번호 용
//		int input_Int = 0;
//		int input_Int_check = 0;
//		int reserv_x = 0;
//		int reserv_y = 0;
//		String input_Str = ""; // scanner 값 받을 변수 선언 및 초기화 - Str 용
//		String[] time = {
//				"09:00~09:50",
//				"10:00~10:50",
//				"11:00~11:50",
//				"12:00~12:50",
//				" 1:00~ 1:50",
//				" 2:00~ 2:50",
//				" 3:00~ 3:50",
//				" 4:00~ 4:50"
//		};
//		
//		
//		// 날짜 넣은 이중 배열
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<7; j++) {
//				dayArr[i][j] = new Reservation_Arr();
//				dayArr[i][j].day = i*7 + j+1;
//				if(dayArr[i][j].day == last_day) {
//					break;
//				}
//			}
//		}			
//		// 초기값 입력
//		reArr.Set_data(dayArr);
//		
//main :	while(true) {
//			// 달력 출력
//			prompt.Prompt_calender(dayArr);
//			prompt.Prompt_main();
//			int num = Integer.parseInt(scanner.nextLine());
//			switch(num) {
//			case 1:
//				prompt.Prompt_calender(dayArr);
//				System.out.print("예약을 원하시는 날짜를 선택해주세요> ");
//				input_num = Integer.parseInt(scanner.nextLine());
//				x = input_num / 7;
//				y = input_num % 7-1;	
//			
//				for(int i=0; i<8; i++) {
//					System.out.printf("%d. %s | %s\n", i+1, time[i], dayArr[x][y].name[i]);
//				}
//				System.out.print("예약을 원하시는 시간대를 선택해주세요> ");
//				input_num = Integer.parseInt(scanner.nextLine());
//				if(dayArr[x][y].name[input_num-1] == null) {
//					System.out.print("예약자분 성함을 입력해주세요: ");
//					input_Str = scanner.nextLine();
//					dayArr[x][y].name[input_num-1] = input_Str;
//					System.out.print("총 인원을 입력해주세요: ");
//					input_Int = Integer.parseInt(scanner.nextLine());
//					dayArr[x][y].number[input_num-1] = input_Int;
//					System.out.print("조회하실 때 사용할 비밀번호를 입력하세요: ");
//					input_Int = Integer.parseInt(scanner.nextLine());
//					dayArr[x][y].password[input_num-1] = input_Int;
//					System.out.print("확인을 위해 한번 더 입력하세요: ");
//					input_Int_check = Integer.parseInt(scanner.nextLine());
//					if(input_Int_check == input_Int) {
//						System.out.println("예약되었습니다.");						
//					} else {
//						System.out.println("비밀번호가 다릅니다. 다시 예약해주세요.");
//					}
//				} else {
//					System.out.println("이미 예약된 시간대입니다.");
//				}
//				break;
//			case 2:
//				prompt.Prompt_calender(dayArr);
//				System.out.print("조회하실 날짜를 선택해주세요> ");
//				input_num = Integer.parseInt(scanner.nextLine());
//				x = input_num / 7;
//				y = input_num % 7-1;
//				
////				for(int i=0; i<8; i++) {
////					System.out.printf("%d. %s | %s\n", i+1, time[i], dayArr[x][y].name[i]);
////				}
//				
//				System.out.println("예약자분 성함을 입력해주세요>");
//				input_Str = scanner.nextLine();
//				System.out.println("예약 비밀번호를 입력해주세요>");
//				input_Int = Integer.parseInt(scanner.nextLine());
//				index = Arrays.toString(dayArr[x][y].name).indexOf(input_Str);
//				System.out.printf("%s : %s %d명\n", time[index], input_Str, dayArr[x][y].number[index]);
//				
//				
//				System.out.println("종료를 원하시면 y, 메뉴로 돌아가시려면 n을 입력해주세요> ");
//				input_Str = scanner.nextLine();
//				if(input_Str == "y" ) {
//					break main;
//				} else {
//					break;
//				}
//			case 3: // 예약 변경 및 취소
//				System.out.println("예약자분 성함을 입력해주세요>");
//				input_Str = scanner.nextLine();
//				System.out.println("예약 비밀번호를 입력해주세요>");
//				input_Int = Integer.parseInt(scanner.nextLine());
//  for_main :	for(int i=0; i<dayArr.length; i++) {
//					for(int j=0; j<dayArr[i].length; j++) {
//						if(Arrays.asList(dayArr[i][j].name).contains(input_Str) && Arrays.asList(dayArr[i][j].password).contains(input_Int)) {
//							index = Arrays.toString(dayArr[i][j].name).indexOf(input_Str);
//							reserv_x = i;
//							reserv_y = j;
//							break for_main;
//						}
//					}
//				}
//  				
//  				// 예약된 값 제거.
//  				Arrays.asList(dayArr[reserv_x][reserv_y].name).remove(input_Str);
//  				Arrays.asList(dayArr[reserv_x][reserv_y].number).remove(dayArr[reserv_x][reserv_y].number[index]);
//  				Arrays.asList(dayArr[reserv_x][reserv_y].password).remove(dayArr[reserv_x][reserv_y].password[index]);
//  
//  				
//				System.out.println("1. 예약 변경  | 2. 예약 취소 >");
//				int input = Integer.parseInt(scanner.nextLine());
//				switch(input) {
//				case 1:
//					prompt.Prompt_calender(dayArr);
//					System.out.print("예약을 원하시는 날짜를 선택해주세요> ");
//					input_num = Integer.parseInt(scanner.nextLine());
//					x = input_num / 7;
//					y = input_num % 7-1;	
//				
//					for(int i=0; i<8; i++) {
//						System.out.printf("%d. %s | %s\n", i+1, time[i], dayArr[x][y].name[i]);
//					}
//					System.out.print("예약을 원하시는 시간대를 선택해주세요> ");
//					input_num = Integer.parseInt(scanner.nextLine());
//					if(dayArr[x][y].name[input_num-1] == null) {
//						System.out.print("예약자분 성함을 입력해주세요: ");
//						input_Str = scanner.nextLine();
//						dayArr[x][y].name[input_num-1] = input_Str;
//						System.out.print("총 인원을 입력해주세요: ");
//						input_Int = Integer.parseInt(scanner.nextLine());
//						dayArr[x][y].number[input_num-1] = input_Int;
//						System.out.print("조회하실 때 사용할 비밀번호를 입력하세요: ");
//						input_Int = Integer.parseInt(scanner.nextLine());
//						dayArr[x][y].password[input_num-1] = input_Int;
//						System.out.print("확인을 위해 한번 더 입력하세요: ");
//						input_Int_check = Integer.parseInt(scanner.nextLine());
//						if(input_Int_check == input_Int) {
//							System.out.println("예약되었습니다.");						
//						} else {
//							System.out.println("비밀번호가 다릅니다. 다시 이용해주세요.");
//							Arrays.asList(dayArr[reserv_x][reserv_y].name[index]).add(input_Str);
//			  				Arrays.asList(dayArr[reserv_x][reserv_y].number[index]).add(dayArr[reserv_x][reserv_y].number[index]);
//			  				Arrays.asList(dayArr[reserv_x][reserv_y].password[index]).add(dayArr[reserv_x][reserv_y].password[index]);
//						}
//					} else {
//						System.out.println("이미 예약된 시간대입니다.");
//					}
//					break;
//				case 2:
//					
//					break;
//				}
//				
//				break;
//			case 4:
//				break main;
//				
//				
//			} // switch close
//			
//		} // main : while close
//		
//	}  // main method close
//
//}  // class close
//
