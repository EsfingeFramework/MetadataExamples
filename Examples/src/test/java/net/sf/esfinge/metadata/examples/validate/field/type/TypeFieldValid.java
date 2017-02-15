package net.sf.esfinge.metadata.examples.validate.field.type;

import net.sf.esfinge.metadata.examples.validate.field.test.OneAnnotationWithStaticFieldOnly;
import net.sf.esfinge.metadata.examples.validate.field.test.OneAnnotationWithValidFieldTypes;

public class TypeFieldValid {

	@OneAnnotationWithValidFieldTypes
	private String name;
	
}
