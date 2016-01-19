package _string_;


public class StudentTest {

	public static void main(String[] args) {
		
		// 서태지,100,90,80,70 박진영,90,80,70,60 양현석,80,70,60,50

		for(int i=0; i<args.length; i++){
			String student[] = args[i].split(",");
			StudentVO studentVO = new StudentVO(student);
			System.out.println(studentVO);
		}
	}

}
