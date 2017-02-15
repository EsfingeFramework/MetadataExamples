package net.sf.esfinge.metadata.examples.validate.field.type;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.examples.validate.field.modifiers.StaticFieldValid;
import net.sf.esfinge.metadata.validate.MetadataValidator;

public class TypeExamples {

	@Test
	public void validTypeExamples() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(TypeFieldValid.class);
	}

	@Test(expected=AnnotationValidationException.class)
	public void invalidTypeExamples() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(TypeFieldInvalid.class);
	}


}
