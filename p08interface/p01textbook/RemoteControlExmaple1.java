package p08interface.p01textbook;

public class RemoteControlExmaple1 {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc = new Audio();
		
		System.out.println(rc instanceof RemoteControl);
		System.out.println(rc instanceof Audio);
		
		System.out.println(rc instanceof Television);
		
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(0);
	}
}
