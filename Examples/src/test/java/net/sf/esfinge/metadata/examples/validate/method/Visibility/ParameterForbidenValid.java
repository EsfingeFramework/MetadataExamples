package net.sf.esfinge.metadata.examples.validate.method.Visibility;

import net.sf.esfinge.metadata.examples.validate.method.test.OneAnnotationWithMethodVisibilityForbidden;
import net.sf.esfinge.metadata.examples.validate.method.test.OneAnnotationWithValidNumberOfParameters;

public class ParameterForbidenValid {
	
	@OneAnnotationWithValidNumberOfParameters
	public strictfp double someCalc(double a, double b){
		return Math.pow(( a * b ) * 4.2, 5);		
	}

}
