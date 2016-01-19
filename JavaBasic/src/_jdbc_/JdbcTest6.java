package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class JdbcTest6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 회원 정보 수정 ***");
		System.out.print("아이디를 입력하세요 : ");
		String user_id = sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String user_name = sc.nextLine();
		System.out.print("패스워드를 입력하세요 : ");
		String user_pw = DigestUtils.sha512Hex(sc.nextLine());
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		StringBuffer selectSql = new StringBuffer();
		selectSql.append("SELECT count(*) AS cnt FROM t_member ");
		selectSql.append("WHERE user_id=? AND user_pw=?");
		
		StringBuffer updateSql = new StringBuffer();
		updateSql.append("UPDATE t_member SET user_name=?, user_pw=? ");
		updateSql.append("WHERE user_id=?");

		try{
			
			Class.forName(OracleDBInfo.DRIVER_CLASS);
			
			conn = DriverManager.getConnection(OracleDBInfo.DRIVER_ADDRESS, "n1", "n1");
			System.out.println("연결 성공.");
			
			ps = conn.prepareStatement(selectSql.toString());
			ps.setString(1, user_id);
			ps.setString(2, user_pw);
			rs = ps.executeQuery();
			
			if(rs.next()){
				if(rs.getInt("cnt") == 0){
					System.out.println("아이디 혹은 패스워드가 틀립니다.");
					System.exit(0);
				}
				
				System.out.println(user_id+" 님의 정보를 수정합니다.");
				
				try{
					ps = conn.prepareStatement(updateSql.toString());
					System.out.print("새 이름 >");
					ps.setString(1, sc.nextLine());
					System.out.println("새 비밀번호 >");
					ps.setString(2, DigestUtils.sha512Hex(sc.nextLine()));
					ps.setString(3, user_pw);
					
					if(ps.executeUpdate() == 1){
						System.out.println(user_id+" 님의 회원정보가 수정되었습니다.");
					}else{
						System.out.println("수정 실패");
					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("회원 정보 수정에 실패.");
					System.exit(0);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("회원정보 수정 실패.");
			System.exit(0);
		}finally {
			if (rs != null) try{ rs.close(); } catch(Exception e){}
			if (ps != null) try{ ps.close(); } catch(Exception e){}
			if (conn != null) try{ conn.close(); } catch(Exception e){}
		}
	}

}
