package _api_;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		
		cal.set(year, month-1, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK);			// 해당 년도, 해당 달의 첫날(1일)이 달력의 몇번째에 있는가(무슨요일인가).
		int endDay = cal.getActualMaximum(Calendar.DATE);	// 해당 년도, 해당달의 마지막 날짜를 반환한다.
		System.out.println(week);
		System.out.println(endDay);
		
		System.out.println(year+"년 "+month+"월");
		System.out.println("---------------------------------");
		System.out.println("  일   월   화   수   목   금   토");
		System.out.println("---------------------------------");
		
		for(int space=1; space<week; space++){
			System.out.print("   ");
		}
		
		for(int d=1, w = week; d<=endDay; d++, w++){
			System.out.print(d < 10 ? " "+d+" " : d+" ");
			if(w % 7 == 0)System.out.println();
		}
	}

}
