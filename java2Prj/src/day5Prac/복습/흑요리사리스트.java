package day5Prac.복습;

import java.util.ArrayList;
import java.util.List;

public class 흑요리사리스트 implements 요리사리스트 {

	@Override
	public List<String> getChefList() {
		
		List<String> list = new ArrayList<>();
		
		list.add("흑요리사A");
		list.add("흑요리사B");
		list.add("흑요리사C");
		
		return list;
	}

}
