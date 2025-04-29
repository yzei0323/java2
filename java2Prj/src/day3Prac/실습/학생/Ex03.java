package day3Prac.실습.학생;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("test01", "홍길동", "vvip", 10000));
		list.add(new Customer("test02", "김길동", "vip", 1000));
		list.add(new Customer("test03", "이길동", "bronze", 100));
		list.add(new Customer("test04", "박길동", "vvip", 50000));
		list.add(new Customer("test05", "최길동", "vip", 5000));
		list.add(new Customer("test06", "정길동", "bronze", 500));
		list.add(new Customer("test07", "한길동", "vvip", 20000));
		list.add(new Customer("test08", "오길동", "vip", 2000));
		list.add(new Customer("test09", "노길동", "bronze", 200));
		list.add(new Customer("test10", "윤길동", "vvip", 40000));

		Stream<Customer> stream = list.stream();
		System.out.print("고객 등급이 vvip인 사람의 수 : ");
		System.out.println(stream.filter(t -> t.getGrade().equals("vvip")).count());
		
		stream = list.stream();
		System.out.print("고객 등급이 vip인 사람의 수 : ");
		System.out.println(stream.filter(t -> t.getGrade().equals("vip")).count());
		
		stream = list.stream();
		stream.sorted((o1, o2) -> o2.getPoint() - o1.getPoint()).forEach(t -> System.out.print(t.getName() + ", "));
	}
}
