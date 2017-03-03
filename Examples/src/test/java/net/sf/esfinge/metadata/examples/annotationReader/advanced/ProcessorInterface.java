package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.InitProcessor;

public interface ProcessorInterface {

	@InitProcessor
	public void processorToInit(Annotation ann, AnnotatedElement ael, ContainerClass annotc);
}
