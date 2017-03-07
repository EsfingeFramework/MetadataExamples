package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.reflect.AnnotatedElement;

public class PropExecute implements PropertyProcessorInterface {

	AnnotatedElement element;
	public void Execute(AnnotatedElement element) {
		// TODO Auto-generated method stub
		System.out.println(element);
		this.element = element;
	}
	
	
	public AnnotatedElement getElement() {
		return element;
	}
	public void setElement(AnnotatedElement element) {
		this.element = element;
	}
	
	

}
