package _exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하세요.");
		
		try{
			int n = sc.nextInt();
			System.out.println(n);
		}catch(InputMismatchException e){
			System.out.println("숫자만 입력하세요.");
		}
	}

}
