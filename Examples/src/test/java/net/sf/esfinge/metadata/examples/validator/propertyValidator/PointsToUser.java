package net.sf.esfinge.metadata.examples.validator.propertyValidator;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import net.sf.esfinge.metadata.annotation.validator.MaxValue;
import net.sf.esfinge.metadata.annotation.validator.MinValue;
import net.sf.esfinge.metadata.annotation.validator.NotNull;
import net.sf.esfinge.metadata.annotation.validator.SearchInsideAnnotations;
import net.sf.esfinge.metadata.annotation.validator.SearchOnEnclosingElements;

@SearchOnEnclosingElements
@SearchInsideAnnotations
@Target({ElementType.METHOD, ElementType.TYPE,ElementType.ANNOTATION_TYPE})

@Retention(RetentionPolicy.RUNTIME)
public @interface PointsToUser {
	@MinValue(value=2)
	@MaxValue(value=10)
	int quantity();
	@NotNull
	String name();
}