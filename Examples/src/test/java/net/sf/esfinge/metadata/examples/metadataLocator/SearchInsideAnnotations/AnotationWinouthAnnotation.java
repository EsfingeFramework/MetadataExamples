package net.sf.esfinge.metadata.examples.metadataLocator.SearchInsideAnnotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import net.sf.esfinge.metadata.annotation.finder.SearchInsideAnnotations;

@Retention(RetentionPolicy.RUNTIME)
public @interface AnotationWinouthAnnotation {
}
