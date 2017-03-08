package net.sf.esfinge.metadata.examples.annotationReader.processors.Property;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import net.sf.esfinge.metadata.examples.annotationReader.advanced.ExecuteProcessors;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.ProcessAnnotation;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@ProcessAnnotation(ExecuteProcessors.class)
public @interface Annotation {

}
