package _oop_;

public class Point3D extends Point2D{

	private int z;
	
	public Point3D(){
		super(10, 10);
		this.z = 10;
	}
	
	public Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static void main(String[] args) {
		Point3D point3d = new Point3D();
		System.out.print("x : "+point3d.x+" ,  ");
		System.out.print("y : "+point3d.y+" , ");
		System.out.print("z : "+point3d.z);
		
	}

}
