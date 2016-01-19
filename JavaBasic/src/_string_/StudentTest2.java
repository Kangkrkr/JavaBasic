package _string_;


public class StudentTest2 {

	public static void main(String[] args) {
		
		// 서태지,100,90,80,70

		for(int i=0; i<args.length; i++){
			String student[] = args[i].split(",");
			StudentVO studentVO = new StudentVO(student);
			System.out.println(studentVO);
		}
	}

}
