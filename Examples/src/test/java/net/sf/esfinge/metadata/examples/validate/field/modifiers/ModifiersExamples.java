package net.sf.esfinge.metadata.examples.validate.field.modifiers;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.examples.validator.propertyValidator.InvalidAchevimentsPoints;
import net.sf.esfinge.metadata.validate.MetadataValidator;

public class ModifiersExamples {

	@Test
	public void testValidModyfers() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(StaticFieldValid.class);

	}

	@Test(expected=AnnotationValidationException.class)
	public void testInvalidModyfers() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(StaticFieldInvalid.class);

	}
}
