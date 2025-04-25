package day2Prac.오후실습;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 이수민_오후실습 {

	public static void main(String[] args) {

		Runnable r = () -> {
			System.out.println("나의 버킷리스트: 일기 꾸준히 쓰기 @,<");
		};

		r.run();

		Consumer<Integer> c = (money) -> {
			String str = "";
			loop: while (money > 0) {
				System.out.println("구매할 재료를 선택하세요");
				System.out.println("1.된장 2.감자 3.양파 4.호박 5.버섯 6.고추장 7.종료");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				switch (num) {
				case 1:
					if (money >= 5000) {
						money -= 5000;
						str += "된장 ";
					} else {
						System.out.println("돈이 부족합니다");
					}

					break;
				case 2:
					if (money >= 3000) {
						money -= 3000;
						str += "감자 ";
					} else {
						System.out.println("돈이 부족합니다");
					}
					break;
				case 3:
					if (money >= 2000) {
						money -= 2000;
						str += "양파 ";
					} else {
						System.out.println("돈이 부족합니다");
					}

					break;
				case 4:
					if (money >= 1000) {
						money -= 1000;
						str += "호박 ";
					} else {
						System.out.println("돈이 부족합니다");
					}

					break;
				case 5:
					if (money >= 1000) {
						money -= 1000;
						str += "버섯 ";
					} else {
						System.out.println("돈이 부족합니다");
					}
					break;
				case 6:
					if (money >= 6000) {
						money -= 6000;
						str += "고추장 ";
					} else {
						System.out.println("돈이 부족합니다");
					}

					break;
				case 7:
					break loop;
				default:
					System.out.println("번호를 다시 선택하세요");
					break;
				}
			}
			System.out.println("구매목록: " + str);
			System.out.println("남은 돈: " + money);
		};

		c.accept(30000);

		// 익명클래스
		Supplier<String> s = new Supplier() {

			@Override
			public Object get() {
				System.out.println("재료를 넣고 끓인다.");
				return "된장찌개";
			}
		};
		String dish = s.get();
		
		Predicate p = (dishes)->{
			if(dishes.equals(dish)) {
				return true;
			}else {
				return false;
			}
		};
		
		String dish1 = "된장찌개";
		String dish2 = "김치찌개";
		boolean r1 = p.test(dish1);
		boolean r2 = p.test(dish2);
		
		System.out.println(dish1+": "+r1);
		System.out.println(dish2+": "+r2);
		
		
		Function<Integer,Integer> f1 = (su)->{return su*su;};
		System.out.println(f1.apply(6)); 
		
		Function<Integer,Double> f2 = (su)->{
			return Math.random()*su+1;
		};
		
		System.out.println(f2.apply(6));
		
		
	}

}
