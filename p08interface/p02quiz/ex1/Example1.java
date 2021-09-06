package p08interface.p02quiz.ex1;

public class Example1 {

	public static void main(String[] args) {
		//interface Sword만들고
		//구현 클래스 FireSword, RainbowSword만들고
		//출력 결과: 불검을 장착합니다
		//공격합니다.
		//불공격
		//무지개검~
		Hero hero = new Hero();
		
		System.out.println("불검을 장착합니다.");
		hero.setSword(new FirsSword());
		
		System.out.println("공격합니다.");
		hero.attack();
		
		System.out.println("무지개검을 장착합니다.");
		hero.setSword(new RainbowSword());
		
		System.out.println("공격합니다.");
		hero.attack();
	}
}
