package _string_;

public class StringTest4 {

	public static void main(String[] args) {

		int month = 1<<1;
		int date = 0;
		
		for(int start = 1; start <= 19; start++){
			date = start;
		}
		
		System.out.println(month+"월"+date+"일");
		
	}

}
