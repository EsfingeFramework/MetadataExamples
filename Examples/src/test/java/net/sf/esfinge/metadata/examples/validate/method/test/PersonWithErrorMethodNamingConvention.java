package net.sf.esfinge.metadata.examples.validate.method.test;

import java.util.HashSet;
import java.util.Set;

import net.sf.esfinge.metadata.validate.method.test.OneAnnotationWithMethodNamingConvention;
import net.sf.esfinge.metadata.validate.method.test.Person;

public class PersonWithErrorMethodNamingConvention extends Person{
	
	float oneDefaultfloat = 4.2f;	
	
	Set<Object> oneSet = new HashSet();		
	
	public PersonWithErrorMethodNamingConvention(String name, String cpf, int age) {
		super(name, cpf, age);
	}

	@OneAnnotationWithMethodNamingConvention
	public strictfp void setOneDefaultfloat(float oneDefaultfloat) {
		this.oneDefaultfloat = oneDefaultfloat;
	}

	@OneAnnotationWithMethodNamingConvention
	public void setOneSet(Set<Object> oneSet) {
		this.oneSet = oneSet;
	}
	
	@OneAnnotationWithMethodNamingConvention
	public String otherMethodStrIntError(int a, String b){
		return a + b + "42";	
	}
	
}
