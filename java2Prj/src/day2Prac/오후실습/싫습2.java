package day2Prac.오후실습;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 싫습2 {

	public static void main(String[] args) {
		
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("맛있는 요리 만들기");
			}
		};
		
		r.run();
		
		//1. function 으로 요리 레시피 불러오기
		Function <String,String[]> f = (Food) -> {
			String[] Foodarr = {"갈비탕","떡볶","치킨"};
			
			return Foodarr;
		};
		String[] str = f.apply("");
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]+ " ");
		}
		
		
		
		
		// 2. Cousumer 인터페이스로 요리 금액 나타내기
		
		Consumer<Integer> c = (money) -> {
			for(int i=0; i<str.length; i++) {
				System.out.println(str[i]+"요리의 금액은 : "+ money + "입니다.");
			}
		};
		
		c.accept(30000);
		
		Supplier<String> s =new Supplier(){

			@Override
			public Object get() {
				return "갈비탕\n"
						+ "1. 갈비의 핏물을 빼고 5분정도 삶아준 뒤에 찬물에 행궈준다.\n"
						+ "2. 양파,무,마늘,대파를 넣고 2시간 정도 뚜껑을 덮고 끓여준다.\n"
						+ "3. 채반에 갈비를 덜어주고 무를 넣는다.\n"
						+ "4. 마지막으로 뜬기름을 뺴고 맛있게 먹는다.\n";
			}};
			
			String resultFood = s.get();
			System.out.println(resultFood);
			
			
			Predicate<String> p = (str2) -> {
				if(str2.equals(resultFood)) {
					return true;
				}else {
					return false;
				}
			};
			boolean rtn = p.test(resultFood);
			System.out.println(rtn);
			
			
			
		}
	}

