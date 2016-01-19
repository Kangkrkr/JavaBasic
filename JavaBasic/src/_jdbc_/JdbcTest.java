package _jdbc_;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT employee_id, last_name, job_id");
		sb.append(" FROM employees");
		
		try{
			// 필요한 클래스 이름을 명시.
			Class.forName(driver);
			conn = DriverManager.getConnection(jdbcURL, "n1", "n1");
			st = conn.createStatement();
			rs = st.executeQuery(sb.toString());
			
			while(rs.next()){
				System.out.println(rs.getInt("EMPLOYEE_ID") +"\t"+ rs.getString("LAST_NAME") + "\t" + rs.getString("JOB_ID"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
