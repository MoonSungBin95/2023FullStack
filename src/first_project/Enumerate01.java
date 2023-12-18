package first_project;

import java.util.Calendar;
import java.lang.*;
public class Enumerate01 {

	public enum Week {
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday,
		Sunday
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today = Week.Sunday ; break;
		case 2: today = Week.Monday ; break;
		case 3: today = Week.Tuesday ; break;
		case 4: today = Week.Wednesday ; break;
		case 5: today = Week.Thursday ; break;
		case 6: today = Week.Saturday ; break;
		}
		
		if(today == Week.Sunday) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
		
	}
	
	
}
