import java.util.Scanner;


public class OpTest11 {

	public static void main(String[] args) {
		System.out.print("남자는 1을, 여자는 2를 입력 >");
		int n = new Scanner(System.in).nextInt();
		// 삼항 연산자의 삼항 연산자 -> 가독성이 매우 떨어진다.
		// System.out.println(((n == 1 || n == 3) ? "남자" : (n == 2 || n == 4) ? "여자" : "에러"));
		System.out.println(
				(n == 1 || n == 3) ? "남자" :
				(n == 2 || n == 4) ? "여자" :
									 "에러");
		System.out.println("종료");
	}

}
