package net.sf.esfinge.metadata.examples.annotationReader.processors;

import net.sf.esfinge.metadata.examples.annotationReader.processors.Property.AnnotationProcess;


public class ClassToTest {

	private int prop;

	
	@AnnotationProcess
	public int getProp() {
		return prop;
	}

	public void setProp(int prop) {
		this.prop = prop;
	}
	
}
