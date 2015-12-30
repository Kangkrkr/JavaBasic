package _if_;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {

		// 1 ~ 3 사이의 난수
		int com = (int)(Math.random() * 3 + 1);
		int user = new Scanner(System.in).nextInt();
		
		int result = user - com;

		// ((you - com + 3) % 3) : 1 -> 사용자의 승리, 2 -> 컴퓨터의 승리, 3 -> 무승부
		//가위 1 , 바위2, 보3
		

		// 방법1. (내가 짠것)
		if(user > com){
			// 2가 나오는 경우 : 사용자가 보, 컴퓨터가 가위를 낸 경우이므로 사용자 패배.
			if((result) == 2){
				System.out.println("사용자의 패배! 사용자 : "+user+" , 컴퓨터 : "+com);
				return;
			}
			System.out.println("사용자의 승리! 사용자 : "+user+" , 컴퓨터 : "+com);
		}else if(user < com){
			// -2가 나오는 경우 : 사용자가 가위, 컴퓨터가 보를 낸 경우이므로 컴퓨터 패배.
			if((result) == -2){
				System.out.println("컴퓨터의 패배! 사용자 : "+user+" , 컴퓨터 : "+com);
				return;
			}
			System.out.println("컴퓨터의 승리! 사용자 : "+user+" , 컴퓨터 : "+com);
		}else{
			System.out.println("비겼습니다! 사용자 : "+user+" , 컴퓨터 : "+com);
		}
		
		
		// 방법2.
		if((result == 1) || (result == -2)){
			System.out.println("사용자의 승리");
		}else if((result == -1) || (result == 2)){
			 System.out.println("컴퓨터의 승리");
		}else{
			System.out.println("무승부");
		}
		
		/* 	방법 3.
			int result = ((내가낸값 - 컴퓨터가낸값) + 3) % 3
			result 가 1 이라면, 나의 승리.
			result 가 2 라면, 컴퓨터의 승리.
			result가 0 이라면, 무승부.
			그 외의 경우라면 잘못된 경우이다.
		*/
	}
}
