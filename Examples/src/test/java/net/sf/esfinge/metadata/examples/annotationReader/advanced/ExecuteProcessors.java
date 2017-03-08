package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class ExecuteProcessors implements ProcessorInterface {

	private Annotation annotation;
	private AnnotatedElement annotedElement; 
	private ContainerClass container ;
	public void processorToInit(Annotation ann, AnnotatedElement ael, ContainerClass cont) {
		annotation = ann;
		annotedElement = ael;
		container = cont;
		
	}
	public Annotation getAnnotation() {
		return annotation;
	}
	public void setAnnotation(Annotation annotation) {
		this.annotation = annotation;
	}
	public AnnotatedElement getAnnotedElement() {
		return annotedElement;
	}
	public void setAnnotedElement(AnnotatedElement annotedElement) {
		this.annotedElement = annotedElement;
	}
	public ContainerClass getContainer() {
		return container;
	}
	public void setContainer(ContainerClass container) {
		this.container = container;
	}

	
}
