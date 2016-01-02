package _method_;

import java.util.Scanner;

public class MethodTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("누구의 명언 ? > ");
		String name = scan.next();
		
		saySlamdunk(name);
	}
	
	public static void saySlamdunk(String name){
		if(name.equals("정대만")){
			System.out.println("그래 난 정대만. 포기를 모르는 남자다.");
		}else if(name.equals("안선생님")){
			System.out.println("포기하는 그 순간이 시합종료다.");
		}else if(name.equals("채치수")){
			System.out.println("리바운드를 제압하는 자가 시합을 제압한다.");
		}else if(name.equals("강백호")){
			System.out.println("영감님의 최고의 순간은 언제였죠? 난 지금.");
		}else if(name.equals("송태섭")){
			System.out.println("넘버1 가드");
		}else if(name.equals("서태웅")){
			System.out.println("내가 북산을 전국제일로 이끈다.");
		}else{
			System.out.println("누구냐 넌 ?");
		}
	}

}
