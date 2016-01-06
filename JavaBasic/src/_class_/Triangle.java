package _class_;

public class Triangle extends Shape {

	int w = 10;
	int h = 5;
	
	@Override
	public void area() {
		System.out.println((w*h)/2);
	}
	
}
