package net.sf.esfinge.metadata.CustonReaderAnnoted;

import static org.junit.Assert.*;

import org.junit.Test;

import TestCustonReaderAnnoted.Container;
import TestCustonReaderAnnoted.ExecuteProcessors;
import net.sf.esfinge.metadata.AnnotationReader;
import net.sf.esfinge.metadata.CustonReaderAnnoted.data.ClassWithMetadata;

public class ProcessorWithContainerTest {


	@Test
	public void validAnnotation() throws Exception {
		AnnotationReader ar = new AnnotationReader();
		
		Container ct = new Container();
		
		ct = ar.readingAnnotationsTo(ClassWithMetadata.class, Container.class);
		
		ExecuteProcessors processor  =(ExecuteProcessors) ct.getInterf().get(0);
		
		assertTrue(processor.isExistAnnotation());
		
		
		
	}

}
