package _method_;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열을 비교해서 작은걸 앞으로, 큰걸 뒤로
		// 10 50 20 5 4 시작
		// 5 50 20 10 4
		// [4] 50 20 10 5 -> 제일 작은 수 확정
		// [4] 20 50 10 5
		// [4] 10 50 20 5
		// [4] [5] 50 20 10 -> 두번째 작은 수 확정 ...
		int n[] = {10, 50, 20, 5, 4};
		printArray(n);
		
		selectionSort(n);
		printArray(n);
	}
	
	public static void selectionSort(int n[]){
		
		for(int i=0; i<n.length-1; i++){
			for(int j=i+1; j<n.length; j++){
				if(n[i] > n[j]){
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
