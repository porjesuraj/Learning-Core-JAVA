package test;


import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Inherited
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@interface Author{
	String name(); // Annotation Type Element Declaration 
}

@Author(name="ABC") //@Author : Annotation Type, name : element type
class Book{
	
}


public class Program {
	public static void main(String[] args) {

	Class<Book>  c	=  Book.class; 
	
	     Annotation[]   annotation =  c.getDeclaredAnnotations();
		
	     for(Annotation ann : annotation)
	     {
	    	 if(ann instanceof Author)
	    	 {
	    		 Author author = (Author) ann; 
	    		 
	    		 System.out.println(author.name());
	    		 
	    	 }
	     }
		
	}
}
