package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Inet4Address;
import java.net.InetAddress;

public class Program {

	public static void main(String[] args) throws Exception {
		
	try {
	   InetAddress localhost = Inet4Address.getLocalHost();
	   String hostname = localhost.getHostName();
	   String hostAddress = localhost.getHostAddress(); 
	   
	   System.out.println(hostname);
	   System.out.println(hostAddress);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
