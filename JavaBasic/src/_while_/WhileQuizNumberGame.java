package _while_;
import java.util.Scanner;


public class WhileQuizNumberGame {

	public static void main(String[] args) {

		// 1 부터 99 사이의 난수(정수)를 발생시킨다.
		// x에 저장한다.
		// 입력은 스캐너로부터 입력받는다.
		// 그 값은 user로 저장한다.
		// 컴퓨터가 만든 숫자가 33이고 유저가 입력한 숫자가 50이라면,
		// x 는 50보다 작습니다. 라고 알려준다.
		// 1회부터 4회안에 맞춘다면, Great를,
		// 5회부터 8회안에 맞춘다면 Good,
		// 9회부터 12회안에 맞춘다면 SoSo
		// 12번을 넘어간다면 Bad.
		// 몇번만에 맞춘지는 스위치 케이스로 작성한다.
		
		Scanner scanner = new Scanner(System.in);
		int x = (int)(Math.random()*99 + 1);
		int user=0;
		int count=0;
		
		do{
			user = scanner.nextInt();
			System.out.println((x > user) ? "x는 "+user+"보다 큽니다."   :
							   (x < user) ? "x는 "+user+"보다 작습니다." :
											"x를 맞히셨습니다 : "+user);
			count++;
		}while(x != user);
		
		System.out.println(count+"번 만에 맞히셨습니다!");
		
		switch((count-1)/4){
		case 0 :
			System.out.println("Great!!");
			break;
		case 1 :
			System.out.println("Good!!");
			break;
		case 2 :
			System.out.println("SoSo..");
			break;
		default :
			System.out.println("Bad!!");
			break;
		}
		
	}

}
