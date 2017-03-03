package net.sf.esfinge.metadata.examples.annotationReader.advanced;

@AnnotationInClass
public class ClassForReader {
	
	
	private String fieldWinouthAnnotation;
	
	@AnnotationInElement
	private String fieldWithAnnotation;
	
	@AnnotationInElement
	public void methodWithAnnotation(){
		
	}
	
	public void methodWinouthAnnotation(){
		
	}	
	
}
