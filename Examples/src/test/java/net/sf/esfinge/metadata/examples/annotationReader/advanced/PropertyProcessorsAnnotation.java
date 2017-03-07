package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PropertyProcessorsAnnotation {
	Class<? extends PropertyProcessorInterface> value();
}
