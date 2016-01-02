package _method_;

import java.util.Scanner;

public class MethodTest3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("작은 수를 입력하세요 >");
		int a = scan.nextInt();
		System.out.print("큰 수를 입력 하세요 >");
		int b = scan.nextInt();
		
		if(a > b) {
			a ^= b; b ^= a; a ^= b;
		}
		
		System.out.print(a+"부터 "+b+"까지의 합계는 "+sumNumbers(a, b)+" 입니다.");
	}
	
	public static int sumNumbers(int a, int b){
		
		int sum = 0;
		
		for(int start = a; start<=b; start++){
			sum += start;
		}
		
		return sum;
	}

}
