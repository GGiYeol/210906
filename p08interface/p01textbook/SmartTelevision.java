package p08interface.p01textbook;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다");
	}

	@Override
	public void turnOn() {
		System.out.println("tV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	
	
}
