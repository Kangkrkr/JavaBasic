package _continue_;

public class ContinueTest1 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1; i<=1000; i++){
			if((i%3) != 0) continue;
			
			sum+=i;
		}
		
		System.out.println(sum);
		
	}

}
