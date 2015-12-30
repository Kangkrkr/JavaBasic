package _while_;

public class WhileGuGu {

	public static void main(String[] args) {
		
		int i = 2;
		while(i <= 9){
			
			int j = 1;
			while(j <= 9){
				
				int k = i;
				while(k < i+4){
					System.out.print(k +" * "+ j + " = "+(k*j)+"\t");
					k++;
				}
				System.out.println();
				
				j++;
			}
			System.out.println();
			i+=4;
		}
		
	}

}
