package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest9 {

public static void main(String[] args) {
		
		List<EmployeesVO> records = new ArrayList<>();
	
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		StringBuffer selectSql = new StringBuffer();
		selectSql.append("SELECT e.employee_id , e.last_name, e.salary, d.department_id, d.department_name ");
		selectSql.append("FROM employees e LEFT OUTER JOIN departments d ");
		selectSql.append("ON e.department_id = d.department_id");

		try{
			
			Class.forName(OracleDBInfo.DRIVER_CLASS);
			conn = DriverManager.getConnection(OracleDBInfo.DRIVER_ADDRESS, "n1", "n1");
			ps = conn.prepareStatement(selectSql.toString());
			rs = ps.executeQuery();

			while(rs.next()){
				EmployeesVO employeesVO = new EmployeesVO();
				employeesVO.setEmployee_id(rs.getInt("employee_id"));
				employeesVO.setLast_name(rs.getString("last_name"));
				employeesVO.setSalary(rs.getLong("salary"));
				employeesVO.setDepartment_id(rs.getInt("department_id"));
				employeesVO.setDepartment_name(rs.getString("department_name"));
				
				records.add(employeesVO);
			}
			
			System.out.println("e_id\te_name\tsalary\td_id\td_name");
			System.out.println("-----------------------------------------------------------");
			for(EmployeesVO e : records){
				System.out.println(e.toString());
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
