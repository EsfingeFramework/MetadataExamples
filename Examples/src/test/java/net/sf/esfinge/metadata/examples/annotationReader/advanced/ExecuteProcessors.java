package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class ExecuteProcessors implements PropertyProcessorInterface {

	Annotation ann;
	AnnotatedElement ael;

	public void Execute(Annotation ann, AnnotatedElement ael) {
		this.ann = ann;
		this.ael = ael;
	}

}
