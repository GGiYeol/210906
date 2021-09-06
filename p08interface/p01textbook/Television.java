package p08interface.p01textbook;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
	}
	
	
}
