package net.sf.esfinge.metadata.examples.metadataLocator.SearchOnEnclosingElements;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.util.List;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationFinder;

public class SearchOnEnclosingElementsTest {

	@Test
	public void testWithAnnotation() throws NoSuchFieldException, SecurityException {
		List<Annotation> annotationList = AnnotationFinder.findAnnotation(ClassWithAnnotation.class.getDeclaredField("selectedElement"), AnnotationInClass.class);
		assertTrue(annotationList.size()>0);
		assertTrue(annotationList.get(0) instanceof AnnotationInClass);
	}
	
}
