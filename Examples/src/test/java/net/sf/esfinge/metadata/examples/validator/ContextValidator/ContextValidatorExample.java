package net.sf.esfinge.metadata.examples.validator.ContextValidator;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.validate.MetadataValidator;

public class ContextValidatorExample {

	@Test
	public void validTestCase() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(PointsToUserValid.class);
	}
	
	@Test(expected=AnnotationValidationException.class)
	public void probhitsTestCase() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(AchevimentsPointsWithProhibtsExeption.class);
	}
	
	@Test(expected=AnnotationValidationException.class)
	public void needToHaveTestCase() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(AchevimentsPointsWithNeedToHaveExeption.class);
	}
}
