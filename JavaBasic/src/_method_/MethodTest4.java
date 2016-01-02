package _method_;

import java.util.Scanner;

public class MethodTest4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = 4;
		
		int n[] = new int[size];
		
		for(int i=0; i<n.length; i++){
			n[i] = scan.nextInt();
			for(int j=i; j>=0; j--){
				if((i > 0) &&(n[i] == n[j])){
					System.out.println("중복된 값입니다!!");
					return;
				}
				System.out.print(n[i]+" ");
			}
			System.out.println();
		}
		
	}

}
