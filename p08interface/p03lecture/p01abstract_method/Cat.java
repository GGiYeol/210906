package p08interface.p03lecture.p01abstract_method;

public class Cat extends KindaCat implements Pet{
//인터페이스
	@Override
	public void sit() {
		System.out.println("무시합니다");
	}
}
