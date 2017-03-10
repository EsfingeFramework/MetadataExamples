package net.sf.esfinge.metadata.examples.metadataLocator.SearchOnAbstractions;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import net.sf.esfinge.metadata.annotation.finder.SearchOnAbstractions;

@Retention(RUNTIME)
@SearchOnAbstractions
public @interface AnnotedInterface {

}
