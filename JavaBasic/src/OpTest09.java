


public class OpTest09 {

	public static void main(String[] args) {
		
		int i = 10;			// 1010
		int j = 5;			// 0101
		
		i = i^j;			// 1111
		j ^= i;
		i ^= j;
		
		//System.out.println((i^j)^i);
		//System.out.println((i^j)^j);
		System.out.println(i);
		System.out.println(j);
	}
}
