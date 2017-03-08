package net.sf.esfinge.metadata.examples.validate.method.Visibility;

import net.sf.esfinge.metadata.examples.validate.method.test.OneAnnotationWithMethodVisibilityForbidden;
import net.sf.esfinge.metadata.validate.method.test.OneAnnotationWithValidNumberOfParameters;

public class ParameterForbidenInvalid {
	
	
	@OneAnnotationWithValidNumberOfParameters
	private strictfp double someCalc(double a){
		return Math.pow(( a ) * 4.2, 5);		
	}


}
