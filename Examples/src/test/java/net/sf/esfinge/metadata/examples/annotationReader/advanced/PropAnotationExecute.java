package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@PropertyProcessorsAnnotation(PropExecute.class)
public @interface PropAnotationExecute {

}
