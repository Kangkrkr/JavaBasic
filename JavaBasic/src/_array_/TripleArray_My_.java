package _array_;

public class TripleArray_My_ {

	public static void main(String[] args) {
		
		Object[][][] score = {
				{ { "이름", "국어", "영어", "수학", "철학", "총점", "평균" },
				  { "김기열", 100, 90, 80, 70 },
				  { "클루니", 90, 80, 70, 60 },
				  { "조니뎁", 80, 70, 60, 50 } },
				  
				{ { "이름", "국어", "영어", "수학", "철학", "총점", "평균" },
				  { "김기열", 90, 80, 70, 60 },
				  { "클루니", 80, 70, 60, 50 },
				  { "조니뎁", 70, 60, 50, 40 } 
				}
		};
		
		int totalRow = score[0].length - 1;
		int totalCol = score[0][1].length - 1;
		int total[][] = new int[totalRow][totalCol];
		
		for(int k=0; k<score.length; k++){
			
			for(int i=0; i<score[k].length; i++){
				
				int sum = 0;
				int count = 0;
				
				for(int j=0; j<score[k][i].length; j++){

					Object value = score[k][i][j];
					
					if(value instanceof String){
						System.out.print(value+"\t");
					}else if(value instanceof Integer){
						sum += (int)value;
						count++;
						
						if(i > 0 && j > 0){
							total[i-1][j-1] += (int)value;
						}
						
						System.out.print(value+"\t");
					}
				}
				System.out.print((i > 0) ? sum+"\t"+(sum/count)+"\t" : "\n---------------------------------------------------");
				System.out.println();
			}
			
			System.out.println();
		}
		
		System.out.println("이름\t국어\t영어\t수학\t철학\t총점\t평균");
		for(int i=0; i<total.length; i++){
			System.out.print(score[0][i+1][0]+" : \t");
			int sum= 0;
			for(int j=0; j<total[i].length; j++){
				sum+=total[i][j]/2;
				System.out.print(total[i][j]/2+"\t");
			}
			System.out.println(sum+"\t"+sum/total[i].length);
		}

	}
}
