package day5Prac.애너테이션실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import day5.annotation.sample3.WeekDay;


@Retention( RetentionPolicy.RUNTIME)
public @interface WeekDayAvail {

	WeekDay[] value();
}
