package _operator_;

public class OpTest14_Q {

	public static void main(String[] args) {
		
		// 4 ~ 15 사이의 정수를 난수로 발생시켜보시오.
		System.out.println((int)(Math.random() * 12) + 4);
		
		// 아래의 숫자들 중 하나만 난수로 발생시켜 보시오.
		// 600   700   800   900   1000
		// 1100  1200  1300  1400  1500
		// 1600  1700  1800  1900  2000
		// 2100  2200  2300
		System.out.println(((int)(Math.random() * 18) + 6)*100);
	}

}
