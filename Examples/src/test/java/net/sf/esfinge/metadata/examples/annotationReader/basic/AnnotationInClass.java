package net.sf.esfinge.metadata.examples.annotationReader.basic;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationInClass {
	String elementInAnnotation();
}
