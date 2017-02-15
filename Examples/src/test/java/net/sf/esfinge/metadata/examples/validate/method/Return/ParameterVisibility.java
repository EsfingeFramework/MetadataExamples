package net.sf.esfinge.metadata.examples.validate.method.Return;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.examples.validate.method.modifers.FinalMethodOnlyInvalid;
import net.sf.esfinge.metadata.validate.MetadataValidator;

public class ParameterVisibility {

	@Test
	public void testVisibilityValid() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(ReturnValid.class);
	}
	
	@Test(expected=AnnotationValidationException.class)
	public void testVisibilityInvalid() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(ReturnInvalid.class);
	}


}
