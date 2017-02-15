package net.sf.esfinge.metadata.examples.validate.field.test;

import net.sf.esfinge.metadata.validate.field.test.OneAnnotationWithFinalFieldOnly;
import net.sf.esfinge.metadata.validate.field.test.Person;

public class PersonWithErrorFinalFieldOnly extends Person{

	@OneAnnotationWithFinalFieldOnly
	float oneDefaultfloat = 4.2f;	

	@OneAnnotationWithFinalFieldOnly
	public volatile long oneVolatileLong = 2372983;
	
	public PersonWithErrorFinalFieldOnly(String name, String cpf, int age) {
		super(name, cpf, age);
	}
	
}
