package net.sf.esfinge.metadata.examples.annotationReader.basic;

import net.sf.esfinge.metadata.annotation.container.AnnotationProperty;
import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ContainsAnnotation;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ReflectionReference;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.TYPE)
public class ContainerClass {
	
	@ElementName
	private String elementName;
	
	@ContainsAnnotation(AnnotationInClass.class)
	private boolean existAnnotation;
	
	@ReflectionReference
	private Class<?>  reference;

	@AnnotationProperty(annotation = AnnotationInClass.class, property ="elementInAnnotation")
	private String elementInAnnotation;

		
	
	public String getElementInAnnotation() {
		return elementInAnnotation;
	}

	public void setElementInAnnotation(String elementInAnnotation) {
		this.elementInAnnotation = elementInAnnotation;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public boolean isExistAnnotation() {
		return existAnnotation;
	}

	public void setExistAnnotation(boolean existAnnotation) {
		this.existAnnotation = existAnnotation;
	}

	public Class<?> getReference() {
		return reference;
	}

	public void setReference(Class<?> reference) {
		this.reference = reference;
	}
	
	
}
