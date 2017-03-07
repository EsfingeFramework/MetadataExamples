package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.util.List;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.PropertyProcessors;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.ALL)
public class PropertyContainer {
	
	@ElementName
	private String name;
	
	@PropertyProcessors(PropertyProcessorsAnnotation.class)
	private List<PropertyProcessorInterface> processor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PropertyProcessorInterface> getProcessor() {
		return processor;
	}

	public void setProcessor(List<PropertyProcessorInterface> processor) {
		this.processor = processor;
	}
	
	

}
