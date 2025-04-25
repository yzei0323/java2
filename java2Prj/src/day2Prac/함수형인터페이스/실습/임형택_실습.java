package day2Prac.함수형인터페이스.실습;

interface 곱하기실습 {
	int 곱하기(int x, int y);
}

public class 임형택_실습 {

	public static void main(String[] args) {
		
		// 1. 이름 있게 만들기
		class A implements 곱하기실습 {
			@Override
			public int 곱하기(int x, int y) {
				return x * y;
			}
		}
		
		A m1 = new A();
		int result1 = m1.곱하기(3, 4);
		System.out.println("이게 이름 있는 거: " + result1);
		
		
		// 2. 익명 만들기
		곱하기실습 m2 = new 곱하기실습() {
			@Override
			public int 곱하기(int x, int y) {
				return x * y;
			}
		};
		int result2 = m2.곱하기(5, 6);
		System.out.println("이게 익명인가: " + result2);
		
		
		// 3. 람다식으로 만들기
		곱하기실습 m3 = (x, y) -> x * y;
		int result3 = m3.곱하기(7, 8);
		System.out.println("이게 람다인가: " + result3);
		
	}
}
