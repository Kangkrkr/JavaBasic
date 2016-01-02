package _method_;

public class FindMaximum {

	public static void main(String[] args) {
		
		int n[] = {23, 45, 55, 30, 10, 999, 1};
		
		int temp = n[0];
		
		for(int i=1; i<n.length; i++){
			temp = (temp < n[i]) ? n[i] : temp;
		}
		
		System.out.println("가장큰 값은 : "+temp);
		
	}

}
