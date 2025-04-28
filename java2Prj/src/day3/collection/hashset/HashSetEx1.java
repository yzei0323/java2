package day3.collection.hashset;
import java.util.*;

class HashSetEx1 {
	public static void main(String[] args) {
		//set은 중복된 값은 저장되지 않는다. 
		
		Object[] objArr = {"1",  "2","2","3","3","4","4","4"};
		Set set = new HashSet();

		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
		}
        // HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);	
	}
}
