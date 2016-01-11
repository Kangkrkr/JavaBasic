package _member_;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginFailException extends RuntimeException {

	public LoginFailException(String message){
		super(message);
	}
	
	public LoginFailException(Object obj, String message){
		super(message);
		
		File file = new File("log.txt");
		try {
			FileWriter writer = new FileWriter(file);
			// FileWriter writer = new FileWriter(file, true); true시 append 모드가 된다.
			
			if(obj instanceof MemberVO){
				MemberVO memberVO = (MemberVO)obj;
				writer.write("아래와 같은 정보로 로그인 시도가 있었음.\n");
				writer.write(memberVO.toString()+"\n");
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
