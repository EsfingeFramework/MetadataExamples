package net.sf.esfinge.metadata.examples.validator.propertyValidator;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.validate.MetadataValidator;

public class PropertyValidatorExample {

	@Test
	public void validTestCase() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(ValidAchevimentsPoints.class);
	}
	
	@Test(expected=AnnotationValidationException.class)
	public void invalidTestCase() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(InvalidAchevimentsPoints.class);
	}

}
