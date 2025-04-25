package day2Prac.함수형인터페이스.실습.황예지_실습;

public class 실습Main {

	public static void main(String[] args) {
	
		// 1.이름있는 클래스
		MyRunnable g = new gugudan();
		
		
		// 2. 익명클래스
		MyRunnable g2 = new MyRunnable() {

			@Override
			public void run() {
				
				System.out.println("구구단 8단을 출력해보겠습니다");
				for(int i=1; i<=9; i++) {
					System.out.println("8 × "+i+" = "+8*i);
				}
			}};
			
			
		// 3. 람다식
		MyRunnable g3 = ()->{
			System.out.println("구구단 6단을 출력해보겠습니다");
			for(int i=1; i<=9; i++) {
				System.out.println("6 × "+i+" = "+6*i);
			}
		};	
		
		
		
		//실행
		g.run();
		g2.run();
		g3.run();


	}

}
