package day2Prac.오후실습;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 임형택_실습 {

	public static void main(String[] args) {
		
		
		//1. Runnable - 버킷리스트 출력하기
		ArrayList<String> bucketlist = new ArrayList<>();
		
		bucketlist.add("스카이 다이빙 하기");
		bucketlist.add("에베레스트 등정");
		bucketlist.add("우주 탐험");
		bucketlist.add("강남 건물주 되기");
		
		Runnable bucketPrint = ()->{
			System.out.println("임형택의 버킷리스트는");
			for(String blist : bucketlist) {
				System.out.println(blist);
			}
			
		};
		
		bucketPrint.run();
		
		//2. Consumer - 3만원으로 장보기
		
		Consumer<Integer> shopping = money -> {
	            System.out.println("========= 장보기 시작 =========");
	            System.out.println("예산: " + money + "원");

	            if (money >= 30000) {
	            	
	                System.out.println(" 한우 1++ 등심 1팩 (15,000원)");
	                System.out.println(" 유기농 채소 세트 (7,000원)");
	                System.out.println(" 고급 올리브유 (5,000원)");
	                System.out.println(" 수제 디저트 케이크 (3,000원)");
	                
	                int change = money - 30000;
	                System.out.println("잔액: " + change + "원");
	            } else {
	                System.out.println("잔액이 부족합니다.");
	            }
	            System.out.println("==============================");
	        };
	        
	        shopping.accept(32000);    
	        
	        
	    //3. Supplier - 요리만들기
	        
	    Supplier<String> cook = () -> {
	         System.out.println("====== 오늘의 레시피 ======");
	         System.out.println("요리: 크림 파스타 ");
	         System.out.println("1. 올리브유에 마늘을 볶는다.");
	         System.out.println("2. 베이컨을 넣고 익힌다.");
	         System.out.println("3. 생크림과 우유를 넣고 끓인다.");
	         System.out.println("4. 삶은 파스타 면을 넣고 섞는다.");
	         System.out.println("5. 파마산 치즈와 파슬리를 뿌린다.");
	         System.out.println("==========================");
	         return "크림 파스타";
	     };
	     
	     String MyFood = cook.get();
	     System.out.println(MyFood);
	     
	     
	     //4. Predicate - 내가 만든 요리이면 true, false 반환하기
	     
	     Predicate<String> p = (foodname) -> {
	    	 
	    	 if(foodname.equals(MyFood)) {
	    		 return true;
	    	 }else {
	    		 return false;
	    	 }
	     };
	     
	     boolean foodBoolean = p.test("크림 파스타");
	     if(foodBoolean) {
				System.out.println("요리가 맞아요");
			}else {
				System.out.println("내가 만든 요리가 아니에요");
			}
	     
	     
	     
	     
	     
	}

}
