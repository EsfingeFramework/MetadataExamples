package net.sf.esfinge.metadata.examples.annotationReader.processors.Property;

import java.util.List;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ElementProperty;
import net.sf.esfinge.metadata.annotation.container.PropertyProcessors;
import net.sf.esfinge.metadata.container.ContainerTarget;

@ContainerFor(ContainerTarget.TYPE)
public class Container {
	
	@ElementName
	private String name;
	
	@ElementProperty
	private List<PropertyContainer> containerProp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PropertyContainer> getContainerProp() {
		return containerProp;
	}

	public void setContainerProp(List<PropertyContainer> containerProp) {
		this.containerProp = containerProp;
	}
	
	
}