package net.sf.esfinge.metadata.examples.metadataLocator.SearchOnAbstractions;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.util.List;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationFinder;

public class SearchOnAbstractionsTest {

	@Test
	public void test() {
		List<Annotation> annotationList = AnnotationFinder.findAnnotation(ValidClass.class, AnnotedInterface.class);
		assertTrue(annotationList.size()>0);
		assertTrue(annotationList.get(0) instanceof AnnotedInterface);


	}

}
