package p08interface.p03lecture.p01abstract_method;

public class Exmaple1 {

	public static void main(String[] args) {
		
		Cat cat  =  new Cat();
		Malamute malamute  = new Malamute();
		
		KindaCat kc = cat;
		KindaDog kd = malamute;
		
		//인터페이스를 구현할 수 있다. pet이 상위타입이다.
		Pet p1 = cat;
		Pet p2 = malamute;
		
		System.out.println(cat instanceof Cat);
		System.out.println(cat instanceof KindaCat);
		System.out.println(malamute instanceof Malamute);
		System.out.println(malamute instanceof KindaDog);
		System.out.println(cat instanceof Pet);
		System.out.println(malamute instanceof Pet);
	}
}
