package net.sf.esfinge.metadata.examples.validate.method.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import net.sf.esfinge.metadata.annotation.validator.method.FinalMethodOnly;

@FinalMethodOnly
@Retention(RetentionPolicy.RUNTIME)
public @interface OneAnnotationWithFinalMethodOnly {
}
