package projectmovie;

public class BookingStatus {
	private String Id; 
	private String infoName;
	private String PhoneNUMBER;
	private String SerialNumber; 
	private String MovieTitle;
	private String Hall;
	private String ReservationTimeCode;
	private String SeatNumber;
	private String NOP;
	private String OrderTime;
	private int Payment; 
	private String TicketStatus;
	

    
    public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getInfoName() {
		return infoName;
	}
	public void setInfoName(String infoName) {
		this.infoName = infoName;
	}
	public String getPhoneNUMBER() {
		return PhoneNUMBER;
	}
	public void setPhoneNUMBER(String phoneNUMBER) {
		PhoneNUMBER = phoneNUMBER;
	}
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public String getMovieTitle() {
		return MovieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		MovieTitle = movieTitle;
	}
	public String getHall() {
		return Hall;
	}
	public void setHall(String hall) {
		Hall = hall;
	}
	public String getReservationTimeCode() {
		return ReservationTimeCode;
	}
	public void setReservationTimeCode(String reservationTimeCode) {
		ReservationTimeCode = reservationTimeCode;
	}
	public String getSeatNumber() {
		return SeatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		SeatNumber = seatNumber;
	}
	public String getNOP() {
		return NOP;
	}
	public void setNOP(String nOP) {
		NOP = nOP;
	}
	public String getOrderTime() {
		return OrderTime;
	}
	public void setOrderTime(String orderTime) {
		OrderTime = orderTime;
	}
	public int getPayment() {
		return Payment;
	}
	public void setPayment(int payment) {
		Payment = payment;
	}
	public String isTicketStatus() {
		return TicketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		TicketStatus = ticketStatus;
	}
	public BookingStatus(String id, String infoName, String phoneNUMBER, String serialNumber, String movieTitle,
			String hall, String reservationTimeCode, String seatNumber, String nOP, String orderTime, int payment,
			String ticketStatus) {
		super();
		Id = id;
		this.infoName = infoName;
		PhoneNUMBER = phoneNUMBER;
		SerialNumber = serialNumber;
		MovieTitle = movieTitle;
		Hall = hall;
		ReservationTimeCode = reservationTimeCode;
		SeatNumber = seatNumber;
		NOP = nOP;
		OrderTime = orderTime;
		Payment = payment;
		TicketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "BookingStatus [Id=" + Id + ", infoName=" + infoName + ", PhoneNUMBER=" + PhoneNUMBER + ", SerialNumber="
				+ SerialNumber + ", MovieTitle=" + MovieTitle + ", Hall=" + Hall + ", ReservationTimeCode="
				+ ReservationTimeCode + ", SeatNumber=" + SeatNumber + ", NOP=" + NOP + ", OrderTime=" + OrderTime
				+ ", Payment=" + Payment + ", TicketStatus=" + TicketStatus + "]";
	}
	
	
	
}
