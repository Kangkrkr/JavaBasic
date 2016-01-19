package _collections_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("첼리비다");
		set.add("카라얀");
		set.add("로스트로포비치");
		set.add("푸르트뱅글러");
		set.add("토스카니니");

		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
