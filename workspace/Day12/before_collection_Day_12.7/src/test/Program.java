package test;


import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Repeatable(value = Authors.class)
@interface Author{
	String name(); // Annotation Type Element Declaration 
     String date();

}

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@interface Authors{
	
	Author[] value(); 
}

@Author(name="XYZ",date = "09/11/2020")
@Author(name="ABC",date = "09/11/2020") //@Author : Annotation Type, name : element type
class Book{
	
}


public class Program {
	public static void main(String[] args) {

	Class<Book>  c	=  Book.class; 
	
	     Annotation[]   annotation =  c.getDeclaredAnnotations();
		
	     for(Annotation ann : annotation)
	     {
	    	 if(ann instanceof Authors)
	    	 {
	    		 Authors authors = (Authors) ann; 
	    		 
	    		 for(Author author : authors.value())
	    		 System.out.println(author.name() + " " + author.date());
	    		 
	    	 }
	     }
		
	}
}
