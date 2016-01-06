package _member_;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("id : ");
		String userID = scan.next();
		System.out.print("pwd : ");
		String userPWD = scan.next();
		
		MemberVO member = new MemberVO();
		member.setUserID(userID);
		member.setUserPWD(userPWD);
		
//		System.out.println(member);
		
		MemberVO userInfo = null;
		
		try{
			userInfo = login(member);
			
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
		
		if(member.getUserID().equals("kangkrkr") &&
				member.getUserPWD().equals("941d252645993ffbb3e3076ec37b6d2292b8d93ee4b9095a024a8fedee9e4e0d1acfbd8d3ebb1412004d4308da235f8605aa94758b17a534bd1dc52e3833b3d5")){
			
			member.setUserName("강승윤");
			
			return member;
		}
		
		throw new LoginFailException(member, "아이디나 패스워드가 잘못되었습니다.");
	}

}
