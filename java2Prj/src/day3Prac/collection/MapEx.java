package day3Prac.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
	
		//key, value => 한 세트로 저장하는 자료구조
		
		Map<String, String> map = new HashMap<>();
		map.put("naver", "1234");
		map.put("google", "0000");
		map.put("acorn", "5678");
		
		String value = map.get("google");
		System.out.println(value);
		
		
		//전체 데이터 순회
		Set<String> keys = map.keySet();
		keys.forEach( item -> System.out.println(item));
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
	
		
		//값만 출력
		for(String str: map.values() ) {
			System.out.println(str);
		}
		
		
		//키, 값을 한 세트로 가져오기
		for(Map.Entry entry : map.entrySet()) {
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());	
		}
		
		
		//forEach
		//BiConsumer -> 매개변수가 두개 (그냥 Consumer는 매개변수가 하나)
		map.forEach( (k, v)->{System.out.println(k+","+v);} );
			 
		
			
	}
}
