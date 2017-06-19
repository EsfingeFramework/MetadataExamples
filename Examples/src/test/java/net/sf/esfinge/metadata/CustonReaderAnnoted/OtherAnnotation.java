package net.sf.esfinge.metadata.CustonReaderAnnoted;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import TestCustonReaderAnnoted.ExecuteProcessors;
import TestCustonReaderAnnoted.PropertyAnnotation;

@Retention(RUNTIME)
@PropertyAnnotation(ExecuteProcessors.class)
public @interface OtherAnnotation {

}
