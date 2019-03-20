package com.ibm.Annotayion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//provide level of annotation
@Target(ElementType.METHOD)
//for provide scope of annotation
@Retention(RetentionPolicy.RUNTIME)
//for generating documentation from source code
@Documented
@Inherited
//@Repeatable()
public @interface Author {

	String name() default "";
}
