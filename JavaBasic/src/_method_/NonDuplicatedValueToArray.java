package _method_;

import java.util.Scanner;

public class NonDuplicatedValueToArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = 4;
		
		int n[] = new int[size];
		
		for(int i=0; i<n.length; i++){
			n[i] = scan.nextInt();
			
			for(int j=i-1; j>=0; j--){
				if(n[j] == n[i]){
					System.out.print((j+1)+"번째 데이터가 중복. 다시 입력하세요 >");
					n[i] = scan.nextInt();
					break;
				}
			}
		}
		
		System.out.print("정렬전 : ");
		printArray(n);
		
		bubbleSort(n);
		
		System.out.print("정렬후 : ");
		printArray(n);
	}
	
	public static void bubbleSort(int n[]) {
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {

				if (n[i] > n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
	}
	
	public static void printArray(int n[]){
		for(int i : n){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
