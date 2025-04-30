package day5.annotation.sample2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention( RetentionPolicy.RUNTIME)
public @interface MaxLen {
	  int length();
}
