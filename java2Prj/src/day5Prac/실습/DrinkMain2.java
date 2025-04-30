package day5Prac.실습;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class DrinkMain2 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	
		
		//Main2는 뭐하려고 만들었냐면
		//MaxSugar 안 넘는 리스트들 출력까지 할 수 있게 만든거임 ㅇㅋㅇㅋ
	
		List<Drink> drinkList = new ArrayList<>();
		
		//검증해서 리스트에 넣어가지고 출력하려고 만듦
		List<Drink> okList = new ArrayList<>();
		List<Drink> noList = new ArrayList<>();
		
		drinkList.add(new Drink("딸기라떼",60));
		drinkList.add(new Drink("아메리카노",0));
		drinkList.add(new Drink("밀크티라떼",25));
		drinkList.add(new Drink("말차라떼",36));
		drinkList.add(new Drink("유자차",50));
		drinkList.add(new Drink("망고스무디",49));
		drinkList.add(new Drink("착즙주스",23));
		drinkList.add(new Drink("카페라떼",6));
		drinkList.add(new Drink("바닐라라떼",25));
		drinkList.add(new Drink("아포가토",15));
		
		
		for(Drink drink : drinkList) {
			boolean result = 검증하기(drink);
			
			if(result) {
				okList.add(drink);
			}else {
				noList.add(drink);
			}
		}
		
		//목록 출력하기
		System.err.println("이거는 먹어도 됩니다 >,< 야호");
		okList.forEach( item -> System.out.println(item));
		
		System.err.println("다른 거 드시죠???");
		noList.forEach( item -> System.out.println(item));
		
	}

	private static boolean 검증하기(Drink drink) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		Class clazz = drink.getClass();
		
		Field field = clazz.getDeclaredField("sugar");
		
		//필드값 가져오기
		//애너테이션 정보 가져오기
		int realValue = (int)field.get(drink);
		MaxSugar anno = field.getAnnotation(MaxSugar.class);
		int annoValue = anno.value();
		
		//그니까 realValue는 뭐냐면 저기 위에 add한 값의 슈가고
		//annoValue는 애너테이션에 정헤놓은 슈가임 몬말알??
		//그래서 검증을 정해놓은슈가(anno)보다 입력한슈가(real)가 크거나 작으면 어쩌구 일케 검증? 비교하는거
		
		//검증
		if(realValue > annoValue) {
			System.out.println("["+drink.getName()+"] 당분과다!!!!!! 다른 거 먹으세요");
			return false;
		}else{
			System.out.println("["+drink.getName()+"]이 정도는 괜찮음 합격!!! 맘껏 먹어라");
			return true;
		}	
		
	}

}
