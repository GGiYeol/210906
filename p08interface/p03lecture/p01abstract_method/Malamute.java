package p08interface.p03lecture.p01abstract_method;

public class Malamute extends KindaDog implements Pet, SledDog{
//인터페이스
	public void bark() {
		System.out.println("멍멍");
	}
	@Override
		public void sit() {
		System.out.println("앉습니다.");
	}
	
	@Override
		public void pull() {
		System.out.println("썰매를 끕니다.");
	}
}
