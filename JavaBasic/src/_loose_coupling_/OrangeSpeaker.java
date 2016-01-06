package _loose_coupling_;

public class OrangeSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("오렌지 스피커 : 사운드 업");
	}

	@Override
	public void soundDown() {
		System.out.println("오렌지 스피커 : 사운드 다운");
	}

}
