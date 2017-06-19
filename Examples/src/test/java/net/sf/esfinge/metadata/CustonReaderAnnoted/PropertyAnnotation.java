package net.sf.esfinge.metadata.CustonReaderAnnoted;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import TestCustonReaderAnnoted.PropertyProcessorInterface;


@Retention(RUNTIME)
public @interface PropertyAnnotation {
	 
	Class<? extends PropertyProcessorInterface> value();
}
