package _use_lib_;

import org.apache.commons.codec.digest.DigestUtils;

public class DigestTest {

	public static void main(String[] args) {

		String pwd = "1234567890";
		
		String encodedPwd = DigestUtils.sha512Hex(pwd);
		System.out.println(encodedPwd);
		
		System.out.println("Encoded pwd : " + encodedPwd);
	}

}
