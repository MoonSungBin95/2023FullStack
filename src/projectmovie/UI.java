package projectmovie;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class UI {
	
	public void Run() {
		Scanner scan = new Scanner(System.in);
		Prompt prompt = new Prompt();
		SQLMETHOD sq = new SQLMETHOD();
		
		String input = "";
		int num = 0;
main :	while(true) {
			prompt.Prompt_main();
			num = Integer.parseInt(scan.nextLine());
			switch(num) {
			case 1:
				ArrayList<Movies> arr = sq.MovieList();
				Iterator it = arr.iterator();
				while(it.hasNext()) {
					System.out.println("MovieTitle: "+ it.next().toString());
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break main;
			case 999:
				prompt.Prompt_manager();
				num = Integer.parseInt(scan.nextLine());
				switch(num) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					default :
						System.out.println("잘못 누르셨습니다.");
						break;
				}
				break;
				default :
					System.out.println("다시 입력해 주세요");
					break;
			}
			
		}
		
	}
}
