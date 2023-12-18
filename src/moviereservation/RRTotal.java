package moviereservation;

public class RRTotal {
	
	public static void GetRating(String name) {
		DAO dao = new DAO();
		int reservseat = dao.GetReservSeat(name);
		int total = dao.GetTotalHallSeat(name);
		
		System.out.println(reservseat/total);
	}
	
}
