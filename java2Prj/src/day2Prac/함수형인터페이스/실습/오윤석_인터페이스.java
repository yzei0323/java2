package day2Prac.함수형인터페이스.실습;

interface Random {
	void run();
}

public class 오윤석_인터페이스 {
	public static void main(String[] args) {

		// 1. 지역 내부 클래스
		class A implements Random {

			@Override
			public void run() {
				int r1 = (int) (Math.random() * 9) + 1;

				System.out.println("<" + r1 + "단>");
				for (int i = 1; i <= 9; i++) {
					System.out.println(r1 + "x" + i + "=" + r1 * i);
				}
			}
		}

		A a = new A();
		a.run();

		// 2. 익명으로 클래스 정의
		Random rd = new Random() {

			@Override
			public void run() {
				int r2 = (int) (Math.random() * 5) + 1;

				for (int i = 1; i <= r2; i++) {
					String star = "";
					for (int j = 1; j <= i; j++) {
						star += "★";
					}
					System.out.println(star);
				}
			}
		};

		rd.run();

		// 3. 람다식
		Random rd2 = () -> {
			int r3 = (int) (Math.random() * 10) + 1;
			int sum = 0;
			for (int i = 1; i <= r3; i++) {
				sum += i;
			}
			System.out.println("1부터 " + r3 + "까지의 합: " + sum);
		};
		rd2.run();
	}
}
