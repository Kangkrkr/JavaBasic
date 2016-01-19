package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest8 {

public static void main(String[] args) {
		// 조인을 해서 사원의 이름과 부서의 이름을 출력 (두 테이블의 DEPARTMENT_ID 가 같아야한다.)
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		StringBuffer insertSql = new StringBuffer();
		insertSql.append("SELECT e.last_name AS name, d.department_name AS department FROM employees e JOIN departments d ");
		insertSql.append("ON e.department_id = d.department_id");

		try{
			
			Class.forName(OracleDBInfo.DRIVER_CLASS);
			
			conn = DriverManager.getConnection(OracleDBInfo.DRIVER_ADDRESS, "n1", "n1");
			System.out.println("연결 성공.");
			
			ps = conn.prepareStatement(insertSql.toString());
			rs = ps.executeQuery();

			while(rs.next()){
				System.out.println(rs.getString("name")+"\t"+rs.getString("department"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("정보 조회 실패.");
			System.exit(0);
		}finally {
			if (rs != null) try{ rs.close(); } catch(Exception e){}
			if (ps != null) try{ ps.close(); } catch(Exception e){}
			if (conn != null) try{ conn.close(); } catch(Exception e){}
		}
	}

}
