package net.sf.esfinge.metadata.examples.validate.field.test;

import net.sf.esfinge.metadata.validate.field.test.OneAnnotationWithInstanceFieldOnly;
import net.sf.esfinge.metadata.validate.field.test.Person;

public class PersonWithErrorInstanceFieldOnly extends Person{

	@OneAnnotationWithInstanceFieldOnly
	private static String oneStaticString = "";
	
	@OneAnnotationWithInstanceFieldOnly
	public static String otherStaticString = "";
	
	public PersonWithErrorInstanceFieldOnly(String name, String cpf, int age) {
		super(name, cpf, age);
	}
	
}
