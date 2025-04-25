package day2Prac.오후실습;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 김보성_오후실습 {

	public static void main(String[] args) {
	
		
		// 1
		ArrayList<String> list = new ArrayList<>();
		list.add("건강");
		list.add("건물주");
		list.add("하루식비로 1억쓰기");
		
		Runnable r = () -> {
			
			for (String item : list) {
				System.out.println(item);
			}};

		r.run();	
		
		
		// 2.
		int[] Wallet = {30000};
		Consumer<Integer> c = (price) -> {
			if(Wallet[0] >= price) {
				Wallet[0] -= price;
				System.out.println( "사용 금액 : "+price+ "/ 잔여금액 :" + Wallet[0]);
				}else {
				System.out.println("보유하신 금액 "+Wallet[0]+"보다 가격이 ("+ price+") 더 많아 구매할 수 없습니다.");
				}
			};
		
		c.accept(1000);
		c.accept(3000);
		c.accept(26000);
		c.accept(500);
		
		
		// 3.
		System.out.println("");	
		Supplier<String> s = () -> {
				
			System.out.println("기호에 따라 돼지 앞다리살 or 뒷다리살을 구매한다.");
			System.out.println("앞다리살을 구매한 경우 돼지의 껍데기 부분에 칼날을 닿게하여 잔여 불순물들을 긁어내준다.");
			System.out.println("새끼 손가락 정도의 두께와 길이로 먹기 좋게 썰어준다.");
			System.out.println("달궈진 팬에 기름을 적당량 둘러 후추, 맛술을 넣어 고기를 볶아준다.");
			System.out.println("고기 800g 기준 양념 : ");
			System.out.println("고추장 1큰술, 설탕 1큰술, 올리고당 1큰술, 간장 1.5큰술, 고춧가루 1.5큰술, 다진마늘 1큰술");
			System.out.println("양념에 물을 조금 넣어 고기가 볶아지는 동안 잘 풀어둔다.");
			System.out.println("고기의 겉면이 노릇하게 익으면 양념장을 넣어 볶아준다.");
			System.out.println("기호에 따라 야채를 넣어 중불로 3분가량 양념과 같이 볶는다.");
			System.err.println("이 시점에 햇반을 돌린다.");
			System.out.println("이후 파와 함께 강불로 2분가량 볶아준다.");
			System.out.println("");
			System.out.println("완성~");
			System.err.println("맛있게 드세요~");
			
			return "제육볶음";
		};
		
		s.get();
		
		
		// 4.
		System.out.println("");
		Predicate<String> p = (str) -> {
			if(str.equals("제육볶음")) {
				return true;
			}else {
				return false;
			}};
			
		boolean presult = p.test("제육볶음");
		boolean presult2 = p.test("떡볶이");
		
		System.out.println(presult);
		System.out.println(presult2);
			
			

		
		
		
			
	}

}
