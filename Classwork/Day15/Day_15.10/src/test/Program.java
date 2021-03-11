package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
class Employee implements Serializable{
	private static final long serialVersionUID = 7504310288177453321L;
	private String name;
	private int empid;
	private transient float salary;
	public Employee(String name, int empid, float salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
}
public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void writeRecord( String pathname ) throws Exception{
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File(pathname))))
		//(FileWriter writer = new FileWriter(new File(pathname));)
		{
			for(char ch = 'A'; ch <= 'Z';++ch)
			writer.write(ch);
		}
	}
	public static void readRecord( String pathname ) throws Exception{
		try(BufferedReader reader = new BufferedReader(new FileReader(new File(pathname))))
		//(FileReader reader = new FileReader(new File(pathname)))
		{
			int data;
			
			while((data = reader.read())!= -1)
			{
				System.out.println( (char)data + " ");
			}
		} 
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Write Record");
		System.out.println("2.Read Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		String pathname = "File.txt";
		while( ( choice = Program.menuList( ) ) != 0 ) {
			try {
				switch( choice ) {
				case 1:
					Program.writeRecord(pathname);
					break;
				case 2:
					Program.readRecord(pathname);
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
