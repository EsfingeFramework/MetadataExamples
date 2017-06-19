package net.sf.esfinge.metadata.examples.annotationReader.processors.Property;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import net.sf.esfinge.metadata.annotation.container.AnnotationPropertyLocation;
import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.CustomReader;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ElementProperty;
import net.sf.esfinge.metadata.annotation.container.ProcessorPerField;
import net.sf.esfinge.metadata.annotation.container.ProcessorPerMethod;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.container.ContainerTarget;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.ProcessAnnotation;
import net.sf.esfinge.metadata.examples.annotationReader.advanced.PropertyProcessorInterface;

@ContainerFor(ContainerTarget.TYPE)
public class Container {
	
	@ElementName
	private String name;
	
	@ElementProperty(property=AnnotationPropertyLocation.GETTER_ONLY)
	private List<PropertyContainer> containerProp;

	@CustomReader(configAnnotation=ProcessAnnotation.class,type = ProcessorType.READER_IS_PROCESSOR)
	private List<PropertyProcessorInterface> classElement;
	
	@ProcessorPerMethod(configAnnotation=ProcessAnnotation.class,type = ProcessorType.READER_RETURNS_PROCESSOR)
	private Map<Method,AnnotatedElement> elementReturnList;
	
	@ProcessorPerMethod(configAnnotation=ProcessAnnotation.class,type = ProcessorType.READER_IS_PROCESSOR)
	private Map<Method, PropertyProcessorInterface> elementObjectList;

	
	@ProcessorPerField(configAnnotation=ProcessAnnotation.class,type = ProcessorType.READER_RETURNS_PROCESSOR)
	private Map<Field,AnnotatedElement> fieldReturn;
	
	@ProcessorPerField(configAnnotation=ProcessAnnotation.class,type = ProcessorType.READER_IS_PROCESSOR)
	private Map<Field,PropertyProcessorInterface> fieldAddProcessor;

	
	@Override
	public String toString() {
		return "Container [name=" + name + ", containerProp=" + containerProp + ", ClassElement=" + classElement
				+ ", elementReturnList=" + elementReturnList + ", elementObjectList=" + elementObjectList
				+ ", fieldReturn=" + fieldReturn + ", fieldAddProcessor=" + fieldAddProcessor + "]";
	}


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


	public Map<Method, AnnotatedElement> getElementReturnList() {
		return elementReturnList;
	}


	public void setElementReturnList(Map<Method, AnnotatedElement> elementReturnList) {
		this.elementReturnList = elementReturnList;
	}


	public Map<Method, PropertyProcessorInterface> getElementObjectList() {
		return elementObjectList;
	}


	public void setElementObjectList(Map<Method, PropertyProcessorInterface> elementObjectList) {
		this.elementObjectList = elementObjectList;
	}


	public Map<Field, AnnotatedElement> getFieldReturn() {
		return fieldReturn;
	}


	public void setFieldReturn(Map<Field, AnnotatedElement> fieldReturn) {
		this.fieldReturn = fieldReturn;
	}


	public Map<Field, PropertyProcessorInterface> getFieldAddProcessor() {
		return fieldAddProcessor;
	}


	public void setFieldAddProcessor(Map<Field, PropertyProcessorInterface> fieldAddProcessor) {
		this.fieldAddProcessor = fieldAddProcessor;
	}


	public List<PropertyProcessorInterface> getClassElement() {
		return classElement;
	}


	public void setClassElement(List<PropertyProcessorInterface> classElement) {
		this.classElement = classElement;
	}

	
	

}