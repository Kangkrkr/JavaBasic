package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class JdbcTest5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 회원 가입 ***");
		System.out.print("아이디를 입력하세요 : ");
		String user_id = sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String user_name = sc.nextLine();
		System.out.print("패스워드를 입력하세요 : ");
		String user_pw = DigestUtils.sha512Hex(sc.nextLine());
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO t_member(user_id, user_name, user_pw) ");
		sql.append("VALUES(?, ?, ?) ");

		try{
			
			Class.forName(OracleDBInfo.DRIVER_CLASS);
			
			conn = DriverManager.getConnection(OracleDBInfo.DRIVER_ADDRESS, "n1", "n1");
			
			// 파라미터 쿼리 방식.
			// 1. 작성의 용이성
			// 2. SQL Injection 에 뚫릴 확률이 줄어든다.
			// 3. 성능이 향상된다.
			st = conn.prepareStatement(sql.toString());
			st.setString(1, user_id);					// id 값은 테이블 생성시 unique로 주었기 때문에, 중복되지 않는다.
			st.setString(2, user_name);
			st.setString(3, user_pw);
			int result = st.executeUpdate();			// insert, update, delete 등의 DML은 ResultSet이 없으며 executeUpdate()를 사용한다.
			System.out.println(result);					// update, delete 시에는 반드시 수행처리된 레코드수의 반환값을 확인해야한다.
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("회원가입 실패.");
		}finally {
			if (rs != null) try{ rs.close(); } catch(Exception e){}
			if (st != null) try{ st.close(); } catch(Exception e){}
			if (conn != null) try{ conn.close(); } catch(Exception e){}
		}
	}

}
