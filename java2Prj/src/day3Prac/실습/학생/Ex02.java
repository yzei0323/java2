package day3Prac.실습.학생;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {
	static String className(Object o) {
		return o.getClass().getSimpleName();
	}

	public static void main(String[] args) {
		String[] slist = { "1", "2", "3", "4" };
		Stream<String> stream1 = Stream.of(slist);
		stream1.forEach(item -> System.out.println(className(item) + " " + item));

		ArrayList<String> aList = new ArrayList<>();
		aList.add("하나");
		aList.add("둘");
		aList.add("셋");
		Stream<String> stream2 = aList.stream();
		stream2.forEach(item -> System.out.println(className(item) + " " + item));

		int[] rList = new int[10];
		for (int i = 0; i < rList.length; i++) {
			rList[i] = (int) (Math.random() * 10);
		}
		IntStream stream3 = Arrays.stream(rList);
		stream3.forEach(item -> System.out.print(item + ", "));
		stream3 = Arrays.stream(rList);
		int total = stream3.filter(value -> value % 2 == 0).sum();
		System.out.println("총합" + total);
	}
}
