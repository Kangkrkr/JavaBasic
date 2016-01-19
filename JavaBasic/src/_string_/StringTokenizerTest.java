package _string_;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		// 여러개의 delim을 줄 경우에는 해당 delim을 모두 인식하여 문자열을 잘라낸다.
		StringTokenizer st = new StringTokenizer("강백호|정대만,서태웅|송태섭,채치수|김준호", "|,");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		/*	강백호
			정대만
			서태웅
			송태섭
			채치수
			김준호*/
	}
}
