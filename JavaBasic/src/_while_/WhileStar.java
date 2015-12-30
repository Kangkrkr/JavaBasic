package _while_;

public class WhileStar {

	public static void main(String[] args) {
		
		int i = 0;
		while(i<5){
			int j = 0;
			while(j<=i){
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println();
		
		i = 5;
		while(i>0){
			int j = 0;
			while(j<i){
				System.out.print('*');
				j++;
			}
			System.out.println();
			i--;
		}
		
		System.out.println();
		
		i = 5;
		int pos = 0;
		while(i>0){
			int j = 0;

			pos = 5 - i;
			
			while(pos > 0){
				System.out.print(' ');
				pos--;
			}
			
			while(j<i){
				System.out.print('*');
				j++;
			}
			System.out.println();
			i--;
		}

		System.out.println();
		
		pos = 4;
		i = 5;
		while(i>0){
			int j = 0;
			int temp = pos;
			
			while(temp > 0){
				System.out.print(' ');
				temp--;
			}
			
			while(j<(5-pos)){
				System.out.print('*');
				j++;
			}
			System.out.println();
			i--;
			pos--;
		}
	}

}
