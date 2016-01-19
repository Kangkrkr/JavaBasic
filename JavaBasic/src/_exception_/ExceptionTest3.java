package _exception_;

import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

import _member_.LoginFailException;
import _member_.MemberVO;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		MemberVO members[] = {
				new MemberVO("kangkrkr", "강승윤", "P"),
				new MemberVO("swback", "백승욱", "W"),
				new MemberVO("ydkim", "김영두", "D")
		};
		
//		showRegisteredUsers(members);
		
		System.out.print("id : ");
		String userID = scan.next();
		System.out.print("pwd : ");
		String userPWD = scan.next();
		
		MemberVO member = new MemberVO();
		member.setUserID(userID);
		member.setUserPWD(userPWD);
		
		MemberVO userInfo = null;
		
		try{
			userInfo = login(member, members);
			
			if(userInfo != null){
				System.out.println(userInfo.getUserName() + "님이 로그인 하셨습니다.");
			}else{
				System.out.println("로그인 실패.");
			}
		}catch(LoginFailException e){
			System.out.println(e.getMessage());
		}
	}

	private static void showRegisteredUsers(MemberVO[] members) {
		
		for(MemberVO m : members){
			System.out.println(m);
			System.out.println("------------------------------------------------");
		}
	}
	
	private static MemberVO login(MemberVO member, MemberVO members[]) throws RuntimeException {
		
		for(MemberVO m : members){
			if(m.getUserID().equals(member.getUserID()) && DigestUtils.sha512Hex(m.getUserPWD()).equals(member.getUserPWD())){
				return m;
			}
		}
		
		throw new LoginFailException(member, "해당 회원을 조회할 수 없습니다..");
	}

}
