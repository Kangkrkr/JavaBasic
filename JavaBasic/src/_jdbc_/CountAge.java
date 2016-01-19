package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;

public class CountAge {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		StringBuffer selectSql = new StringBuffer();
		selectSql.append("SELECT * FROM t_user ");

		try {

			Class.forName(OracleDBInfo.DRIVER_CLASS);

			conn = DriverManager.getConnection(OracleDBInfo.DRIVER_ADDRESS, "n1", "n1");

			st = conn.createStatement();
			rs = st.executeQuery(selectSql.toString());

			System.out.println("이름\t전화번호\t\t생일\t나이");
			
			while(rs.next()){
				System.out.println(rs.getString("name")+"\t"+rs.getString("phone")+"\t"+rs.getInt("birth")+"\t"+getAge(rs.getInt("birth")));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("회원정보 검색 실패.");
			System.exit(0);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (st != null)
				try {
					st.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
	}
	
	public static int getAge(int age){
		Calendar cal = Calendar.getInstance();
		int curYear = cal.get(Calendar.YEAR);
		
		return (curYear - age) + 1;
	}
}
