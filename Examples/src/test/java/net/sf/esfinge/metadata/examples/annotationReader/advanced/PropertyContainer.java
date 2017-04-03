package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.annotation.container.PropertyProcessors;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.ALL)
public class PropertyContainer {
	
	@ElementName
	private String name;
	
	@PropertyProcessors(value=PropertyProcessorsAnnotation.class,type = ProcessorType.READER_ADDS_PROCESSOR)
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
