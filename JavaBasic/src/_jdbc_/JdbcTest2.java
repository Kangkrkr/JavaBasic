package _jdbc_;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest2 {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT last_name, salary,");
		sb.append(" CASE ");
		sb.append(" WHEN salary <= 10000 THEN 'Low' WHEN salary <= 20000 THEN 'Mid' ELSE 'High'");
		sb.append(" END AS salary_grade");
		sb.append(" FROM employees");
		
		try{
			// 필요한 클래스 이름을 명시.
			Class.forName(driver);
			conn = DriverManager.getConnection(jdbcURL, "n1", "n1");
			st = conn.createStatement();
			rs = st.executeQuery(sb.toString());
			
			while(rs.next()){
				System.out.println(rs.getString("last_name") +"\t"+ rs.getString("salary") + "\t"+ rs.getString("salary_grade"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(st != null) try { st.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	}
}
