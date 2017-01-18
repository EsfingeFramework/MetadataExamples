package net.sf.esfinge.metadata.examples.metadataLocator.SearchInsideAnnotations;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.util.List;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationFinder;

public class MetadataLocatorTest {

	@Test
	public void metadataLocatorTestWithAnnotation() {
		List<Annotation> annotationList = AnnotationFinder.findAnnotation(ElementWithMetadata.class, AnotationInAnotation.class);
		System.out.println("");
		assertTrue(annotationList.size()>0);
		assertTrue(annotationList.get(0) instanceof AnotationInAnotation);
	}

	@Test
	public void metadataLocatorTestWithoutAnnotation() {
		List<Annotation> annotationList = AnnotationFinder.findAnnotation(ElementWithoutMetadata.class, AnotationInAnotation.class);
		assertTrue(annotationList.isEmpty());
	}


}
