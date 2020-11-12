package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static String host = "localhost"; 
	public static final int port = 5467;
	public static void main(String[] args) {
		
		Socket socket = null; 
		DataOutputStream outputStream = null;
		DataInputStream inputStream = null;
	Scanner sc = null;	
try {
	socket = new Socket(host, port); 
    
    inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream())); 
    
    sc = new Scanner(System.in); 
    
    String message = ""; 
   
    do {
    	message = inputStream.readUTF();
    	
    	
    	System.out.println("S:Server	:	" + message);

		System.out.print("C:Client	:	");
    	
		message = sc.nextLine();
		
		outputStream.writeUTF(message);
		outputStream.flush();
		
    	
		
	} while (!message.equalsIgnoreCase("end"));
    	
		} catch (Exception e) {
			// TODO: handle exception
		}
        finally {
	
        	try {
				sc.close();
				inputStream.close();
				outputStream.close();
				socket.close();
				
        		
			} catch (Exception e2) {
				// TODO: handle exception
			}
        	
}
		

	}

}
