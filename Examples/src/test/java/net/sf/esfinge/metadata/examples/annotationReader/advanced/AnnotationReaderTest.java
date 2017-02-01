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
		
		 
		
		assertEquals(ClassForReader.class, container.getReference());
		
		MethodContainer methodWithAnnotation = container.getAnnotedMethod("methodWithAnnotation");
		assertEquals("methodWithAnnotation", methodWithAnnotation.getElementName());
		assertTrue(methodWithAnnotation.isExistAnnotation());
		
		MethodContainer methodWinouthAnnotation = container.getAnnotedMethod("methodWinouthAnnotation");
		assertEquals("methodWinouthAnnotation", methodWinouthAnnotation.getElementName());
		assertFalse(methodWinouthAnnotation.isExistAnnotation());
		
		
		FieldContainer fieldWinouthAnnotation = container.getAnnotedField("fieldWinouthAnnotation");
		assertEquals("fieldWinouthAnnotation", fieldWinouthAnnotation.getElementName());
		assertFalse(methodWithAnnotation.isExistAnnotation());

		
		FieldContainer fieldWithAnnotation = container.getAnnotedField("fieldWithAnnotation");
		assertEquals("fieldWithAnnotation", fieldWithAnnotation.getElementName());
		assertFalse(methodWinouthAnnotation.isExistAnnotation());

	}

}
