package net.sf.esfinge.metadata.examples.validate.field.visibility;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.examples.validate.field.modifiers.StaticFieldInvalid;
import net.sf.esfinge.metadata.examples.validate.field.modifiers.StaticFieldValid;
import net.sf.esfinge.metadata.validate.MetadataValidator;

public class VisibilityTest {

	@Test
	public void testValidVisibility() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(VisibilityRequeridValid.class);

	}

	@Test//(expected=AnnotationValidationException.class)
	public void testInvalidVisibility() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(VisibilityRequeridInvalid.class);

	}

}
