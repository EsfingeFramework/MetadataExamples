package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class ExecuteProcessors implements ProcessorInterface {

	public void processorToInit(Annotation ann, AnnotatedElement ael, ContainerClass annotc) {
		System.out.println(ann);
		System.out.println(ael);
		System.out.println(annotc.getClass().getName());
		
	}

}
