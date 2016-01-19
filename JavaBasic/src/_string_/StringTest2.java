package _string_;

public class StringTest2 {

	public static void main(String[] args) {

		// String 객체 생성 및 연산시 메모리 누수의 방지를 위해 사용하는 것이 StringBuffer와 StringBuilder.
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.length()+" : "+sb.capacity());
		
		for(int i=0; i<sb.capacity(); i++){
			sb.append("0");
		}
		
		System.out.println(sb.length()+" : "+sb.capacity());
	}
}
