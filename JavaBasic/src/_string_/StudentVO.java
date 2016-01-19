package _string_;

public class StudentVO {

	private String name;
	private int Java;
	private int C;
	private int Javascript;
	private int Datastructure;

	public StudentVO(String name, int Java, int C, int Javascript, int Datastructure){
		this.name = name;
		this.Java = Java;
		this.C = C;
		this.Javascript = Javascript;
		this.Datastructure = Datastructure;
	}
	
	public StudentVO(String info[]){
		this.name = info[0];
		this.Java = Integer.parseInt(info[1]);
		this.C = Integer.parseInt(info[2]);
		this.Javascript = Integer.parseInt(info[3]);
		this.Datastructure = Integer.parseInt(info[4]);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return Java;
	}

	public void setJava(int java) {
		Java = java;
	}

	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public int getJavascript() {
		return Javascript;
	}

	public void setJavascript(int javascript) {
		Javascript = javascript;
	}

	public int getDatastructure() {
		return Datastructure;
	}

	public void setDatastructure(int datastructure) {
		Datastructure = datastructure;
	}

	@Override
	public String toString() {
		return name+" : Java - "+Java+" , C - "+C+" , Javascript - "+Javascript+" , Datastructure - "+Datastructure;
	}
}
