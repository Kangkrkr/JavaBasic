package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class JdbcTest10 {

	public static void main(String[] args) {

//		Logger log = Logger.getRootLogger();
		Logger logger = LoggerFactory.getLogger(JdbcTest10.class);

		List<EmpVO> records = new ArrayList<>();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		StringBuffer selectSql = new StringBuffer();
		selectSql.append("SELECT e.employee_id , e.last_name, e.salary, d.department_id, d.department_name ");
		selectSql.append("FROM employees e LEFT OUTER JOIN departments d ");
		selectSql.append("ON e.department_id = d.department_id");

		try {

			Class.forName("net.sf.log4jdbc.DriverSpy");
			conn = DriverManager.getConnection("jdbc:log4jdbc:oracle:thin:@localhost:1521:xe", "n1", "n1");
			
			logger.debug("DB에 접속되었음");

			ps = conn.prepareStatement(selectSql.toString());
			rs = ps.executeQuery();

			while (rs.next()) {
				EmpVO empVO = new EmpVO();
				empVO.setEmployee_id(rs.getInt("employee_id"));
				empVO.setLast_name(rs.getString("last_name"));
				empVO.setSalary(rs.getInt("salary"));

				DeptVO deptVO = new DeptVO();
				deptVO.setDepartment_id(rs.getInt("department_id"));
				deptVO.setDepartment_name(rs.getString("department_name"));

				empVO.setDeptVO(deptVO);

				records.add(empVO);
			}

			System.out.println("e_id\te_name\tsalary\td_id\td_name");
			System.out.println("-----------------------------------------------------------");
			for (EmpVO e : records) {
				System.out.println(e.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
//			log.error("정보조회에 실패함.");
			System.exit(0);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {}
			if (ps != null)
				try {
					ps.close();
				} catch (Exception e) {}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {}
		}
	}

}
