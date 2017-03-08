package net.sf.esfinge.metadata.examples.annotationReader.processors.Property;

import java.util.List;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ElementProperty;
import net.sf.esfinge.metadata.annotation.container.PropertyProcessors;
import net.sf.esfinge.metadata.container.ContainerTarget;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.ProcessAnnotation;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.PropertyProcessorInterface;

@ContainerFor(ContainerTarget.ALL)
public class PropertyContainer {

	@ElementName
	private String propertyName;
	
	@PropertyProcessors(ProcessAnnotation.class)
	private List<PropertyProcessorInterface> listProperty;

	public List<PropertyProcessorInterface> getListProperty() {
		return listProperty;
	}

	public void setListProperty(List<PropertyProcessorInterface> listProperty) {
		this.listProperty = listProperty;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	@Override
	public String toString() {
		return "PropertyContainer [propertyName=" + propertyName + ", listProperty=" + listProperty + "]";
	}
		
	
}
