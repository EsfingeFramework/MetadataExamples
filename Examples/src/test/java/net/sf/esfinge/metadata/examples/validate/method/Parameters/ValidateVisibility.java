package net.sf.esfinge.metadata.examples.validate.method.Parameters;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.examples.validate.method.modifers.FinalMethodOnlyInvalid;
import net.sf.esfinge.metadata.validate.MetadataValidator;

public class ValidateVisibility {

	@Test
	public void testVisibilityValid() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(VisibilityForbidenValid.class);
	}
	
	@Test(expected=AnnotationValidationException.class)
	public void testVisibilityInvalid() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(VisibilityForbidenInvalid.class);
	}


}
