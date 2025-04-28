package day3Prac.실습;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class 난수스트림_짝수의합 {

	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<>(); //중복제거
		
		Random r = new Random();
		
		for(int i=0; i<20; i++) {
			numbers.add(r.nextInt(46));
		}
		
		Integer[] result = new Integer[6];
		Object[] numberArray = numbers.toArray();   //set -> 난수배열 -> 새로운 복사하기

		System.arraycopy(numberArray, 0, result, 0, 6);
						//numberArray값을 result에 6개.. 복사?
		
		System.out.println(Arrays.toString(result));
		
		System.out.println("스트림으로 생성후 출력");
		IntStream stream = new Random().ints(1,46);
		stream.distinct().limit(6).sorted().forEach(number->System.out.print(number+"  "));
		//1부터 46까지 숫자 랜덤으로 6개 생성하고 출력해줘
		System.out.println("");
		
		
		System.out.println("난수 스트림을 만들고 짝수의 합 구하기");
		int sum[] = {0};
		
		IntStream stream1 = new Random().ints(1,100);
		stream1.distinct().limit(10).sorted().forEach(su -> {
			System.out.print(su+"  ");
			if(su%2==0) {
				sum[0] += su;
			}
		});
		
		System.out.println("");
		System.out.println("짝수의 합: "+sum[0]);
		
	}

}
