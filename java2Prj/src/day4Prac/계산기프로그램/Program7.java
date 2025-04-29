package day4Prac.계산기프로그램;

import java.util.Scanner;

public class Program7 {

	//직접 생성하지 않고 외부에서 생성된 계산기 객체 주입하기
	//세터주입
	Calculator calculator;
	
	
	//세터주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
	public void run() {
		
		System.out.println("프로그램 시작 ~!! ver7");
		System.out.println("두 수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		int total = calculator.add(su1, su2);
	
		System.out.println(total);
	}
	
	
	public static void main(String[] args) {
		Program7 p = new Program7();
	//	p.setCalculator(new A());
	//	p.setCalculator(new B());
		p.run();

	}

}
