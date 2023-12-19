package projectMovie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class SQLMETHOD extends DB{
	
	Scanner sc = new Scanner(System.in);
	
	
	public ArrayList<Movies> MovieList(){
		ArrayList<Movies> arr = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM cinemamanagement.movies";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
			String a = rs.getString("MovieTitle");
			String b = rs.getString("MovieSerialNumber");
			String c = rs.getString("Genre");
			String d = rs.getString("ReleaseDate");
			String e = rs.getString("WithdrawDate");
			String f = rs.getString("ScreeningStatus");
			arr.add(new Movies(a, b, c, d, e, f));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	return arr;
	}
	
	public boolean CreatetimeTB(String datecode,String movietitle,String time,String hall) {  
		 String use = "USE cinemamanagement";
		 String sql1 = "CREATE TABLE IF NOT EXISTS TimetableT1" + datecode + "("
	    			+"    FilmOrder int NOT NULL AUTO_INCREMENT PRIMARY KEY,"
	    			+"    Hall1Timetable int,"
	                + "    Hall1Movietitle varchar(15)"
	                + ");";
		 String sql2 = "CREATE TABLE IF NOT EXISTS TimetableT2" + datecode + "("
 	    			+"    FilmOrder int NOT NULL AUTO_INCREMENT PRIMARY KEY,"	   	    			
 	                + "    Hall2Timetable int,"
 	                + "    Hall2Movietitle varchar(15)"	   	             
 	                + ");";
		 String sql3 = "CREATE TABLE IF NOT EXISTS TimetableT3" + datecode + "("
	    			+"    FilmOrder int NOT NULL AUTO_INCREMENT PRIMARY KEY,"
	                + "    Hall3Timetable int,"
	                + "    Hall3Movietitle varchar(15)"
	                + ");";
		 try {
	    	  conn.setAutoCommit(false);
	    	  ps = conn.prepareStatement(use);
	    	  ps.executeUpdate();
		      ps = conn.prepareStatement(sql1);
		      ps.executeUpdate();
	   	      ps = conn.prepareStatement(sql2);
	   	      ps.executeUpdate();
	   		  ps = conn.prepareStatement(sql3);
	   		  ps.executeUpdate();      
	   		  conn.commit();
		 }catch(Exception e) {
	         e.printStackTrace();
	         
	         if(conn != null) {
	        	 try {
	        		 conn.rollback();
	        	 }catch(Exception e1) {
	        		 e1.printStackTrace();
	        	 }
	         }
	         return false;
	      }
	   return true;
	   }

	
	public boolean SaveTimeTB(String datecode,String movietitle,String time,String hall) {
		   String sql1 =  "INSERT INTO CinemaManagement.TimetableT"+ hall + datecode + "(Hall" +hall+ "Timetable,Hall"+hall+"Movietitle)"
	               +"VALUES(?,?)";  
      
		   try {
	    	  conn.setAutoCommit(false);
	    	  ps = conn.prepareStatement(sql1);
              ps.setString(1,time);
              ps.setString(2,movietitle);
              ps.executeUpdate();
              conn.commit();
	      }catch(Exception e) {
	         e.printStackTrace();
	         
	         if(conn != null) {
	        	 try {
	        		 conn.rollback();
	        	 }catch(Exception e1) {
	        		 e1.printStackTrace();
	        	 }
	         }
	         return false;
	      }
	   return true;
	   }
	   
	   
	public boolean CreateSeatTB(String movietitle,String hall,String time,String timecode)  {
		   String use = "USE " + movietitle;
		   String sql = "CREATE TABLE IF NOT EXISTS T"+hall+timecode+time+"("
	               + "   SeatNumber varchar(2) primary key,"
	               + "   SerialNumber varchar(20)"
	               + ");";
		   try {
	    	 conn.setAutoCommit(false);
	    	 ps = conn.prepareStatement(use);
	    	 ps.executeUpdate();
	    	 ps = conn.prepareStatement(sql);
	         ps.executeUpdate();
	         
	         conn.commit();
	     
		   }catch(Exception e) {
	        e.printStackTrace();
	        
	        if(conn!=null) {
	        	 try {
	        		 conn.rollback();
	        	 }catch(Exception e1) {
	        		 e1.printStackTrace();
	        	 }
	         }
	         return false;
	      }
	   return true;
	   }
	   
	   
	
	public void copy(String movietitle,String hall,String time,String timecode) {
		   
		   String sql1 ="INSERT INTO " + movietitle+".T"+hall+timecode+time
	               + " SELECT * FROM hall.hall"+hall;
		   
		   try {
			   ps = conn.prepareStatement(sql1);
		       ps.executeUpdate();
		       conn.commit();		
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
	   }

	
	public void deleteTimeTB(String hall,String datecode,Integer time,String movietitle) {
		try {
		String sql = "DELETE FROM cinemamanagement.timetablet"+hall+"2023"+datecode
					+" WHERE Hall"+hall+"Timetable = ?";
		String sql2 = "DROP TABLE "+movietitle+".t"+hall+datecode+time+";";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, time);
		ps.executeUpdate();
		ps = conn.prepareStatement(sql2);
		ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//end of delete


	public HashMap<Integer,String> timeTablecheck(String datecode,String hall) {
		String sql ="SELECT * FROM cinemamanagement.timetablet"+hall+"2023"+ datecode; 		
		HashMap<Integer,String> arr = new HashMap<>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int a = rs.getInt("Hall"+hall+"Timetable");
				String b = rs.getString("Hall"+hall+"Movietitle");
			arr.put(a, b);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	
	public boolean RegiMovie(String MovieTitle, String MovieSerialNumber, String Genre, String ReleaseDate, String WithdrawDate, boolean ScreeningStatus) {
         
         try {
         conn.setAutoCommit(false);
         String use = "USE cinemamanagement";
          ps = conn.prepareStatement(use);
          ps.executeUpdate();
            
         String sql = "insert into cinemamanagement.movies (MovieTitle, MovieSerialNumber, Genre, ReleaseDate, WithdrawDate, ScreeningStatus)"
                     + "values (?, ?, ?, ?, ?, ?);";
         ps = conn.prepareStatement(sql);
         ps.setString(1, MovieTitle);
         ps.setString(2, MovieSerialNumber);
         ps.setString(3, Genre);
         ps.setString(4, ReleaseDate);
         ps.setString(5, WithdrawDate);
         ps.setBoolean(6, ScreeningStatus);
         ps.executeUpdate();
         
           conn.commit();
         return true;
         
      }catch(Exception e) {
            e.printStackTrace();
            if(conn!=null) {
               try {
                  conn.rollback();
               }catch(Exception e1) {
                  e1.printStackTrace();
               }
            }
            return false;
         }
                
      }

	public boolean RegiMoviecode(String MovieTitle, String MovieSerialNumber) {
        try {
        conn.setAutoCommit(false);
        String use = "USE cinemamanagement";
         ps = conn.prepareStatement(use);
         ps.executeUpdate();
           
        String sql = "insert into cinemamanagement.moviecode (MovieTitle, MovieSerialNumber)"
                    + "values (?, ?);";
        ps = conn.prepareStatement(sql);
        ps.setString(1, MovieTitle);
        ps.setString(2, MovieSerialNumber);
        
        ps.executeUpdate();
        
          conn.commit();
        return true;
        
     }catch(Exception e) {
           e.printStackTrace();
           if(conn!=null) {
              try {
                 conn.rollback();
              }catch(Exception e1) {
                 e1.printStackTrace();
              }
           }
           return false;
        }
	}   
     
      // 5-3. 새로운 영화 DB 생성
      public void CreateMovieDB(String MovieTitle) {
          try {
              conn.setAutoCommit(false);
              String sql1 = "CREATE DATABASE " + MovieTitle + " CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci;";
              ps = conn.prepareStatement(sql1);
              ps.executeUpdate();
              conn.commit();
          } catch(Exception e) {
               e.printStackTrace();
               if(conn!=null) {
                  try {
                     conn.rollback();
                  }catch(Exception e1) {
                     e1.printStackTrace();
                  }
               }
            }
      }
      
      // 5-4. 새로 만든 DB에 Info 테이블 만들고 영화 세부정보 추가
      public void CreateInfoTB(String MovieTitle, String MovieSerialNumber, int RunningTime, String MovieDescription, double MovieRating) {
          try {
              conn.setAutoCommit(false);
              String use = "USE " + MovieTitle;
              ps = conn.prepareStatement(use);
              ps.executeUpdate();
              String sql1 = "CREATE TABLE info("
                     + " MovieTitle varchar(15),"
                     + " MovieSerialNumber varchar(10),"
                     + " RunningTime int,"
                     + " MovieDescription varchar(30),"
                     + " MovieRating double,"
                     + " ReservationRate double"
                     + ");";
                     ps = conn.prepareStatement(sql1);
                     ps.executeUpdate();
              String sql2 = "insert into " + MovieTitle + ".info (MovieTitle, MovieSerialNumber, RunningTime, MovieDescription, MovieRating, ReservationRate) "
                     + "values (?, ?, ?, ?, ?, ?);";
              ps = conn.prepareStatement(sql2);
              ps.setString(1, MovieTitle);
              ps.setString(2, MovieSerialNumber);
              ps.setInt(3, RunningTime);
              ps.setString(4, MovieDescription);
              ps.setDouble(5, MovieRating);
              ps.setDouble(6, 0.0);	// 예매율은 기본 0.0으로 설정
              ps.executeUpdate();
            conn.commit();
          } catch(Exception e) {
               e.printStackTrace();
               if(conn!=null) {
                  try {
                     conn.rollback();
                  }catch(Exception e1) {
                     e1.printStackTrace();
                  }
               }
            }
      }
      
      // 5-5. 가장 최근 등록된 영화의 시리얼넘버 구하기   
      public String SearchLastSerialNumber() {   
          String lastSerialNumber = "";
          try {
              conn.setAutoCommit(false);
              String sql1 = "use cinemamanagement;";
              ps = conn.prepareStatement(sql1);
              ps.execute();
              String sql2 = "SELECT MovieSerialNumber FROM movies ORDER BY MovieSerialNumber DESC LIMIT 1";
              ps = conn.prepareStatement(sql2);
              ResultSet resultSet = ps.executeQuery();

              if (resultSet.next()) {   // 결과 집합의 마지막 요소까지 받으면 = 가장 큰 시리얼넘버 구해짐
                  lastSerialNumber = resultSet.getString("MovieSerialNumber");
             }
              conn.commit();
          } catch(Exception e) {
               e.printStackTrace();
               if(conn!=null) {
                  try {
                     conn.rollback();
                  }catch(Exception e1) {
                     e1.printStackTrace();
                  }
               }
            }

          return lastSerialNumber;
      }

      
      public void MovieList1(String mvname) {

          String sql = "delete FROM MOVIES WHERE  movieSerialNumber = ?";
          try {
             conn = getConnection();
             stmt = conn.createStatement();
             String sql1 = "use CINEMAMANAGEMENT";
             stmt.executeUpdate(sql1); // insert delete update

             // select resultSet
             ps = conn.prepareStatement(sql);
             ps.setString(1, mvname);
             ps.executeUpdate();

          } catch (Exception e) {
             System.out.println("DB작업중 문제 발생: " + e.getMessage());
             e.printStackTrace(); // 예외 상세 정보 출력
          }
          System.out.println("삭제 완료");
       }

      public void DelMovieList() {
          ArrayList<Movies> Addr = new ArrayList<>();
          ArrayList<Movies> All = new ArrayList<>();
          try {
             conn = getConnection();
             stmt = conn.createStatement();
             String sql1 = "use cinemamanagement";
             stmt.executeUpdate(sql1);

             String sql = "select * from movies";
             rs = stmt.executeQuery(sql);

             while (rs.next()) {
                String name = rs.getString("MovieTitle");
                String serial = rs.getString("MovieSerialNumber");
                String gerne = rs.getString("Genre");
                String re = rs.getString("ReleaseDate");
                String wd = rs.getString("WithdrawDate");
                String ss = rs.getString("ScreeningStatus");

                Movies mov = new Movies(name, serial, re, wd, gerne, ss);
                Addr.add(mov);

             }

          } catch (Exception e) {
          }

          for (Movies list : Addr) {
             System.out.println(list);
          }
          System.out.println("삭제 메뉴는 1번 돌아가기는 2번");
          int a = Integer.parseInt(sc.nextLine());
          if (a == 1) {
             System.out.println("삭제 하실 영화명 입력해 주세요");
             String ss = sc.nextLine();
             for (Movies list : Addr)
                if (list.getMovieTitle().toLowerCase().equals(ss.toLowerCase())) {
                   ss = list.getMovieSerialNumber();
                   MovieList1(ss);
                   break;
                } else {
                   System.out.println("잘못된 영화명 입니다");
                   break;
                }
          } else if (a == 2) {
          } else {
             System.out.println("잘못된 입력 입니다");
          }
       }

      public void Consumerinfo() {
    	      ArrayList<BookingStatus> Addr = new ArrayList<>();

    	      try {
    	          conn = getConnection();
    	          
    	          stmt = conn.createStatement();
    	         
    	          String sql1 = "use consumerinfo";
    	         	stmt.executeUpdate(sql1);

    	         String sql = "select * from Bookingstatus";
    	         rs = stmt.executeQuery(sql);

    	         while (rs.next()) {
    	            String Id = rs.getString("Id");
    	            String infoname = rs.getString("infoname");
    	            String Pnum = rs.getString("PhoneNUMBER");
    	            String sn = rs.getString("SerialNumber");
    	            String mt = rs.getString("MovieTitle");
    	            String hall = rs.getString("Hall");
    	            String seatn = rs.getString("SeatNumber");
    	            String nOp = rs.getString("NOP");
    	            String oT =rs.getString("OrderTime");
    	            int pM =rs.getInt("PayMent");
    	            String ts =rs.getString("TicketStatus");

    	            BookingStatus addr = new BookingStatus(Id, infoname, Pnum, sn, mt, hall, seatn, nOp, oT, pM, ts);
    	            Addr.add(addr);
    	         }

    	      } catch (Exception e) {
    	         e.printStackTrace();

    	      }
    	      for (BookingStatus list : Addr) {
    	         System.out.println(list);
    	      }
    	   }
      
    public void timeTablecheck_pre(String datecode) {
    String sql ="SELECT * FROM cinemamanagement.timetablet1"+ datecode 
          +" UNION ALL" 
          +" SELECT * FROM cinemamanagement.timetablet2"+ datecode
          +" UNION ALL" 
          +" SELECT * FROM cinemamanagement.timetablet3"+ datecode;
    try {
       ps = conn.prepareStatement(sql);
       rs = ps.executeQuery();
       System.out.println(rs);
    }catch(Exception e) {
       
    }
 }


    ////////////////////////////////사용자 메서드///////////////////////////////////
    
 // 1-2. 현재 상영중인 영화 리스트 반환
    public ArrayList<String> AllMovie() { 
  	  ArrayList<String> trueMovieList = new ArrayList<String>();
  	  try {
	         conn.setAutoCommit(false);
	         
	         String use = "USE cinemamanagement;";
	          ps = conn.prepareStatement(use);
	          ps.executeUpdate();
	            
             String sql1 = "select * from movies where ScreeningStatus = true;";
             ps = conn.prepareStatement(sql1);
             ResultSet resultSet = ps.executeQuery();

             while (resultSet.next()) { 
           	  String a = resultSet.getString("MovieTitle");
           	 trueMovieList.add(a);
             }
	         conn.commit();
	         
	      }catch(Exception e) {
	            e.printStackTrace();
	            if(conn!=null) {
	               try {
	                  conn.rollback();
	               }catch(Exception e1) {
	                  e1.printStackTrace();
	               }
	            }
	         }
		return trueMovieList;
    }
    
 // 1-3. 상영중인 영화의 상영 시간 출력
    public ArrayList<String> timeList(String TBname, String Movie, String hallNum2, String todayDate) { 
  	  ArrayList<String> timeList = new ArrayList<String>();
  	  try {
	         conn.setAutoCommit(false);
	         
	         String use = "USE CinemaManagement;";
	          ps = conn.prepareStatement(use);
	          ps.executeUpdate();
	          
           String sql1 = "select Hall"+ hallNum2 + "Timetable from " + TBname + hallNum2+ todayDate+ 
        		   " where hall"+hallNum2+"MovieTitle = " + "'"+Movie+"'" ;
           //테이블이 3개로 나누어져서 sql문 변경
           ps = conn.prepareStatement(sql1);
           ResultSet resultSet = ps.executeQuery();

             while (resultSet.next()) { 
           	  String a = resultSet.getString("hall" + hallNum2 + "Timetable");
          
           	int b = Integer.parseInt(a);
           	int c = (int)b/60;
           	int d = b%60;
           	String f = String.format("%02d", c);
           	String g = String.format("%02d", d); // 두자리로 포맷팅
           	String e = f+"시"+g+"분";
            // 시 / 분 형태로 숫자변형
           	timeList.add(e);
             }
	         conn.commit();
	         
	      }catch(Exception e) {
	            e.printStackTrace();
	            if(conn!=null) {
	               try {
	                  conn.rollback();
	               }catch(Exception e1) {
	                  e1.printStackTrace();
	               }
	            }
	         }
  	 Collections.sort(timeList); //정렬추가
		return timeList;
    }
    
    
  // 1-4. 회원예매 시 아이디 비번 올바른지 확인
    public Sign isMember(String inputId, String inputPass) {
  	  Sign member = null;
  	  try {
 	         conn.setAutoCommit(false);
 	         
 	         String use = "USE ConsumerInfo;";
 	          ps = conn.prepareStatement(use);
 	          ps.executeUpdate();
 	          
            String sql1 = "select * from sign where ID = ? and Pass = ? ;";
            ps = conn.prepareStatement(sql1);
            ps.setString(1, inputId);
            ps.setString(2, inputPass);
            ResultSet resultSet = ps.executeQuery();
            
            while (resultSet.next()) {
                String id = resultSet.getString("Id");
                String password = resultSet.getString("Pass");
                String name = resultSet.getString("InfoName");
                String phoneNumber = resultSet.getString("PhoneNumber");

                member = new Sign(id, password, name, phoneNumber);
            }

 	         conn.commit();
 			 
 	      }catch(Exception e) {
 	            e.printStackTrace();
 	            if(conn!=null) {
 	               try {
 	                  conn.rollback();
 	               }catch(Exception e1) {
 	                  e1.printStackTrace();
 	               }
 	            }
 	         }
		return member;

    }  
    
    
    // 1-5. 예매 정보를 BookingStatus에 저장
    public boolean saveReservation(String Id, String InfoName, String PhoneNumber, String SerialNumber, String MovieTitle, int Hall, String SeatNumber, int NOP, String OrderTime, int Payment, boolean TicketStatus) {
  	  try {
	         conn.setAutoCommit(false);
	         String use = "USE consumerinfo";
	          ps = conn.prepareStatement(use);
	          ps.executeUpdate();
	            
	         String sql = "insert into consumerinfo.bookingstatus (Id, InfoName, PhoneNumber, SerialNumber, MovieTitle, Hall, SeatNumber, NOP, OrderTime, Payment, TicketStatus) "
	                     + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	         ps = conn.prepareStatement(sql);
	         ps.setString(1, Id);
	         ps.setString(2, InfoName);
	         ps.setString(3, PhoneNumber);
	         ps.setString(4, SerialNumber);
	         ps.setString(5, MovieTitle);
	         ps.setInt(6, Hall);
	         ps.setString(7, SeatNumber);
	         ps.setInt(8, NOP);
	         ps.setString(9, OrderTime);
	         ps.setInt(10, Payment);
	         ps.setBoolean(11, TicketStatus);
	         ps.executeUpdate();
	         
	         conn.commit();
	         return true;
	         
	      }catch(Exception e) {
	            e.printStackTrace();
	            if(conn!=null) {
	               try {
	                  conn.rollback();
	               }catch(Exception e1) {
	                  e1.printStackTrace();
	               }
	            }
	            return false;
	         }
    }
    
    public boolean bookingSeatTable(String MovieTitle,String SeatNumber,String SerialNumber,int Hall,String datetimecode) {
    	
    	String use = "USE "+MovieTitle;
    	
    	String sql = "UPDATE "+MovieTitle+".t"+Hall+datetimecode
    			+" SET SerialNumber = ?"
    			+" WHERE SeatNumber = A1";
    	try {
    		
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, SerialNumber);
//    		ps.setString(2, SeatNumber);
    		ps.executeUpdate();
    	}catch(Exception e) {
    	e.printStackTrace();
    	return false;
    	}
    return true;
    }

 // 4-2. 회원가입 정보 DB에 추가
    public boolean RegiMember(String Id, String Pass, String InfoName, String PhoneNumber) {
  	  try {
  	         conn.setAutoCommit(false);
  	         String use = "USE consumerinfo";
  	          ps = conn.prepareStatement(use);
  	          ps.executeUpdate();
  	            
  	         String sql = "insert into consumerinfo.sign (Id, Pass, InfoName, PhoneNumber) "
  	                     + "values (?, ?, ?, ?);";
  	         ps = conn.prepareStatement(sql);
  	         ps.setString(1, Id);
  	         ps.setString(2, Pass);
  	         ps.setString(3, InfoName);
  	         ps.setString(4, PhoneNumber);
  	         ps.executeUpdate();
  	         
  	         conn.commit();
  	         return true;
  	         
  	      }catch(Exception e) {
  	            e.printStackTrace();
  	            if(conn!=null) {
  	               try {
  	                  conn.rollback();
  	               }catch(Exception e1) {
  	                  e1.printStackTrace();
  	               }
  	            }
  	            return false;
  	         }
    }
    
    
    // 4-3. 아이디 중복확인
    public ArrayList<String> CheckId(String Id) {
  	  ArrayList<String> idArr = new ArrayList<String>();
  	  try {
	         conn.setAutoCommit(false);
	         String use = "USE consumerinfo";
	          ps = conn.prepareStatement(use);
	          ps.executeUpdate();
	            
            String sql1 = "SELECT Id FROM sign;";
            ps = conn.prepareStatement(sql1);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) { 
          	  String a = resultSet.getString("Id");
          	  idArr.add(a);
            }
	         conn.commit();
	         
	      }catch(Exception e) {
	            e.printStackTrace();
	            if(conn!=null) {
	               try {
	                  conn.rollback();
	               }catch(Exception e1) {
	                  e1.printStackTrace();
	               }
	            }
	         }
		return idArr;
    }

}// end of SQLMETHOD



