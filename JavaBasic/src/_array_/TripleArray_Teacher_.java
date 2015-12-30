package _array_;

public class TripleArray_Teacher_ {

	public static void main(String[] args) {
		
		Object[][][] score = {
				{ { "이름", "국어", "영어", "수학", "철학", "총점", "평균" },
				  { "김기열", 100, 90, 80, 70, 0, 0 },
				  { "클루니", 90, 80, 70, 60, 0, 0 },
				  { "조니뎁", 80, 70, 60, 50, 0, 0 } },
				  
				{ { "이름", "국어", "영어", "수학", "철학", "총점", "평균" },
				  { "김기열", 90, 80, 70, 60, 0, 0 },
				  { "클루니", 80, 70, 60, 50, 0, 0 },
				  { "조니뎁", 70, 60, 50, 40, 0, 0 } 
				}
		};
		
		for(int tab=0; tab<score.length; tab++){
			System.out.println((tab + 1)+"학기 성적");
			for(int row=0; row < score[tab].length; row++){
				int sum = 0;
				for(int col=0; col<score[tab][row].length-2; col++){
					System.out.print(score[tab][row][col]+"\t");
					if(row == 0 || col == 0) continue;
					sum += (Integer)score[tab][row][col];
				}
				
				if(row != 0){
					score[tab][row][5] = sum;
					score[tab][row][6] = sum/4;
				}
				System.out.println(score[tab][row][5]+"\t"+score[tab][row][6]);
			}
			System.out.println();
		}
		
		for(int row = 0; row < score[0].length; row++){
			for(int col = 0; col < score[0][row].length; col++){
				if(score[0][row][col] instanceof Integer){
					System.out.print(((Integer)score[0][row][col] + (Integer)score[1][row][col])/2 + "\t");
				}else{
					System.out.print(score[0][row][col]+"\t");
				}
			}
			System.out.println();
		}

	}
}
