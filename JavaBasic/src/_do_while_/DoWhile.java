package _do_while_;

public class DoWhile {

	public static void main(String[] args) {
		
		// 처음 먼저 실행시키고, do-while 문이 종료후 안내문이나 다음 코드를 진행해야 할때 등 유용.
		int i = 1;
		do{
			System.out.println(i*10+" : 김기열");
			i++;
		}while(i <= 3);
		System.out.println("종료");

	}

}
