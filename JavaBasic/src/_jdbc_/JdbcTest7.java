package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcTest7 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		StringBuffer insertSql = new StringBuffer();
		insertSql.append("INSERT INTO t_user(name, phone, birth) ");
		insertSql.append("VALUES(?, ?, ?)");

		try{
			
			Class.forName(OracleDBInfo.DRIVER_CLASS);
			
			conn = DriverManager.getConnection(OracleDBInfo.DRIVER_ADDRESS, "n1", "n1");
			System.out.println("연결 성공.");
			
			ps = conn.prepareStatement(insertSql.toString());
			
			System.out.println("*** 회원 정보 입력 ***");
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("전화번호를 입력하세요 : ");
			String phone = sc.nextLine();
			System.out.print("생년을 입력하세요 : ");
			int birth = sc.nextInt();
			ps.setString(1, name);
			ps.setString(2, phone);
			ps.setInt(3, birth);
			int result = ps.executeUpdate();
			
			if(result == 1){
				System.out.println(name+" 님의 정보가 입력되었습니다.");
			}else{
				System.out.println("유저정보 입력 실패.");
				System.exit(0);
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("유저정보 입력 실패.");
			System.exit(0);
		}finally {
			if (rs != null) try{ rs.close(); } catch(Exception e){}
			if (ps != null) try{ ps.close(); } catch(Exception e){}
			if (conn != null) try{ conn.close(); } catch(Exception e){}
		}
	}

}
