package _oop_;

public class AnimalTest {

	public static void main(String[] args) {

/*		Eagle eagle = new Eagle();
		Bird bird= new Bird();
		Animal animal = new Eagle();

		System.out.println(eagle);
		System.out.println(bird);
		System.out.println(animal);
		
		Bird bird2 = (Bird)animal;
		System.out.println(bird2);*/
		
		Eagle eagle = new Eagle();
		
		// 업캐스팅 : 자식타입을 부모타입에 대입시 발생.
		// 다운캐스팅 : 부모타입을 자식타입에 대입시 발생.
		
		Bird bird = null;
		if(bird instanceof Eagle){	// instanceof 연산자는 다운캐스팅일 경우에만 유효.
			bird = new Eagle();
			System.out.println("hi~");
		}
	}

}
