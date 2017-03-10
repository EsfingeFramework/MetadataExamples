package net.sf.esfinge.metadata.examples.validator.ContextValidator;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import net.sf.esfinge.metadata.annotation.finder.SearchInsideAnnotations;
import net.sf.esfinge.metadata.annotation.finder.SearchOnEnclosingElements;
import net.sf.esfinge.metadata.annotation.validator.MaxValue;
import net.sf.esfinge.metadata.annotation.validator.MinValue;
import net.sf.esfinge.metadata.annotation.validator.NeedsToHave;
import net.sf.esfinge.metadata.annotation.validator.NotNull;
import net.sf.esfinge.metadata.annotation.validator.Prohibits;

@SearchOnEnclosingElements
@SearchInsideAnnotations
@Target({ElementType.METHOD, ElementType.TYPE,ElementType.ANNOTATION_TYPE})

@Retention(RetentionPolicy.RUNTIME)
@NeedsToHave(MaxValue.class)
@Prohibits(MinValue.class)
public @interface PointsToUserValid {
	@MaxValue(value=10)
	int quantity();
	@NotNull
	String name();
}