package net.sf.esfinge.metadata.examples.annotationReader.basic;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationReader;

public class AnnotationReaderTest {

	@Test
	public void testAnnotationsBasic() throws Exception {
		ContainerClass container;
		AnnotationReader annotationReader = new AnnotationReader();
		
		container = annotationReader.readingAnnotationsTo(ClassForReader.class, ContainerClass.class);
		
		assertTrue(container.isExistAnnotation());
		
		assertEquals(ClassForReader.class.getName(), container.getElementName());
		
		assertEquals(ClassForReader.class, container.getReference());
		
		assertEquals("valueOfAnnotation", container.getElementInAnnotation());
		
		
	}

}
