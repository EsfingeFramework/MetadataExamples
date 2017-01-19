package net.sf.esfinge.metadata.examples.metadataLocator.SearchOnEnclosingElements;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import net.sf.esfinge.metadata.annotation.validator.SearchOnEnclosingElements;

@Retention(RetentionPolicy.RUNTIME)
@SearchOnEnclosingElements
public @interface AnnotationInClass {

}
