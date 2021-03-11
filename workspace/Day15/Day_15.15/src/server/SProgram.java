
package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import utils.CommunicationHandler;

public class SProgram {
	public static final int port = 5465;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("Server is ready....");
			
			while(true)
			{
				Socket socket = serverSocket.accept();
               Runnable target = new CommunicationHandler(socket);
			}
	
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
			
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
