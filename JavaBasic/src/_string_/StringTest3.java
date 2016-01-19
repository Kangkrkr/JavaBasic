package _string_;

public class StringTest3 {

	public static void main(String[] args) {
		
		String str = "배열과 연결 리스트를 이용한 리스트 구현의 차이점";
		System.out.println(str);
		
		System.out.println(str.substring(4, 10));	// "연결 리스트" 가 출력된다.
		
		String name = "KangSeongYoun";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		StringBuffer sb = new StringBuffer(str);
		sb.replace(0, 3, "Array와");
		System.out.println(sb);
		
		sb.insert(sb.length(), "입니다.");
		System.out.println(sb);
	}

}
