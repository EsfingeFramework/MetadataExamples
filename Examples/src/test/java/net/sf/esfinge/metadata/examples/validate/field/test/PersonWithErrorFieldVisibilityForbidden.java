package net.sf.esfinge.metadata.examples.validate.field.test;

import net.sf.esfinge.metadata.validate.field.test.OneAnnotationWithFieldVisibilityForbidden;
import net.sf.esfinge.metadata.validate.field.test.Person;

public class PersonWithErrorFieldVisibilityForbidden extends Person{
		
	@OneAnnotationWithFieldVisibilityForbidden	
	public volatile long oneVolatileLong = 2372983;	

	@OneAnnotationWithFieldVisibilityForbidden	
	public static String otherStaticString = "";	
	
	public PersonWithErrorFieldVisibilityForbidden(String name, String cpf, int age) {
		super(name, cpf, age);
	}
	
}