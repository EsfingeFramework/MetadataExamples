package net.sf.esfinge.metadata.examples.annotationReader.processors;

import net.sf.esfinge.metadata.examples.annotationReader.processors.Property.Annotation;


public class ClassToTest {

	private int prop;

	
	@Annotation
	public int getProp() {
		return prop;
	}

	public void setProp(int prop) {
		this.prop = prop;
	}
	
}
