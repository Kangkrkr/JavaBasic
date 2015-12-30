package _api_;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+" - "+
				(c.get(Calendar.MONTH) + 1) +" - "+
				(c.get(Calendar.DATE)));
		
		c.add(Calendar.DATE, 100);	// 100일을 더한다.
		
		System.out.println(c.get(Calendar.YEAR)+" - "+
				(c.get(Calendar.MONTH) + 1) +" - "+
				(c.get(Calendar.DATE)));
	}
}
