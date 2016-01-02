package _method_;

public class BubbleSort {

	public static void main(String[] args) {

		int n[] = {4,1,5,2,3};
		
		for(int i : n){
			System.out.print(i+" ");
		}
		System.out.println();
		
		bubbleSort(n);
		for(int i : n){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int n[]){
		
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

}
