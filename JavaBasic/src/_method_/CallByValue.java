package _method_;

public class CallByValue {

	public static void main(String[] args) {
		int a = testFunction(10);
		System.out.println(a);
	}
	
	public static int testFunction(int a){
		a += 10;
		return a;
	}

}
