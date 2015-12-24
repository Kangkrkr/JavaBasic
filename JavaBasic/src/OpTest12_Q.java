import java.util.Scanner;


public class OpTest12_Q {

	// 스캐너를 이용하여 정수를 입력받아서
	// 1. 양수, 음수, 0 판별
	// 2. 짝수 홀수 판별
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		// (-10 % 3) = -1 이기 때문에 (-10 % 3) == 1 로 비교하면 안된다.
		// (-10 % 3) != 0 으로 비교하여야 정상적인 비교가 된다.
		System.out.println(
				(n > 0 && (n % 2) == 0) ? "양의 짝수입니다." :
				(n < 0 && (n % 2) == 0) ? "음의 짝수입니다." :
				(n > 0 && (n % 2) != 0) ? "양의 홀수입니다"  :
				(n < 0 && (n % 2) != 0) ? "음의 홀수입니다"  :
										  "양수도 음수도 아닙니다.");
	}

}
