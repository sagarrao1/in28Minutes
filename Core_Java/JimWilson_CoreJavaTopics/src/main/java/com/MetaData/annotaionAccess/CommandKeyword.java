package com.MetaData.annotaionAccess;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

// if we need to specify multiple we us array notation like below
//@Target({ElementType.TYPE, ElementType.METHOD})
public @interface CommandKeyword {
	String name();
}
