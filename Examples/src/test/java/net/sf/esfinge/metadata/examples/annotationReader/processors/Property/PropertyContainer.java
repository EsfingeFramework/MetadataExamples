package net.sf.esfinge.metadata.examples.annotationReader.processors.Property;

import java.lang.reflect.AnnotatedElement;
import java.util.List;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ElementProperty;
import net.sf.esfinge.metadata.annotation.container.PropertyProcessors;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.container.ContainerTarget;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.ProcessAnnotation;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.PropertyProcessorInterface;

@ContainerFor(ContainerTarget.ALL)
@PropertyProcessors(value=ProcessAnnotation.class,type = ProcessorType.READER_IS_PROCESSOR)
public class PropertyContainer {

	@ElementName
	private String propertyName;
	
	@PropertyProcessors(value=ProcessAnnotation.class,type = ProcessorType.READER_ADDS_PROCESSOR)
	private List<PropertyProcessorInterface> listProperty;
	
	@PropertyProcessors(value=ProcessAnnotation.class,type = ProcessorType.READER_RETURNS_PROCESSOR)
	private List<AnnotatedElement> listPropertyReturn;

	public List<AnnotatedElement> getListPropertyReturn() {
		return listPropertyReturn;
	}

	public void setListPropertyReturn(List<AnnotatedElement> listPropertyReturn) {
		this.listPropertyReturn = listPropertyReturn;
	}

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
		return "PropertyContainer [propertyName=" + propertyName + ", listProperty=" + listProperty
				+ ", listPropertyReturn=" + listPropertyReturn + "]";
	}


	
	
}
