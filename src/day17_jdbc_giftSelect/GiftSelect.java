package day17_jdbc_giftSelect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect { // select
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1. Driver load ..... 예외발생함
				Class.forName("org.mariadb.jdbc.Driver");
			
				
				//2. Connection & Open
				               //driver:IP:portNmber/DBName
			
				
				Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore","root","maria");
				System.out.println("connection success!!");
				
				//3. 사용 (DML 명령어)
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM gift");
				
				System.out.println("상품번호\t상품명\t\t최저가\t 최고가");
				while(rs.next()) {
					int gno = rs.getInt(1); //첫번째거 꺼내오기(gno) DB의 인덱스는 시작이 0 이 아니라 1부터
					String gname = rs.getString("gname");
					int g_s = rs.getInt(3);
					int g_e = rs.getInt("g_end");
					
					System.out.println("   "+gno+"   \t\t"+gname+"\t"+g_s+"\t "+g_e);
						
				}
				
				//4. 닫기 (자원 반환)
				rs.close();   stmt.close();    conn.close();
		
	}
}
