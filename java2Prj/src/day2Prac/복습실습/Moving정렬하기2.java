package day2Prac.복습실습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Moving정렬하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Moving> list = new ArrayList<>();
		
		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", "문산", 90));
		list.add(new Moving("전영석", "봉평" , 88));
		
		
		//Collections.sort(list, new Comparator<Moving>() {});
	/*	Collections.sort(list, new Comparator<Moving>() {

			@Override
			public int compare(Moving o1, Moving o2) {
				
			//	return o1.power - o2.power;  //오름차순
				return o2.power - o1.power;	 //내림차순
				
			}});
	*/
		
		for(Moving m : list) {
			System.out.println(m);
		}
		
		
		
		// 람다식(익명함수) => 익명클래스 익명객체가 만들어짐
		
		Collections.sort(list, (m1, m2) -> m1.power - m2.power );
		
		System.out.println("========= 정렬 후 =========");
		for(Moving m : list) {
			System.out.println(m);
		}
		
	}
}

