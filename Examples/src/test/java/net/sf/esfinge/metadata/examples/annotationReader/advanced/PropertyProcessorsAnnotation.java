package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface PropertyProcessorsAnnotation {
	Class<? extends PropertyProcessorInterface> value();
}
