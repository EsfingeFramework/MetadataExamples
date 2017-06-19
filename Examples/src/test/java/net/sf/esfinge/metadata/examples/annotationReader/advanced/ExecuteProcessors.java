package net.sf.esfinge.metadata.examples.annotationReader.advanced;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class ExecuteProcessors implements PropertyProcessorInterface {

	private Annotation ann;
	private AnnotatedElement ael;

	
	public Annotation getAnn() {
		return ann;
	}


	public void setAnn(Annotation ann) {
		this.ann = ann;
	}


	public AnnotatedElement getAel() {
		return ael;
	}


	public void setAel(AnnotatedElement ael) {
		this.ael = ael;
	}

	@Override
	public AnnotatedElement execute(Annotation ann, AnnotatedElement ael ) {
		this.ann = ann;
		this.ael = ael;
		return ael;
	}

}

