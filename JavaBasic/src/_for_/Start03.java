package _for_;

public class Start03 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++){
//			
//			int pos = 0;
//			
//			for(int j=1; j<i; j++){
//				System.out.print(' ');
//				pos++;
//			}
//			
//			for(int k=pos; k<5; k++){
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				System.out.print(i<=j ? '*' : ' ');
			}
			System.out.println();
		}

	}
}
