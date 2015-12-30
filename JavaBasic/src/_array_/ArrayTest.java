package _array_;

public class ArrayTest {

	public static void main(String[] args) {
		
		int score[] = new int[3];
		score[0] = 100;
		score[1] = 95;
		score[2] = 80;
		
		int sum = 0;
		int length = score.length;
		for(int i=0; i<length; i++){
			sum += score[i];
		}
		
		System.out.println("평균 : "+ (sum/length));
		
	}

}
