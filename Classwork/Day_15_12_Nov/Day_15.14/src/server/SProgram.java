package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SProgram {
	public static final int port = 5467;
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null; 
		DataOutputStream outputStream = null;
		DataInputStream inputStream = null;
	Scanner sc = null;	
try {
	serverSocket = new ServerSocket(port);
	System.out.println("Server is ready...");
    Socket socket  = serverSocket.accept();
    
    inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream())); 
    
    sc = new Scanner(System.in); 
    
    String message = ""; 
   
    do {
    	System.out.println("S : Server : ");
    	message = sc.nextLine();
    	outputStream.writeUTF(message);
    	outputStream.flush();
    	
    	message = inputStream.readUTF(); 
    	System.out.println("S : Client : " + message);
    	
    	
		
	} while (!message.equalsIgnoreCase("end"));
    	
		} catch (Exception e) {
			// TODO: handle exception
		}
        finally {
	
        	try {
				sc.close();
				inputStream.close();
				outputStream.close();
				serverSocket.close();
				
        		
			} catch (Exception e2) {
				// TODO: handle exception
			}
        	
}
		

	}

}
