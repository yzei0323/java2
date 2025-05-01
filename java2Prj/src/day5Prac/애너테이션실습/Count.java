package day5Prac.애너테이션실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//사용자정의 애너테이션
//@Target
//유지범위 @Retention (RetentionPolicy.RUNTIME)
//기본  =>  RetentionPloicy.CLASS


@Retention( RetentionPolicy.RUNTIME)
public @interface Count {
	int value();   // value()  => 애너테이션의 설정된 값가져오기 ,이름은 임의 작성가능,  value라는 이름을 사용하면 생략가능함 
}
