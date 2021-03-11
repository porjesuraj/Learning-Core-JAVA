package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in); 
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Write Record");
		System.out.println("2.Read Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
	
		int choice; 
		String pathname = "File.dat"; 
		while((choice = Program.menuList()) != 0)
		{
			switch (choice) {
			case 1:
				
				Program.writeRecord(pathname); 
				break;
            case 2:
				
            	Program.readRecord(pathname); 
				break;
			default:
				break;
			}
		}
		
		
	}
	private static void readRecord(String pathname) {
		
		
		try(DataInputStream inputStream = new DataInputStream(new BufferedInputStream (new FileInputStream(new File(pathname)))); ) {
	
	  String name = inputStream.readUTF();
	  int num = inputStream.readInt();
	  float salary = inputStream.readFloat(); 
	  
	  System.out.println(name + " : " +  num  + " : "+ salary);
			
		} catch (Exception e) {
		}
		
	}
	private static void writeRecord(String pathname) {
		
try(DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathname)))); ) {
	
	outputStream.writeUTF("suraj");
	outputStream.writeInt(33);
	outputStream.writeFloat(3000);
	
		} catch (Exception e) {	
	}	
}


}











