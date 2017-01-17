package net.sf.esfinge.metadata.examples.metadataLocator.simple;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.util.List;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationFinder;

public class MetadataLocatorTest {

	@Test
	public void metadataLocatorTestWithAnnotation() {
		List<Annotation> annotationList = AnnotationFinder.findAnnotation(ElementWithMetadata.class, AnnotationInElement.class);
		assertTrue(annotationList.size()>0);
		assertTrue(annotationList.get(0) instanceof AnnotationInElement);
	}

	@Test
	public void metadataLocatorTestWithoutAnnotation() {
		List<Annotation> annotationList = AnnotationFinder.findAnnotation(ElementWithoutMetadata.class, AnnotationInElement.class);
		assertTrue(annotationList.isEmpty());
	}


}
