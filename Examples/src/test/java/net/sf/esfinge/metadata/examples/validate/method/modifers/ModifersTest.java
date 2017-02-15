package net.sf.esfinge.metadata.examples.validate.method.modifers;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.examples.validate.field.visibility.VisibilityRequeridValid;
import net.sf.esfinge.metadata.validate.MetadataValidator;

public class ModifersTest {

	@Test
	public void modifersValid() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(FinalMethodOnlyValid.class);
	}
	
	@Test(expected=AnnotationValidationException.class)
	public void modifersInvalid() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(FinalMethodOnlyInvalid.class);
	}

}
