package day3prac.복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class No1 {
	
	public static void main(String[] args) {
		
		String[] list = new String[4];
		list[0]="집";
		list[1]="보";
		list[2]="내";
		list[3]="줘";
		
		System.out.println("배열순대로 정렬");
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
		System.out.println("스트림으로 정렬");
		Stream <String> stream = Stream.of(list);
		stream.sorted().forEach(dkanrjsk -> System.out.println(dkanrjsk));
		
		System.out.println("정렬");
		Arrays.sort(list);
		for(String item : list) {
			System.out.println(item);
		}
		
		//1) 난수 스트림을 만들고  짝수의 합 구하기
		IntStream stream1 = new Random().ints(1,10).limit(10).peek( item-> System.out.println( item));
	    int result = stream1.filter(n -> n%2==0).sum();
		System.out.println(result);
		
	}
	
}
