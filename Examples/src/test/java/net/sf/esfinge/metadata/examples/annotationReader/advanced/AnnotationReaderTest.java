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
		
		ExecuteProcessors proc=  (ExecuteProcessors) container.getExecuteProcessor().get(0);
		
		assertTrue(proc.getContainer() instanceof ContainerClass);
		assertEquals(AnnotationInClass.class, proc.getAnnotation().annotationType());
		assertEquals(ClassForReader.class,proc.getAnnotedElement());
		
		MethodContainer methodWithAnnotation = container.getAnnotedMethod("setFieldWithAnnotation");
		assertEquals("setFieldWithAnnotation", methodWithAnnotation.getElementName());
		assertTrue(methodWithAnnotation.isExistAnnotation());
		
		MethodContainer methodWinouthAnnotation = container.getAnnotedMethod("getFieldWithAnnotation");
		assertEquals("getFieldWithAnnotation", methodWinouthAnnotation.getElementName());
		assertFalse(methodWinouthAnnotation.isExistAnnotation());
		
		
		FieldContainer fieldWithAnnotation = container.getAnnotedField("fieldWithAnnotation");
		assertEquals("fieldWithAnnotation", fieldWithAnnotation.getElementName());
		assertTrue(fieldWithAnnotation.isExistAnnotation());

	}

}
