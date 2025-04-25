package day2Prac.오후실습.정연수_오후실습;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class 요리제작 {

	public static void main(String[] args) {
		
		Supplier<String> cook = () -> {
			System.out.println("고기를 전부 무자비 하게 굽는다");
			System.out.println("고기를 좋아보이는 양념을 준비한다");
			return "고기 구이";
		};
		
		String dish = cook.get();
		System.out.println("요리완성 : " + dish);
		
		Predicate<String> check = (str) -> {
			if (str.equals("고기 구이")) {
				System.out.println("맞다");
				return true;
			} else {
				System.out.println("틀리다");
				return false;
			}
		};
		
		boolean resultBoolean = check.test(dish);
		boolean resultBoolean2 = check.test("샐러드");
		
		if (resultBoolean) {
			System.out.println("요리 성공");
		} else {
			System.out.println("요리 실패");
		}

	}

}
