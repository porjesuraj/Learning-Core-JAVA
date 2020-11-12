package test;

import java.io.File;

public class Program {

	public static void main(String[] args) {
		String pathName ="myFolder";
		
		File file = new File(pathName);
		
		System.out.println(file.getAbsolutePath());
		
		
		if(file.isDirectory())
		{
			boolean status = file.delete();
			
			System.out.println(status ? "folder deleted": "folder not deleted");
		}
	
	}
	
	public static void main3(String[] args) {
		String pathName ="myFolder";
		
		File file = new File(pathName);
		
		boolean status = file.mkdir();
		
		System.out.println(status ? "folder created": "folder not created");
	}
	
	
	
	public static void main2(String[] args) {
		
		try {
			
			String pathName = "file.txt"; 
			
			File file = new File(pathName);
			
			boolean status = file.delete();
			
		System.out.println(status ? "file deleted" : "file not deleted");	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	
	public static void main1(String[] args) {
		
		try {
			
			String pathName = "file.txt";
			
			File file = new File(pathName);
			
		boolean status	= file.createNewFile();
			
		System.out.println(status ? "file is created" : "file not created");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
