package day4Prac.계산기프로그램;

import java.util.Scanner;

public class Program3 {

	//계산기클래스
	AcornCalculator cal = new AcornCalculator();
	
	
	//run()
	public void run() {
		System.out.println("계산기 프로그램 시작 !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요! 계산해드릴게요333（＞人＜）");
		
		int su1, su2;
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		int total = cal.add(su1, su2);
		System.out.println(total);
	}
	
	
	public static void main(String[] args) {
		Program3 p = new Program3();
		p.run();
	}

}
