package net.sf.esfinge.metadata.examples.validate.method.Parameters;

import net.sf.esfinge.metadata.examples.validate.method.test.OneAnnotationWithMethodVisibilityForbidden;

public class VisibilityForbidenValid {
	
	
	@OneAnnotationWithMethodVisibilityForbidden
	public strictfp double someCalc(double a, double b){
		return Math.pow(( a * b ) * 4.2, 5);		
	}

}
