package net.sf.esfinge.metadata.examples.annotationReader.processors;

import net.sf.esfinge.metadata.examples.annotationReader.basic.AnnotationInClass;
import net.sf.esfinge.metadata.examples.annotationReader.processors.Property.AnnotationClassTest;
import net.sf.esfinge.metadata.examples.annotationReader.processors.Property.AnnotationProcess;

@AnnotationClassTest
public class ClassToTest {

	private int prop;

	
	@AnnotationProcess
	public int getProp() {
		this.prop = 120;
		return prop;
	}
	
}
