package net.sf.esfinge.metadata.examples.annotationReader.processors.Property;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.sf.esfinge.metadata.annotation.validator.SearchInsideAnnotations;
import net.sf.esfinge.metadata.annotation.validator.SearchOnEnclosingElements;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.ExecuteProcessors;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.ProcessAnnotation;


@ProcessAnnotation(ExecuteProcessors.class)
@Retention(RetentionPolicy.RUNTIME)
@SearchOnEnclosingElements
@SearchInsideAnnotations

public @interface Annotation {

}
