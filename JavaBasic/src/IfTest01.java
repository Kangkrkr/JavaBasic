import java.util.InputMismatchException;
import java.util.Scanner;


public class IfTest01 {

	public static void main(String[] args) {
		
		// 1. 스캐너를 선언한다.
		// 2. 스캐너를 통해 입력을 받는다.
		// 3. 1~100 사이의 정수입력.
		// 4. 100 - 90 -> A
		//    89 - 80  -> B
		//    79 - 70  -> C
		//    69 - 60  -> D
		//    그 아래         -> F
	
		Scanner scan = new Scanner(System.in);

		System.out.print("점수를 입력하세요 > ");
		try{
			int n = scan.nextInt();
			
			if(n < 0 || n > 100){
				System.out.println("잘못된 점수입니다.");
				return;
			}
			
			if(n >= 90){
				System.out.println("A");
			}else if(n >= 80){
				System.out.println("B");
			}else if(n >= 70){
				System.out.println("C");
			}else if(n >= 60){
				System.out.println("D");
			}else{
				System.out.println("F");
			}
			
			System.out.println("종료");
		}catch(InputMismatchException e){
			System.out.println("숫자만 입력하세요 !!");
			return;
		}
	}

}
