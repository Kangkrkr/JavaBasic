package _class_;

public class Circle extends Shape {

	int r = 10;
	
	@Override
	public void area() {
		System.out.println((3.14*r*r));
	}

}
