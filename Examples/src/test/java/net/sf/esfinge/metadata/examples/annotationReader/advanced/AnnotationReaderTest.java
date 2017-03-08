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
		
		PropertyContainer propertycontainer = container.getPropety().get(0);
		
		
		assertEquals(ClassForReader.class, container.getReference());
		
		ExecuteProcessors proc=  (ExecuteProcessors) container.getExecuteProcessor().get(0);
		
		assertTrue(proc.getContainer() instanceof ContainerClass);
		assertEquals(AnnotationInClass.class, proc.getAnnotation().annotationType());
		assertEquals(ClassForReader.class,proc.getAnnotedElement());
		
		MethodContainer methodWithAnnotation = container.getAnnotedMethod("setFieldWithAnnotation");
		assertEquals("setFieldWithAnnotation", methodWithAnnotation.getElementName());
		
		
		
		FieldContainer fieldWithAnnotation = container.getAnnotedField("fieldWithAnnotation");
		assertEquals("fieldWithAnnotation", fieldWithAnnotation.getElementName());

	}

}
