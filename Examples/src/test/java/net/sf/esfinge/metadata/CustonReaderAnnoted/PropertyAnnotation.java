package net.sf.esfinge.metadata.CustonReaderAnnoted;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;



@Retention(RUNTIME)
public @interface PropertyAnnotation {
	 
	Class<? extends PropertyProcessorInterface> value();
}
