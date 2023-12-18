package moviereservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class DAO {
	// JDBC 관련 변수
	Connection conn = null;
	Statement stmt = null;
	
	String url = "jdbc:mysql://127.0.0.1:3306/?user=test";
	String user = "test";
	String pass = "1234";
	
	public DAO() {
		conn = getConnection();
	}
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			// 드라이버 세팅
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Connection 획득
			conn = DriverManager.getConnection(url,user,pass);
		} catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		return conn;
	}
	
	public int GetTotalHallSeat(String name) {
		// 해당 영화의 상영기간 중 전체 예매 좌석 수
		
		int i=0;
		try {
			// DB 접속
			String dbinit = "USE cinemamanagement";
			stmt = conn.createStatement();
			stmt.executeUpdate(dbinit);
			
			// 총 좌석 수 가져오기
			String sql = "SELECT a.t1, b.t2 FROM (SELECT COUNT(*) t1 FROM timetablet120231215 WHERE nametable = '"+name+"') a,"
					+ "(SELECT COUNT(*) t2 FROM timetablet220231215 WHERE nametable = '"+name+"') b";
			ResultSet rs = stmt.executeQuery(sql);			

			
			// 각 관별로 가져온 좌석 수 배열에 넣기
			while(rs.next()) {
				i = rs.getInt("t1") + rs.getInt("t2");
			}
			return i;
				
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return i;
	}

	
	public int GetReservSeat(String a) {
		// ==== DB 작업 ====
		// 해당 영화의 예매 좌석 수 가져오기
		int num =0;
		try {
			stmt = conn.createStatement();
			
			//SQL 문 입력
			//DB 접속
			String sql1 = "USE consumerinfo";
			stmt.executeUpdate(sql1);
			// 좌석 수 가져오기
			String sql = "SELECT COUNT(SeatNumber) AS num FROM bookingstatus WHERE MovieTitle = '"+ a + "'";
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			num = rs.getInt("num");
			rs.close();
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		return num;
	}
	
	public int GetHallSeat(String number) {
		// ==== DB 작업 ====
		// 해당 관의 좌석 수 가져오기
		int num =0;
		try {
			stmt = conn.createStatement();
			
			//SQL 문 입력
			//DB 접속
			String sql1 = "USE hall";
			stmt.executeUpdate(sql1);
			// 좌석 수 가져오기
			String sql = "SELECT COUNT(*) AS seat FROM hall"+number+"seatmap";
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			num = rs.getInt("seat");
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		return num;
	}
	
	
	
}
