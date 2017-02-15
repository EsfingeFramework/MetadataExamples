package net.sf.esfinge.metadata.examples.validate.field.test;

import net.sf.esfinge.metadata.validate.field.test.OneAnnotationWithFieldVisibilityRequired;
import net.sf.esfinge.metadata.validate.field.test.Person;

public class PersonWithErrorFieldVisibilityRequired extends Person{
	
	@OneAnnotationWithFieldVisibilityRequired
	protected String oneProtectedString;	

	@OneAnnotationWithFieldVisibilityRequired
	transient String oneDefaultString;
	
	public PersonWithErrorFieldVisibilityRequired(String name, String cpf, int age) {
		super(name, cpf, age);
	}
	
}
