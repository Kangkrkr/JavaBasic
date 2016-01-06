package _oop_;

public class BritzSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("블리츠 스피커 : 소리를 키웁니다.");
	}

	@Override
	public void soundDown() {
		System.out.println("블리츠 스피커 : 소리를 줄입니다.");
	}

	public static void main(String[] args) {
		
	}

}
