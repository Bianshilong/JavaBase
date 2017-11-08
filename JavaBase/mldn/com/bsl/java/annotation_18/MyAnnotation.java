package com.bsl.java.annotation_18;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	public String key() default "ddd";
	public String value();
	
}
