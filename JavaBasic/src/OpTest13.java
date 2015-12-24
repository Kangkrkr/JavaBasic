
public class OpTest13 {

	public static void main(String[] args) {
		
		// 자동 형변환, 혹은 묵시적 형변환 이라고 한다.
		// 작은타입에서 큰 타입으로.
		double d = 10;
		System.out.println(d);	// 결과값은 10.0
		
		// 강제 형변환, 혹은 명시적 형변환 이라고 한다.
		// 큰타입에서 작은 타입으로.
		int i = (int)3.14;
		System.out.println(i);	// 결과값은 3
		
		// 0 ~ 9 까지.
		System.out.println((int)(Math.random() * 10));
		
		// 1 ~ 10 까지.
		System.out.println((int)(Math.random() * 10)+1);
		
	}

}
