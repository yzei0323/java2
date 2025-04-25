package day2Prac.오후실습.정연수_오후실습;

import java.util.function.Consumer;

public class 장보기3만원 {

	public static void main(String[] args) {
		
		Consumer<Integer> c = (money) -> {
			int leftMoney = money;
			System.out.println(money + "원으로 장보기 시작") ;

			System.out.println("15000원으로 소고기 구매");
			leftMoney -= 15000;
			
			System.out.println("10000원으로 돼지고기 구매");
			leftMoney -= 10000;
			
			System.out.println("5000원으로 소스 구매");
			leftMoney -= 5000;
			
			System.out.println("잔돈은 " + leftMoney + "원 입니다.");
			System.out.println("장보기 끝");
			
			
		};
		c.accept(30000);

	}

}
