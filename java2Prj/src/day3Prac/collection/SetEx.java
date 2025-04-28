package day3Prac.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
	
		//순서가 중요하지 않음(순서 상관없음)
		
		
		Set<String> list = new HashSet<>();
		
		list.add("딸기");
		list.add("딸기");
		list.add("망고");
		list.add("오렌지");
		
	
		//
		System.out.println("===== 출력 =====");
		for(String item : list) {
			System.out.println(item);
		}
		
		
		//
		System.out.println("===== 출력 =====");
		Iterator <String> it = list.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		

	}

}
