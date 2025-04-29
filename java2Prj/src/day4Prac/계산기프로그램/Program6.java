package day4Prac.계산기프로그램;

import java.util.Scanner;

public class Program6 {

	//인터페이스에 의존? 맞나이것도?
	Calculator calculator;
	
	
	// 생성자주입	Program6이 생성될 때 매개변수로 계산기객체calculator를 받음
	public Program6(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void run() {
		
		System.out.println("프로그램 시작!! ver6");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하셍여");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
	
		int total =  calculator.add(su1, su2);
		System.out.println(total);
	}
	
	
	public static void main(String[] args) {
		
	//	Program6 p = new Program6(new A()); 	//계산기 객체 주입
	//	p.run();
		
		Program6 p = new Program6(new B()); 	//계산기 객체 주입
		p.run();

	}

	
	//결합이 느슨해야 변경이 쉽다
	//쉽게 변경 -> 고칠 게 별로 없다

	

}
