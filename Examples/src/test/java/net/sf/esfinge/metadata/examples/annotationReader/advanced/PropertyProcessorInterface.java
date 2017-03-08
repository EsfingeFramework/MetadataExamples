package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.InitProcessor;

public interface PropertyProcessorInterface {
	
	@InitProcessor
	public void Execute(Annotation ann, AnnotatedElement ael);
}
