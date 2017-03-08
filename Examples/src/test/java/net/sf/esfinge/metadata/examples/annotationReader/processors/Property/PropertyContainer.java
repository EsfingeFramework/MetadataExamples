package net.sf.esfinge.metadata.examples.annotationReader.processors.Property;

import java.util.List;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.PropertyProcessors;
import net.sf.esfinge.metadata.container.ContainerTarget;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.ProcessAnnotation;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.ProcessorInterface;

@ContainerFor(ContainerTarget.ALL)
public class PropertyContainer {

	@PropertyProcessors(ProcessAnnotation.class)
	private List<?> listProperty;

	public List<?> getListProperty() {
		return listProperty;
	}

	public void setListProperty(List<?> listProperty) {
		this.listProperty = listProperty;
	}
		
}
