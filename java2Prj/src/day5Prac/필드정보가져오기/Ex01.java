package day5Prac.필드정보가져오기;

import java.lang.reflect.Field;

public class Ex01 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		// Store 객체의 매서드 정보 출력하기
		// Store 객체의 필드정보 출력하기

		Store store = new Store(3,5);

		// 클래스 정보 얻어오기
		Class clazz = store.getClass();

		// 매서드 정보 출력하기
		// 필드정보 출력하기

		// 선언된 필드 이름 출력하기
		Field[] fields = clazz.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field.getName() + field.get(store));
		
			field.set(store, 10);
		}
		
		System.out.println(store);

	}

}
