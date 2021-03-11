package client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
	public static int port = 4576;

	public static void main(String[] args) {
		DatagramSocket socket = null;
		Scanner sc = null;
		try {
			socket = new DatagramSocket(); // Client Socket
			sc = new Scanner(System.in);
			String message = "";
			byte[] buffer = null;

			while (true) {
				System.out.print("C:Client	:	");
				message = sc.nextLine();
				buffer = message.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length,
						InetAddress.getByName("localhost"), port);
				socket.send(sendPacket);

				buffer = new byte[1024];
				DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
				socket.receive(receivePacket);
				message = new String(receivePacket.getData());
				System.out.println("S:Client	:	" + message);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
			socket.close();
		}
	}
}
