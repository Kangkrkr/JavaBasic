package _string_;

public class StringTest {

	public static void main(String[] args) {
		
		/*	 같은 주소를 참조하기 때문에 str1 == str2
		 * 	 "안녕하세요" 자체가 스트림 클래스라고 한다.
		String str1 = "안녕하세요~";
		String str2 = "안녕하세요~";
		*/
		
		
		// 다른 주소를 참조하게 되므로 str1 != str2
		String str1 = new String("안녕하세요~");
		String str2 = new String("안녕하세요~");
		
		if(str1 == str2){
			System.out.println("같다.");
		}else{
			System.out.println("다르다");
		}
		
		if(str1.equals(str2)){
			System.out.println("같다.");
		}else{
			System.out.println("다르다.");
		}
	}

}
