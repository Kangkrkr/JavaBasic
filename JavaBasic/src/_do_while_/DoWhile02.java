package _do_while_;

public class DoWhile02 {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		do {
			i = (int) (Math.random() * 6 + 1);
			j = (int) (Math.random() * 6 + 1);
		} while (i == j);
		// 반드시 서로 다른 숫자가 나온다.
		
		
		System.out.println(i+","+j);
	}

}
