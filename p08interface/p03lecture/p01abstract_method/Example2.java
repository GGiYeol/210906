package p08interface.p03lecture.p01abstract_method;

public class Example2 {

	public static void main(String[] args) {
		Pet p1 = new Cat();
		//상위타입이라서
		Pet p2 = new Malamute();
		
		p1.sit();
		p2.sit();
	}
}
