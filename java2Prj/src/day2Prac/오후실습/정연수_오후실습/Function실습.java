package day2Prac.오후실습.정연수_오후실습;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;

public class Function실습 {

	public static void main(String[] args) {


		Function<Integer, Integer> f1 = (num) -> { 
			int result = (int) Math.pow(num, 2);
			return result;
		};
		
		int result1 = f1.apply(3);
		System.out.println(result1);
		
		
		Function<Integer, Integer> f2 = (numm) -> {
			Random r = new Random();
			int result = r.nextInt(numm) + 1;
			return result;
		};
		
		int result2 = f2.apply(10);
		System.out.println(result2);
		
		Function<Integer, ArrayList<String>> f3 = (price) -> {
			ArrayList<String> list = new ArrayList<>();
			int fifthThousand = 0;
			int tenThousand = 0;
			int fiveThousand = 0;
			int oneThousand = 0;
			
			if (price >= 50000) {
				fifthThousand = price / 50000;
				price = price % 50000;
				list.add("오만원 " + fifthThousand + "장");
			}
			if (price >= 10000) {
				tenThousand = price / 10000;
				price = price % 10000;
				list.add("만원 " + tenThousand + "장");
			}
			if (price >= 5000) {
				fiveThousand = price / 5000;
				price = price % 5000;
				list.add("오천원 " + fiveThousand + "장");
			}
			if (price >= 1000) {
				oneThousand = price / 1000;
				price = price % 1000;
				list.add("천원 " + oneThousand + "장");
			}
			return list;
			
			
		};
		
		ArrayList<String> result3 = f3.apply(345000);
		System.out.println(result3);

	}

}
