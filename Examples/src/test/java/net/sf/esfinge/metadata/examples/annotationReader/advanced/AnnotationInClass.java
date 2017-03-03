package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import net.sf.esfinge.metadata.properties.annotation.Exec;

@Retention(RUNTIME)
@ProcessAnnotation(ExecuteProcessors.class)
public @interface AnnotationInClass {

}
