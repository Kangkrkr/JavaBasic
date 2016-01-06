package _exception_;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try{
			System.out.println("a() 호출전");
			a();
			System.out.println("a() 호출후");
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("메인 메서드의 catch 블럭");
			e.printStackTrace();
		}finally{
			System.out.println("메인 메서드의 finally 블럭");
		}
		
		System.out.println("수행 완료.");
		
	}
	
	public static void a(){
		try{
			System.out.println("b() 호출전");
			b();
			System.out.println("b() 호출후");
		}catch (Exception e) {
			System.out.println("a() 메서드의 catch 블럭");
			e.printStackTrace();
		}finally{
			System.out.println("a() 메서드의 finally 블럭");
		}
	}
	
	public static void b(){
		
	}

}
