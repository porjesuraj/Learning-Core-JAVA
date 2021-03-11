
package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SProgram {
	public static final int port = 5465;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		DataOutputStream outputStream = null;
		DataInputStream inputStream = null;
		Scanner sc = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("Server is ready....");
			Socket socket = serverSocket.accept();

			inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			sc = new Scanner(System.in);

			String message = "";
			do {
				System.out.print("S:Server	:	");
				message = sc.nextLine();
				outputStream.writeUTF(message); // Send message to client
				outputStream.flush();

				message = inputStream.readUTF();
				System.out.println("S:Client	:	" + message); // Read message of client
			} while (!message.equalsIgnoreCase("end"));

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				sc.close();
				inputStream.close();
				outputStream.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
