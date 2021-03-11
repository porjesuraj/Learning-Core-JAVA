
package server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class SProgram {
	public static int port = 4576;

	public static void main(String[] args) {
		DatagramSocket socket = null;
		Scanner sc = null;
		try {
			socket = new DatagramSocket(port); // Server Socket
			sc = new Scanner(System.in);
			String message = "";
			byte[] buffer = new byte[1024];

			while (true) {
				DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
				socket.receive(receivePacket);
				message = new String(receivePacket.getData());
				System.out.println("S:Client	:	" + message);

				System.out.print("S:Server	:	");
				message = sc.nextLine();
				buffer = message.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, receivePacket.getAddress(),
						receivePacket.getPort());
				socket.send(sendPacket);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
			socket.close();
		}
	}
}
