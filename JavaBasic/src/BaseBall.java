import java.util.Scanner;

public class BaseBall {

	// 야구게임 만들기
	// 맞출 숫자와 부른숫자중 숫자와 자릿수까지 동일하면 스트라이크. (S)
	// 숫자는 일치하지만 자리수가 다른 경우는 볼. (B)
	private static int S = 0;
	private static int B = 0;

	private static int count = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 컴퓨터가 100 ~ 999 까지의 정수를 랜덤으로 골라 문제를 낸다.
		int computerValue = 100;
		
		// 정수의 길이를 측정한다.
		int computerCount = sizeof(computerValue);
		// 정수의 길이만큼의 크기를 가지는 배열 생성.
		int computerValues[] = new int[computerCount];
		// 정수를 자리별로 분할하여 위의 배열에 분배하는 작업을 한다.
		supplyValues(computerValues, computerCount, computerValue);

		System.out.println(computerValue);

		do {
			// S와 B는 사용자가 컴퓨터가 낸 문제를 풀기전까지 매반복마다 초기화 되어야한다.
			S = 0;
			B = 0;

			System.out.print("값을 입력 > ");
			int userValue = scan.nextInt();
			int userCount = sizeof(userValue);
			int userValues[] = new int[userCount];
			supplyValues(userValues, userCount, userValue);

			// 컴퓨터가 낸 정수의 배열과, 사용자의 배열을 비교한다.
			startBaseball(userValues, computerValues);

			// 카운트 증가.
			count++;
		} while (S != computerCount);

		System.out.println(count + " 번 만에 맞히셨습니다.");
	}

	public static int sizeof(int n) {
		int count = 0;

		// 100 10 0
		
		// 입력받은 정수의 길이를 구한다.
		// 원리는 다음과 같다.
		// (475 / 10) -> 47  :  현재 자리수 1
		// (47 / 10) -> 4    :  현재 자리수 2
		// (4 / 10) -> 0	 :  현재 자리수 3
		//  n이 1보다 작으므로 탈출.
		while (n >= 1) {
			count++;
			n /= 10;
		}
		
		return count;
	}

	// 입력받은 정수를 각 자리별로 분할하여 배열에 담는 메소드.
	public static void supplyValues(int array[], int count, int values) {

		// 원리는 다음과 같다. (475를 예로 설명하겠다 -> 자릿수 : 3)
		// divider는 입력받은 정수의 (자릿수 - 1) 만큼 10의 제곱을 한 값이다 ->10^(3-1) = 100
		// 입력받은 정수값에 divider 를 나눈다 -> n = 475/100 = 4를 배열의 첫번째 자리에 넣는다.
		// 입력받은 정수는 divider * n 값 만큼 차감된다 -> 475 - (100 * 4) = 75
		// divider 를 10만큼 나눈값으로 대입한다 -> 100 / 10 = 10
		// 이런 식으로 반복한다 ...
		int index = 0;

		int divider = (int) Math.pow(10, count - 1);

		while (divider > 0) {
			int n = values / divider;
			array[index] = n;
			values -= (divider * n);
			divider /= 10;
			index++;
		}
	}

	// 1 2 4 (user)
	// 4 5 6 (com )
	// 야구게임을 시작한다. 유저의 배열을 기준으로 컴퓨터와 비교한다.
	public static void startBaseball(int user[], int computer[]) {

		for (int i = 0; i < user.length; i++) {
			int breakIndex = -1;
			for (int j = 0; j < computer.length; j++) {

				// 반복문을 돌며 같은 수를 찾는다.
				if (user[i] == computer[j]) {
					// 같은 자릿수라면 S를 증가, 아니라면 B를 증가시킨다.
					int noFunction = (i == j) ? S++ : B++;
					break;
				}

			}
		}

		System.out.println("S : " + S + ", B : " + B);
	}
}
