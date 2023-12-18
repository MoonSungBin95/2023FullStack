package moviereservation;

public class Rating {
	
	public static void GetRating() {
		DAO dao = new DAO();
		int reservseat = dao.GetReservSeat("해리포터");
		int total = dao.GetTotalHallSeat("해리포터");
		
		System.out.println(reservseat/total);
	}

}
