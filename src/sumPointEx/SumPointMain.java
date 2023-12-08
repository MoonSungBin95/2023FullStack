package sumPointEx;

public class SumPointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Iced Latte", "Hot Latte", "Iced  Americano", "Hot Americano", "Expresso"};
		sumPointC sumPointc = new sumPointC();
		int numOfPoint = 5;
		
		int sumPoint = sumPointc.getToTalPoint(numOfPoint);
		float average;
		
		System.out.println("입력받은 점수의 합은? " + sumPoint);
		average = sumPoint/5;
		System.out.println("입력받은 점수의 평균은? " + average);
		
		sumPointc.showMenu(str);
	}

}
