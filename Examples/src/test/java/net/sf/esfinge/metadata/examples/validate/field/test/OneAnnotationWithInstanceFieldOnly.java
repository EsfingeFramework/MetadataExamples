package net.sf.esfinge.metadata.examples.validate.field.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import net.sf.esfinge.metadata.annotation.finder.SearchInsideAnnotations;
import net.sf.esfinge.metadata.annotation.finder.SearchOnEnclosingElements;
import net.sf.esfinge.metadata.annotation.validator.field.InstanceFieldOnly;

@SearchInsideAnnotations
@SearchOnEnclosingElements
@InstanceFieldOnly
@Retention(RetentionPolicy.RUNTIME)
public @interface OneAnnotationWithInstanceFieldOnly {
}
