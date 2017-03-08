package net.sf.esfinge.metadata.examples.annotationReader.processors;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationReader;
import net.sf.esfinge.metadata.examples.annotationReader.processors.Property.Container;;

public class TestProcessors {

	@Test
	public void test() throws Exception {
		AnnotationReader ar = new AnnotationReader();
		
		Container ct = new Container();
		ct = ar.readingAnnotationsTo(ClassToTest.class, Container.class);
		System.out.println(ct.getContainerProp().get(0).getListProperty().get(0));
		
	}

}
