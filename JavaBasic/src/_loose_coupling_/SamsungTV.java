package _loose_coupling_;

public class SamsungTV implements TV {

	private Speaker speaker = new OrangeSpeaker(); // 업캐스팅
	
	@Override
	public void powerOn() {
		System.out.println("삼성TV : 전원을 킵니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("삼성TV : 전원을 끕니다.");
	}

	@Override
	public void channelUp() {
		System.out.println("삼성TV : 채널을 올립니다.");
	}

	@Override
	public void channelDown() {
		System.out.println("삼성TV : 채널을 내립니다.");
	}

	@Override
	public void soundUp() {
		if(speaker == null){
			System.out.println("삼성TV : 볼륨을 올립니다.");
		}else{
			speaker.soundUp();
		}
	}

	@Override
	public void soundDown() {
		if(speaker == null){
			System.out.println("삼성TV : 볼륨을 내립니다.");
		}else{
			speaker.soundDown();
		}
	}
	
	public static void main(String[] args) {
		SamsungTV samsungTV = new SamsungTV();
		samsungTV.powerOn();
		samsungTV.soundUp();
	}

}
