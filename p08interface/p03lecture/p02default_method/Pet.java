package p08interface.p03lecture.p02default_method;

public interface Pet {

	void sit();
	//몸통까지 쓸 수있는 메소드 : default메서드
	public default void roll() {//항상 pulbic
		System.out.println("자리에 앉습니다.");
		//눈에는 안보이지만 dog과 cat은 roll메서드가 있습니다.
	}
}
