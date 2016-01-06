package _member_;

import org.apache.commons.codec.digest.DigestUtils;

public class MemberVO {

	private String userID;
	private String userName;
	private String userPWD;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPWD() {
		return userPWD;
	}

	public void setUserPWD(String userPWD) {
		// 유저가 입력한 암호가 암호화 되어 들어온다.
		this.userPWD = DigestUtils.sha512Hex(userPWD);
	}

	@Override
	public String toString() {
		return " MemberVO ↓\n[user id : "+userID+"]\n[user PWD : "+userPWD+"]";
	}
	
}
