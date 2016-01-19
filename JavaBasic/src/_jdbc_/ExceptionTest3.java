package _jdbc_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import _member_.LoginFailException;
import _member_.MemberVO;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		MemberVO memberVO = new MemberVO();
		System.out.print("id : ");
		memberVO.setUserID(scan.nextLine());
		System.out.print("pwd : ");
		memberVO.setUserPWD(scan.nextLine());
		
		try{
			MemberVO userInfo = login(memberVO);
			
			if(userInfo != null){
				System.out.println(userInfo.getUserName() + "님이 로그인 하셨습니다.");
			}else{
				System.out.println("로그인 실패.");
			}
		}catch(LoginFailException e){
			System.out.println(e.getMessage());
		}
	}

	private static MemberVO login(MemberVO member) throws RuntimeException {
		
		MemberVO userInfo = null;
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		// Statement 객체 사용시 SQL Injection 공격 주의.
		// PreparedStatement 객체를 사용하도록한다.
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT user_name FROM t_member ");
		sql.append("WHERE user_id='"+member.getUserID()+"' AND user_pw='"+member.getUserPWD()+"'");
		
		try{
			
			// 해당 클래스가 존재하는지 확인한다. 존재하지 않는다면 error 발생.
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "n1", "n1");
			st = conn.createStatement();
			
			rs = st.executeQuery(sql.toString());
			
			if(rs.next()){
				userInfo = new MemberVO();
				userInfo.setUserName(rs.getString("user_name"));
				return userInfo;
			}else{
				throw new LoginFailException(member, "해당 회원을 조회할 수 없습니다..");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}finally{
			if(conn != null) try{ conn.close(); } catch(Exception e){ e.printStackTrace(); }
			if(st != null)   try{ st.close(); } catch(Exception e){ e.printStackTrace(); }
			if(rs != null)   try{ rs.close(); } catch(Exception e){ e.printStackTrace(); }
		}
	}

}
