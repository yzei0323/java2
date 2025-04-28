package day3prac.복습;

import java.util.ArrayList;
import java.util.stream.Stream;

import day3prac.stream2.Moving;
import day3prac.stream3.Acorn;

public class No2 {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer( 1,"S", "vip", 102));
		list.add(new Customer( 2,"I", "bronze", 24));
		list.add(new Customer( 3,"B", "vvip", 1234));
		list.add(new Customer( 4,"W", "vip", 143));
		list.add(new Customer( 5,"A", "vip", 434));
		list.add(new Customer( 6,"Q", "vvip", 513));
		list.add(new Customer( 7,"G", "vip", 163));
		list.add(new Customer( 8,"E", "bronze", 83));
		list.add(new Customer( 9,"R", "bronze", 35));
		list.add(new Customer( 10,"T", "bronze", 63));
		
		// 1. 고객등급이 vvip 사람이 몇명인지 
		Stream<Customer> stream = list.stream();
		long count = stream.filter(cus -> cus.getGrade().equals("vvip")).count();
		System.out.println("vvip 수:" + " " + count);
		
		// 2. 고객등급이 vip사람만 출력
		System.out.println("vip 정렬");
		Stream<Customer> stream1 = list.stream();
		stream1.filter(cus -> cus.getGrade().equals("vip")).forEach(item -> System.out.println(item));
		
		
		// 3. 포인트가 높은 사람순으로 정렬해서 출력
		System.out.println("포인트순 정렬");
		Stream<Customer> stream2 = list.stream();
		stream2.sorted((o1,o2) -> o1.getPoint() - o2.getPoint()).forEach(item -> System.out.println(item));

	}

}
