package net.sf.esfinge.metadata.examples.validate.method.test;

import java.util.HashSet;
import java.util.Set;


public class PersonWithErrorMethodVisibilityForbidden extends Person{

	public volatile long oneVolatileLong = 2372983;	
	
	Set<Object> oneSet = new HashSet();	
	
	
	public PersonWithErrorMethodVisibilityForbidden(String name, String cpf, int age) {
		super(name, cpf, age);
	}

	@OneAnnotationWithMethodVisibilityForbidden
	private strictfp void setOneVolatileLong(long oneVolatileLong) {
		this.oneVolatileLong = oneVolatileLong;
	}

	@OneAnnotationWithMethodVisibilityForbidden
	private Set<Object> getOneSet() {
		return oneSet;
	}
	
}
