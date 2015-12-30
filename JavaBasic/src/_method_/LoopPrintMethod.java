package _method_;

public class LoopPrintMethod {

	public static void main(String[] args) {
		loopPrint('♥', 5);
	}
	
	public static void loopPrint(char c, int count){
		
		for(int row = 0; row<count; row++){
			for(int col = 0; col<=row; col++){
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

}
