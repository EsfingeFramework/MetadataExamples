package net.sf.esfinge.metadata.examples.validate.method.Return;

import net.sf.esfinge.metadata.examples.validate.method.test.OneAnnotationWithMethodVisibilityForbidden;
import net.sf.esfinge.metadata.examples.validate.method.test.OneAnnotationWithValidMethodReturn;
import net.sf.esfinge.metadata.examples.validate.method.test.OneAnnotationWithValidNumberOfParameters;

public class ReturnValid {
	
	
	@OneAnnotationWithValidMethodReturn
	public strictfp int someCalc(int a, int b){
		return a+b;		
	}

}
