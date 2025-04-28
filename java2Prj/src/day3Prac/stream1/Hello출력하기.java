package day3Prac.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello출력하기 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("bye");
		list.add("hi^^");
		list.add("hello^^");
		list.add("hi");
		
		//스트림으로 얻어오기
		//1)모든요소 출력하기
		
		Stream <String> stream = list.stream();
		
		//forEach(); //최종연산
		stream.forEach(item -> System.out.println(item));
		
		
		//2) hello만 출력하기
		System.out.println("hello 출력하기");
		stream = list.stream();
		stream.filter(str->str.equals("hello")).forEach(item->System.out.println(item));
		//stream.filter( str -> str.equals("hello")).forEach( item -> System.out.println(item));
		
		stream = list.stream();
		stream.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.equals("hi");
			}}).forEach( item -> System.out.println(item));
 	
		
		//3) hello에서 2개만 출력하기
		System.out.println("hello 같은 거에서 2개만 출력하기");
		stream = list.stream();
		stream.filter(str -> str.equals("hello")).limit(2).forEach(str->System.out.println(str));
		
		
		//hello만 List로 만들기
		stream = list.stream();
		List<String> helloList = stream.filter(str -> str.equals("hello")).collect(Collectors.toList());
		
		System.out.println("helloList출력");
		helloList.forEach(item -> System.out.println(item));
		
	
	}
}
