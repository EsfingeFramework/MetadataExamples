package net.sf.esfinge.metadata.examples.validate.method.NamingConvection;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.examples.validate.method.modifers.FinalMethodOnlyInvalid;
import net.sf.esfinge.metadata.validate.MetadataValidator;

public class NamingConvectionTest {

	@Test
	public void NamingConvectionValid() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(NamingConvectionTrue.class);
	}
	
	@Test(expected=AnnotationValidationException.class)
	public void NamingConvectionInvalid() throws AnnotationValidationException {
		MetadataValidator.validateMetadataOn(NamingConvectionFalse.class);
	}

}
