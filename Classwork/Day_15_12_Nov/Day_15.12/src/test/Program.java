package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Program {

	public static void readRecord( String pathname,String search ) throws Exception{
		
		try(BufferedReader reader = new BufferedReader(new FileReader(new File(pathname))))
		{
			String line = null;
			int count = 0;
			while((line = reader.readLine())!= null) {
			++count; 
				if(line.contains(search)) {
					System.out.println(count + " " + line.trim());
				}
			}
			
		}
	
	}
	public static void main(String[] args) throws Exception {
		
		String pathName = "/home/sunbeam/dac/Core Java/java_module_classwork/Classwork/Day_15_12_Nov/Day_15.11/src/test/Program.java"; 
		String searchString = "public"; 
		
		Program.readRecord(pathName,searchString);
	}
}
