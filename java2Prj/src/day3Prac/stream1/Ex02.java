package day3Prac.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {
		
		
		//객체
		
		String[] arr = new String[5];
		arr[0]="hi";
		arr[1]="hello";
		arr[2]="bye";
		arr[3]="hi^^";
		arr[4]="hello^^";

		
		//
		Arrays.sort(arr);
		
		for(String str : arr) {
			System.out.println(str);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("bye");
		list.add("hi^^");
		list.add("hello^^");
		
		//ArrayList -> Collections.sor
		Collections.sort(list);
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
		//객체배열 => 스트림으로 변환하기
		//Stream.of(배열)
		//1)스트림으로 얻어오기
		Stream <String> stream= Stream.of(arr);
		
		
		
		//2)0~n번의 중간 연산
		//3)최종연산 1번 (사용이 끝난 스트림이 종료됨, 재사용 불가)
		System.out.println("스트림으로 정렬하고 출력하기");
		stream.sorted().forEach(item -> System.out.println(item));
		
		
		//
		Stream <String> stream2 = list.stream();
		stream2.sorted().forEach(item -> System.out.println(item));	//람다식 => 매서드참조
	//	stream2.sorted().forEach(System.out::println);
		
		stream2 = list.stream();
		stream2.sorted().forEach( (item)->{System.out.println(item);});
		
	}

}
