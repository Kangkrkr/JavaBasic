package _method_;

public class MethodTest {

	public static void main(String[] args) {
		// …
		int a = 5;
		int b = 2;
		
		System.out.println(a+" + "+b+" = "+(add(a, b)));
		System.out.println(a+" - "+b+" = "+(minus(a, b)));
		System.out.println(a+" / "+b+" = "+(divide(a, b)));
		System.out.println(a+" % "+b+" = "+(modular(a, b)));
	}
	
	public static int add(int a, int b){
		return a+=b;
	}
	
	public static int minus(int a, int b){
		return a-=b;
	}
	
	public static int divide(int a, int b){
		return a/=b;
	}
	
	public static int modular(int a, int b){
		return a%=b;
	}
}
