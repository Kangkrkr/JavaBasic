package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class JdbcTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String user_id = sc.nextLine();
		System.out.print("패스워드를 입력하세요 : ");
		String user_pw = DigestUtils.sha512Hex(sc.nextLine());
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT user_id, user_name ");
		sql.append("FROM t_member ");
		sql.append("WHERE user_id=? AND user_pw=?");

		try{
			
			Class.forName(OracleDBInfo.DRIVER_CLASS);
			
			conn = DriverManager.getConnection(OracleDBInfo.DRIVER_ADDRESS, "n1", "n1");
			
			// 파라미터 쿼리 방식.
			// 1. 작성의 용이성
			// 2. SQL Injection 에 뚫릴 확률이 줄어든다.
			// 3. 성능이 향상된다.
			st = conn.prepareStatement(sql.toString());
			st.setString(1, user_id);
			st.setString(2, user_pw);
			rs = st.executeQuery();
			if(rs.next()){
				System.out.println(rs.getString("user_name")+"("+rs.getString("user_id")+") 님 안녕하세요.");
			}else{
				System.out.println("아이디나 비밀번호가 틀립니다.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if (rs != null) try{ rs.close(); } catch(Exception e){}
			if (st != null) try{ st.close(); } catch(Exception e){}
			if (conn != null) try{ conn.close(); } catch(Exception e){}
		}
	}

}
