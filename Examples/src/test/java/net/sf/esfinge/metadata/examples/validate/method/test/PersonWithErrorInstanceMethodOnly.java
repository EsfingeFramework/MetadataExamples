package net.sf.esfinge.metadata.examples.validate.method.test;

import net.sf.esfinge.metadata.validate.method.test.OneAnnotationWithInstanceMethodOnly;
import net.sf.esfinge.metadata.validate.method.test.Person;

public class PersonWithErrorInstanceMethodOnly extends Person{
	
	private static String oneStaticString = "";	
	
	public PersonWithErrorInstanceMethodOnly(String name, String cpf, int age) {
		super(name, cpf, age);
	}

	@OneAnnotationWithInstanceMethodOnly
	public static String getOneStaticString() {
		return oneStaticString;
	}

	@OneAnnotationWithInstanceMethodOnly
	public static void setOneStaticString(String oneStaticString) {
		PersonWithErrorInstanceMethodOnly.oneStaticString = oneStaticString;
	}

}
