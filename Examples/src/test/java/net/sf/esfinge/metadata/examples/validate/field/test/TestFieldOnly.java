package net.sf.esfinge.metadata.examples.validate.field.test;

import org.junit.Test;

import net.sf.esfinge.metadata.AnnotationValidationException;
import net.sf.esfinge.metadata.validate.MetadataValidator;
import net.sf.esfinge.metadata.validate.field.test.Person;
import net.sf.esfinge.metadata.validate.field.test.PersonWithErrorFieldVisibilityForbidden;
import net.sf.esfinge.metadata.validate.field.test.PersonWithErrorFieldVisibilityRequired;
import net.sf.esfinge.metadata.validate.field.test.PersonWithErrorFinalFieldOnly;
import net.sf.esfinge.metadata.validate.field.test.PersonWithErrorInstanceFieldOnly;
import net.sf.esfinge.metadata.validate.field.test.PersonWithErrorStaticFieldOnly;
import net.sf.esfinge.metadata.validate.field.test.PersonWithErrorTransientFieldOnly;
import net.sf.esfinge.metadata.validate.field.test.PersonWithErrorValidFieldTypes;
import net.sf.esfinge.metadata.validate.field.test.PersonWithErrorVolatileFieldOnly;

public class TestFieldOnly {	
	
}
