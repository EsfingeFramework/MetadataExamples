package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;
import net.sf.esfinge.metadata.examples.metadataLocator.SearchInsideAnnotations.ElementWithMetadata;

public interface PropertyProcessorInterface {
	
	@ExecuteProcessor
	public AnnotatedElement Execute(Annotation ann, AnnotatedElement ael);
}
