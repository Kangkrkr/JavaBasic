package _method_;

public class CallByReference {

	public static void main(String[] args) {
		
		int a[] = {100, 200};
		System.out.println(a[0]+" "+a[1]);
		
		callByReference(a);
		System.out.println(a[0]+" "+a[1]);
	}
	
	public static void callByReference(int a[]){
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
}
