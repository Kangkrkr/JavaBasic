package _for_;

public class ForTest02 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=1000; i+=3){
			
			// 3의 배수의 합계
			if((i % 3) == 0){
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
