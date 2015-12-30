package _array_;

public class ArrayTest05 {

	public static void main(String[] args) {
		Object[] score = {"신해철", 100, 90, 80, 70};
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t철학\t사회\t총점\t평균");
		System.out.println("--------------------------------------------------------------");
		
		int sum = 0;
		
		for(int col = 0; col < score.length; col++){
			if(score[col] instanceof String){
				System.out.print(score[col]+"\t");
			}else if(score[col] instanceof Integer){
				System.out.print(score[col]+"\t");
				sum += (int)score[col];
			}
		}
		
		System.out.print(sum+"\t"+ (sum / score.length));
		
	}

}
