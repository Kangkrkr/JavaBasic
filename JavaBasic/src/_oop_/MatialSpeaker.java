package _oop_;

public class MatialSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("마샬 스피커 : 사운드를 올립니다.");
	}

	@Override
	public void soundDown() {
		System.out.println("마샬 스피커 : 사운드를 내립니다.");
	}

}
