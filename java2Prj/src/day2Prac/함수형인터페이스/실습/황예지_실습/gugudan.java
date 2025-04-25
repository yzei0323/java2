package day2Prac.함수형인터페이스.실습.황예지_실습;

public class gugudan implements MyRunnable {

	@Override
	public void run() {
		
		System.out.println("구구단 4단을 출력해보겠습니다");
		for(int i=1; i<=9; i++) {
			System.out.println("4 × "+i+" = "+4*i);
		}
	}
}
