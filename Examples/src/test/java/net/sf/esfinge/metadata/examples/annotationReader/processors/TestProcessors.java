package net.sf.esfinge.metadata.examples.annotationReader.processors;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

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
		
		assertEquals("getProp", m1.getName());
		assertTrue(c.getAnn() instanceof AnnotationProcess);
		System.out.println();
	}

}
