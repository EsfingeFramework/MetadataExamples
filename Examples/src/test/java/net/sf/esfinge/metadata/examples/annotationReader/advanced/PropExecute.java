package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class PropExecute implements PropertyProcessorInterface {

	AnnotatedElement element;
	public AnnotatedElement Execute(Annotation ann, AnnotatedElement ael) {
		this.element = element;
		return ael;
	}
	
	
	public AnnotatedElement getElement() {
		return element;
	}
	public void setElement(AnnotatedElement element) {
		this.element = element;
	}
	
	

}
