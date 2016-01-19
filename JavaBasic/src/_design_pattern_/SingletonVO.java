package _design_pattern_;

public class SingletonVO {

	private static SingletonVO dummy = new SingletonVO();
	
	// 1. 생성자를 private로 만든다.
	// 2. 자기자신을 참조하는 변수를 생성.
	// 3. 변수가 참조하는 인스턴스를 리턴하는 getter 혹은 getInstance 메소드 생성.
	// 4. 인스턴스를 오직 한번만 생성후 리턴.
	
	private SingletonVO(){}
	
	public static SingletonVO getInstance(){
		
		if(dummy == null){
			dummy = new SingletonVO();
		}
		
		return dummy;
	}
}
