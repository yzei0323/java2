package day2Prac.함수형인터페이스.실습;

@FunctionalInterface
interface MyRunnable {
	int calc(int a, int b);
}


public class 이수민_오전실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이름이 있는 클래스
		
		class Sum implements MyRunnable {

			@Override
			public int calc(int a, int b) {
				
				return a+b;
			}

			
		}
		
		Sum sum = new Sum();
		//sum.calc(5, 3);
		System.out.println(sum.calc(5, 3));
		
		//익명클래스
		MyRunnable sub = new MyRunnable() {
			
			@Override
			public int calc(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		//sub.calc(8, 3);
		System.out.println(sub.calc(8, 3));
		
		//람다식
		MyRunnable mul = (a,b)->{return a*b;};
		
		//mul.calc(2, 8);
		System.out.println(mul.calc(2, 8));
		
	}

}
