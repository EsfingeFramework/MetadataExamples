package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationReader;

public class AnnotationReaderTest {

	@Test
	public void testAnnotationsBasic() throws Exception {
		ContainerClass container;
		AnnotationReader annotationReader = new AnnotationReader();
		
		container = annotationReader.readingAnnotationsTo(ClassForReader.class, ContainerClass.class);
		
		System.out.println(container.toString());
		
		assertEquals(ClassForReader.class, container.getReference());
		
		
		
	}

}
