package pl.edu.pw.mini.zpoif.task5.solution;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
public @interface LengthValidator {

    int minLength() default 5;
    int maxLength() default 10;

}
