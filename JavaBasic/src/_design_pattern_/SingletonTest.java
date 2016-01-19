package _design_pattern_;

public class SingletonTest {

	public static void main(String[] args) {
		
		SingletonVO dummy1 = SingletonVO.getInstance();
		System.out.println(dummy1.toString());
		System.out.println(dummy1.getClass());
		System.out.println(dummy1.hashCode());
		
		System.out.println();
		
		SingletonVO dummy2 = SingletonVO.getInstance();
		System.out.println(dummy2.toString());
		System.out.println(dummy2.getClass());
		System.out.println(dummy2.hashCode());
	}

}
