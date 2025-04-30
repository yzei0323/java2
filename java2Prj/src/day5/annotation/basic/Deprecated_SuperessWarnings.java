package day5.annotation.basic;

  

import java.util.ArrayList;

public class Deprecated_SuperessWarnings {

    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("");
    }
    

    // SuppressWarnings : 컴파일러의 경고 무시
    // Raw type = List, Map 등에서 제네릭을 생략한 타입
    @SuppressWarnings({"unchecked", "rawtypes"})//
    public static void warnedMethod() {
        //  제네릭을 사용하지 않는 컬렉션
        // - unchecked 경고 발생
        // - 실행 시 에러가 발생하지는 않음
        // - 위의 어노테이션 활성화하고 다시 확인

        ArrayList list = new ArrayList();
        list.add("감자");
        list.add("고구마");
        list.add("호박");
        System.out.println(list);
    }

    public static void main(String[] args) {
        Deprecated_SuperessWarnings.deprecatedMethod();
        Deprecated_SuperessWarnings.warnedMethod();
    }
    
    
}
