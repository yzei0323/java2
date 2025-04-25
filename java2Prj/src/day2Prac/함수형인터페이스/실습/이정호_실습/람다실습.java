package day2Prac.함수형인터페이스.실습.이정호_실습;

import java.util.Scanner;

public class 람다실습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//-----------------구구단----------------
		
		Gugudan dan = new Gugudan();
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		dan.calc(num);
		
		//------------------팩토리얼---------------
		
		System.out.print("숫자를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		MyRunnable fac = new MyRunnable() {
			@Override
			public void calc(int a) {
				int fac = 1;
				
				for(int i = 1; i <= a; i++) {
					fac *= i;
				}
				
				System.out.println(fac);
			}
		};
		
		fac.calc(num2);
		
		//--------------------2의 제곱수---------------
		
		System.out.print("숫자를 입력하세요 : ");
		int num3 = scan.nextInt();
		
		MyRunnable two_square = (a) -> {
			int result = 1;
			
			for(int i = 1; i <= a; i++) {
				result *= 2;
			}
			
			System.out.println(result);
		};
		
		two_square.calc(num3);
	}

}
