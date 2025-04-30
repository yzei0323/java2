package day5Prac.실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MaxSugar {

	//int value() default 30;
	int value();

}
