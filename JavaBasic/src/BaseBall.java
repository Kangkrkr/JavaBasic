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
		
		int computerValue = (int)(Math.random() * 899 + 100);
		int computerCount = sizeof(computerValue);
		int computerValues[] = new int[computerCount];
		supplyValues(computerValues, computerCount, computerValue);
		
		System.out.println(computerValue);
		
		do{
			S = 0; B = 0;
			
			System.out.print("값을 입력 > ");
			int userValue = scan.nextInt();
			int userCount = sizeof(userValue);
			int userValues[] = new int[userCount];
			supplyValues(userValues, userCount, userValue);
			
			startBaseball(userValues, computerValues);
			
			count++;
		}while(S != computerCount);
		
		System.out.println(count+" 번 만에 맞히셨습니다.");
	}
	
	public static int sizeof(int n){
		int count = 0;
		
		while(n >= 1){
			count++;
			n /= 10;
		}
		return count;
	}
	
	// 입력받은 정수를 각 자리별로 분할하여 배열에 담는 메소드.
	public static void supplyValues(int array[], int count, int values){
		
		int index = 0;
		
		int divider = (int)Math.pow(10, count-1);
		
		while(divider > 0){
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
	public static void startBaseball(int user[], int computer[]){
		
		for(int i=0; i<user.length; i++){
			int breakIndex = -1;
			for(int j=0; j<computer.length; j++){
				
				if(user[i] == computer[j]){
					int noFunction = (i == j) ? S++ : B++;
					break;
				}
				
			}
		}
		
		System.out.println("S : "+S+", B : "+B);
	}
}
