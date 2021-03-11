package test;

import java.lang.annotation.Annotation;

import annotations.Column;
import annotations.Table;
import model.Employee;

public class Program {
	public static void main(String[] args) {

	Class<?>  c	=  Employee.class; 
	
	     Annotation[]   annotation =  c.getDeclaredAnnotations();
	     String tName = null;
	     String ename = null;
	     String enameData = null;
	     String eid = null;
	     String eidData = null;
	     String sal = null;
	     String salData = null;
	     for(Annotation ann : annotation)
	     {
	    	 if(ann instanceof Table)
	    	 {
	    		 Table t = (Table) ann; 
	    		 
	    		 tName = t.name();
	    		
	    	 } else if(ann instanceof Column)
	    	 {
	    		 
	    		 Column col = (Column) ann;
	    		 
	    		 if(col.name().matches("emp_name"))
	    		 {
	    			 
	    			 ename = col.name();
	    			 enameData = col.columnDefinition();
	    		 } else if(col.name() == "emp_id")
	    		 {
	    			 eid = col.name();
	    			 eidData = col.columnDefinition();
	    		 }else {
	    			 
	    			 sal = col.name();
	    			 salData = col.columnDefinition();
	    			 
	    			 
	    		 }
	    		 
	    		 
	    	 }
	    	 
	    	 
	     }
		
	     System.out.println("CREATE TABLE " + tName + "\n  ( ");
	     System.out.println(ename  + " " + enameData + " ,");
	     System.out.println(eid + " " + eidData + " PRIMARY KEY,");
	     System.out.println(sal + " " +  salData + " \n ) ;");
	     
	     
	}
}
