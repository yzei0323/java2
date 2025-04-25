package day2Prac.함수형인터페이스2;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 실습 {

	public static void main(String[] args) {
	
		//1.
		Runnable r = ()->{
			
			System.out.println("건물주 되기");
			
		};
		
		r.run();
		
		//익명
		
		//
		Consumer<Integer> c = (money)->{
			System.out.println(money+"원 먹는 데 다 썼음");
		};

		c.accept(210000000);
		
		//
		Supplier<String> s = ()->{
			System.out.println("요리의 레시피");
			
			return "마라떡볶이";
		};
		
		String resultFood = s.get();
		System.out.println(resultFood);
		
		//
		Predicate<String> p = (str)->{
			if(str.equals(resultFood)) {
				return true;
			}else {
				return false;
			}
		};
		
		//내가만든요리 이름 판단하기
		boolean resultBoolean = p.test("마라떡볶이");
		if(resultBoolean) {
			System.out.println("요리가 맞아요");
		}else {
			System.out.println("내가 만든 요리가 아니에요");
		}
	
	}

}
