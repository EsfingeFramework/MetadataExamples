package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ContainsAnnotation;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.container.ContainerTarget;


@ContainerFor(ContainerTarget.METHODS)
public class MethodContainer {
	
	@ElementName
	private String elementName;
	
	@ContainsAnnotation(AnnotationInElement.class)
	private boolean existAnnotation;

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

	@Override
	public String toString() {
		return "MethodContainer [elementName=" + elementName + ", existAnnotation=" + existAnnotation + "]";
	}

	
	
}
