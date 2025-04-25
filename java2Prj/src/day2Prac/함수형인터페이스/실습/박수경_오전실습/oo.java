package day2Prac.함수형인터페이스.실습.박수경_오전실습;

public class oo {
	public static void main(String[] args) {
		Star s = new Star();
		s.pick();
		
		Runnable r = s;
		r.pick();
		
		//2.익명
		Runnable r2 = new Runnable() {

			@Override
			public void pick() {
				System.out.println("익명");
			}
			
		};
		r2.pick();
		
		
		//3.람다식
		Runnable r3 = () -> {System.out.println("람다식 사용");};
		r3.pick();
		
		
		
		
		
	}
}
