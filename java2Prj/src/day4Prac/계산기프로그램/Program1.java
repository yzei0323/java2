package day4Prac.계산기프로그램;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su1, su2;
		
		System.out.println("두 수를 입력하세요! 계산해드리겠습니다 >,<");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		
		//
		int total;
		total = su1+su2;
		
		
		System.out.println(total);

	}

}
