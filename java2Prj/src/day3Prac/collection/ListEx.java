package day3Prac.collection;

import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		
		
		//List -> ArrayList, LinkedList
		
	//	List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("사과");
		list.add("포도");
		list.add("망고");
		
		
		for(String item : list) {
			System.out.println(item);
		}

	}

}
