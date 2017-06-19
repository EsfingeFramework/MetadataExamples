package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.List;

import net.sf.esfinge.metadata.annotation.container.AllFieldsWith;
import net.sf.esfinge.metadata.annotation.container.AllMethodsWith;
import net.sf.esfinge.metadata.annotation.container.AnnotationPropertyLocation;
import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.ElementName;
import net.sf.esfinge.metadata.annotation.container.ElementProperty;
import net.sf.esfinge.metadata.annotation.container.ProcessFields;
import net.sf.esfinge.metadata.annotation.container.ProcessMethods;
import net.sf.esfinge.metadata.annotation.container.ProcessorType;
import net.sf.esfinge.metadata.annotation.container.CustomReader;
import net.sf.esfinge.metadata.annotation.container.ReflectionReference;
import net.sf.esfinge.metadata.container.ContainerTarget;

//@Processors(ProcessAnnotation.class)
@ContainerFor(ContainerTarget.TYPE)
public class ContainerClass {
	
	@ElementName
	private String elementName;
		
	@ReflectionReference
	private Class<?>  reference;
	
	@ProcessMethods
	private List<MethodContainer> methodContainer; 
	
	@ProcessFields
	private List<FieldContainer> fieldContainer; 
	
	@AllMethodsWith(AnnotationInElement.class)
	private List<MethodContainer> methodWithAnnotation; 
	
	@AllFieldsWith(AnnotationInElement.class)
	private List<FieldContainer> fieldWithAnnotation;
	
	@CustomReader(configAnnotation=ProcessAnnotation.class,type=ProcessorType.READER_RETURNS_PROCESSOR)
	private List<AnnotatedElement> executeProcessorMethod;
	
	@CustomReader(configAnnotation=ProcessAnnotation.class,type=ProcessorType.READER_IS_PROCESSOR)
	private List<PropertyProcessorInterface> executeProcessor;

	@ElementProperty(property=AnnotationPropertyLocation.GETTER_ONLY)
	private List<PropertyContainer> propety;
	
	
	public List<AnnotatedElement> getExecuteProcessorMethod() {
		return executeProcessorMethod;
	}

	public void setExecuteProcessorMethod(List<AnnotatedElement> executeProcessorMethod) {
		this.executeProcessorMethod = executeProcessorMethod;
	}

	public List<PropertyProcessorInterface> getExecuteProcessor() {
		return executeProcessor;
	}

	public void setExecuteProcessor(List<PropertyProcessorInterface> executeProcessor) {
		this.executeProcessor = executeProcessor;
	}

	public List<PropertyContainer> getPropety() {
		return propety;
	}

	public void setPropety(List<PropertyContainer> propety) {
		this.propety = propety;
	}


	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public Class<?> getReference() {
		return reference;
	}

	public void setReference(Class<?> reference) {
		this.reference = reference;
	}

	public List<MethodContainer> getMethodContainer() {
		return methodContainer;
	}

	public void setMethodContainer(List<MethodContainer> methodContainer) {
		this.methodContainer = methodContainer;
	}

	public List<FieldContainer> getFieldContainer() {
		return fieldContainer;
	}

	public void setFieldContainer(List<FieldContainer> fieldContainer) {
		this.fieldContainer = fieldContainer;
	}

	public List<MethodContainer> getMethodWithAnnotation() {
		return methodWithAnnotation;
	}

	public void setMethodWithAnnotation(List<MethodContainer> methodWithAnnotation) {
		this.methodWithAnnotation = methodWithAnnotation;
	}

	public List<FieldContainer> getFieldWithAnnotation() {
		return fieldWithAnnotation;
	}

	public void setFieldWithAnnotation(List<FieldContainer> fieldWithAnnotation) {
		this.fieldWithAnnotation = fieldWithAnnotation;
	}
	
	public MethodContainer getAnnotedMethod(String name)
	{
		for(MethodContainer container : methodContainer)
		{
			if(container.getElementName().equals(name))
			{
				return container;
			}
		}
		return null;
	}
	
	public FieldContainer getAnnotedField(String name)
	{
		for(FieldContainer container : fieldContainer)
		{
			if(container.getElementName().equals(name))
			{
				return container;
			}
		}
		return null;
	}


	
	
	
}
