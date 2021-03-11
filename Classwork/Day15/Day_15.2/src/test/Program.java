package test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
	
	
	
	
	
//home/sunbeam/dac/Core Java/java_module_classwork/Classwork/Day_15_12_Nov/Day_15.1/src/test/Program.java
	public static void main(String[] args) {
		
		//String pathname = "/home/sunbeam/dac";
		String pathname = "/home/sunbeam/dac/Core Java/java_module_classwork/Classwork/Day_15_12_Nov/Day_15.1.0/src/test/Program.java";
		File file = new File(pathname);
		
		if(file.exists())
		{
			if(file.isDirectory())
			Program.DirectoryInfo(file);	
			else
			Program.FileInfo(file); 
		}else
		System.out.println(pathname + "does not exist");
		
	}

private static void FileInfo(File file) {
	
	if(file.exists())
	{
		System.out.println("Name " + file.getName());
		System.out.println(" parent" + file.getParent());
		System.out.println("length " + file.length());
		System.out.println(" " + new SimpleDateFormat("dd/mm/yyyy").format(new Date(file.lastModified())) );
		
	}
	
}

private static void DirectoryInfo(File file) {
	
	File[] files = file.listFiles(); 
	
	for(File f : files)
	{
		if(!f.isHidden())
		System.out.println(f.getName());
		
	}
}
}











