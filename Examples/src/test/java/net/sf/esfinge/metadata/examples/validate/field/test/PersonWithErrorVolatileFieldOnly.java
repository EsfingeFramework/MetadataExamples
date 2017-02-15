package net.sf.esfinge.metadata.examples.validate.field.test;

import net.sf.esfinge.metadata.validate.field.test.OneAnnotationWithVolatileFieldOnly;
import net.sf.esfinge.metadata.validate.field.test.Person;

public class PersonWithErrorVolatileFieldOnly extends Person{
	
	@OneAnnotationWithVolatileFieldOnly
	transient String oneDefaultString;

	@OneAnnotationWithVolatileFieldOnly
	private static String oneStaticString = "";	
	
	public PersonWithErrorVolatileFieldOnly(String name, String cpf, int age) {
		super(name, cpf, age);
	}
	
}
