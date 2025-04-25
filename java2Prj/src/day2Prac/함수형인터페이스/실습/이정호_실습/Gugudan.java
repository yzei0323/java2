package day2Prac.함수형인터페이스.실습.이정호_실습;

public class Gugudan implements MyRunnable {
	@Override
	public void calc(int a) {
		for(int i = 1; i < 10; i++) {
			System.out.println(a + " X " + i + " = " + a * i);
		}
		
	}
}
