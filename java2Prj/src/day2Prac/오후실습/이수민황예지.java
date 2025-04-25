package day2Prac.오후실습;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 이수민황예지 {

	public static void main(String[] args) {
	/*
	 * 토피넛라떼 가게 주문 시뮬레이터 
	 * 
	 * Consumer: 주문 출력
	 * 
	 * Function: 음료 가격 계산
	 * 
	 * Supplier: 오늘의 메뉴 제공
	 * 
	 * Predicate: 재고 확인
	 * 
	 * Runnable: 인삿말 or 주문 종료 메시지
	 * 
	 * 
	 */
	
		Scanner sc = new Scanner(System.in);
		
		Consumer<String> c = (order)->{
			System.out.print(order);
		};
		
		Function<Integer, Integer> f = cnt -> {
			return cnt * 4000;
		};
		
		Supplier<String> s = ()->{
			return "오늘의 추천 메뉴는 토피넛라떼입니다. 왜냐하면 여기는 토피넛라떼만 팔아요^^";
		}; 
		
		Predicate<Integer> p = (cnt)->{
			if(cnt>=3) {
				return false;
			}else {
				return true;
			}
		};
		
		Runnable hi = ()->{
			System.out.println("어서오세요. 토피넛월드입니다~^-^");
		};
		
		Runnable bye = ()->{
			System.out.println("감사합니다. 안녕히가세요~^-^");
		};
		
		
		//실행
		hi.run();
		System.out.println(s.get());
		System.out.println("몇 개 주문하시겠어요?");
		int cnt = sc.nextInt();
		System.out.println(cnt+"개 주문하셨군요!");
		if(p.test(cnt)) {
			c.accept("토피넛라테이");
			System.out.println(" 총 금액은 "+f.apply(cnt)+"원입니다."); 
		}else {
			System.out.println("2개까지만 주문 가능하세요🙏🏻");
		};
		bye.run(); 
		
		
		
		
	
		
	}

}
