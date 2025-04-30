package day5Prac.애너테이션실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MaxCalorie {
	//int value() default 280;
	int value();
}
