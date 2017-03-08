package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface ProcessAnnotation {
	Class<? extends PropertyProcessorInterface> value();
}
