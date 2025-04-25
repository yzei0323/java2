package day2Prac.복습실습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Moving정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Moving> list = new ArrayList<>();
		
		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", "문산", 90));
		list.add(new Moving("전영석", "봉평" , 88));
		
		
		//
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// 다운캐스팅 해줘야됨
				
				Moving m1 = (Moving)o1;
				Moving m2 = (Moving)o2;
				
				return m1.power - m2.power;
			}
			});

		
		//다운캐스팅 안해도됨
		Collections.sort(list, new Comparator<Moving>() { 

			@Override
			public int compare(Moving o1, Moving o2) {
				// TODO Auto-generated method stub
				return o1.power - o2.power;		//내림차순으로 하고 싶으면 요소비교를 반대로 하면 됨
			}});
		
		System.out.println("power 정렬");
		for(Moving m : list) {
			System.out.println(m);
		}
		
		
		//매서드 안에서도 클래스를 작성할 수 있다. 지역내부클래스
		class A implements Comparator<Moving>{

			@Override
			public int compare(Moving o1, Moving o2) {
				// TODO Auto-generated method stub
				return o1.power - o2.power;
			}
		}
		
		class B implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				
				//
				Moving m1 = (Moving) o1;
				Moving m2 = (Moving) o2;
				
				return m1.alias.compareTo(m2.alias);  //양수, 음수를 반환(기준이 뒤에 있으면 양수가 전달됨)
													  //기준이 크면??이라는 말이겟지??
			}
			
		}
		//A는 power 오름차순
		//B는 alias 오름차순
		
		System.out.println("B정렬 alias 오름차순");
		Collections.sort(list, new B()); //B든 A든 아무거나
		for(Moving m : list) {
			System.out.println(m);
		}
		
		System.out.println("A정렬 power 오름차순");
		Collections.sort(list, new A()); //둘중에 아무거나 쓰면 됩니다요
		for(Moving m : list) {
			System.out.println(m);
		}
		
		
		
		//
		
		//Collections.sort(list, new Comparator<Moving>() {});
		Collections.sort(list, new Comparator<Moving>() {

			@Override
			public int compare(Moving o1, Moving o2) {
				
				return o1.power - o2.power;
			}});
		}
	}

