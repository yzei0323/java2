package day5Prac.애너테이션실습;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Food검증하기2 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		//Food food = new Food("비빔밥", 530);
		 
		List<Food> foodList = new ArrayList<>();
		
		foodList.add(new Food("비빔밥", 530));
		foodList.add(new Food("샐러드", 270));
		foodList.add(new Food("어묵", 180));
		foodList.add(new Food("돈까스", 480));
		foodList.add(new Food("우동", 180));
	/*	
		검증하기(foodList.get(0));
		검증하기(foodList.get(1));
		검증하기(foodList.get(2));
		검증하기(foodList.get(3));
		검증하기(foodList.get(4));
	*/
		
		for(Food food : foodList) {
			검증하기(food);
		}
		
	}
	
	private static void 검증하기(Food food) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Class clazz = food.getClass();
		
		//뽑아온당 뭘 뽑아와 정보를? 
		Field field = clazz.getDeclaredField("calorie");
	
		
		// 필드의 값 가져오기
		// 애너테이션 정보 가져오기
		int realValue = (int)field.get(food);	//530
		MaxCalorie anno = field.getAnnotation(MaxCalorie.class);  //타입을 줄때는 클래스로.. 줍니다?
		int annoValue = anno.value();
		
		
		//칼로리 검증
		if(realValue > annoValue) {
			System.out.println("다이어트 음식 아님, 실패!!");
		}else {
			System.out.println("다이어트 음식 ^^, 성공!!");
		}
	
	}

}
