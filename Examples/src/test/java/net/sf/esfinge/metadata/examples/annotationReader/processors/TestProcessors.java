package net.sf.esfinge.metadata.examples.annotationReader.processors;

import static org.junit.Assert.*;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationReader;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.ExecuteProcessors;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.PropertyProcessorInterface;
import net.sf.esfinge.metadata.examples.annotationReader.processors.Property.AnnotationProcess;
import net.sf.esfinge.metadata.examples.annotationReader.processors.Property.Container;;

public class TestProcessors {

	@Test
	public void test() throws Exception {
		AnnotationReader ar = new AnnotationReader();
		
		Container ct = new Container();
		ct = ar.readingAnnotationsTo(ClassToTest.class, Container.class);
		
		ExecuteProcessors c = (ExecuteProcessors) ct.getContainerProp().get(0).getListProperty().get(0);
		Method m1 = (Method)c.getAel();
		
		
		
		//Object var = ct.getContainerProp().get(0).getListPropertyReturn().get(0);
		
		
		
		PropertyProcessorInterface interf = ct.getElementObjectList().get(ClassToTest.class.getMethod("getProp"));
		
		PropertyProcessorInterface processorInterface = ct.getClassElement().get(0);

		//assertEquals("getProp", m1.getName());
		assertTrue(c.getAnn() instanceof AnnotationProcess);
		assertTrue(c.getAnn() instanceof AnnotationProcess);
		//assertTrue(var instanceof AnnotatedElement);
		assertTrue(ct.getFieldAddProcessor().isEmpty());
		assertTrue(ct.getFieldReturn().isEmpty());
 		assertEquals(1,ct.getClassElement().size());
		assertTrue(ct.getClassElement().get(0) instanceof ExecuteProcessors);

		assertFalse(ct.getElementObjectList().isEmpty());
		assertFalse(ct.getElementReturnList().isEmpty());
	
		assertTrue(interf.getClass().equals(ExecuteProcessors.class));
		assertTrue(processorInterface instanceof ExecuteProcessors);
		

		
	}

}
