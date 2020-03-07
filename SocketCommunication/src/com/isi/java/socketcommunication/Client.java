package com.isi.java.socketcommunication;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client
{
	public static void main(String[] args)
	{
		try (
				Socket socket = new Socket("192.168.45.159", 7777);
				ObjectOutputStream out =
						new ObjectOutputStream(socket.getOutputStream());
			)
		{
			String string = "Hello";
			System.out.println("Client sending:  " + string);
			System.out.println("--------");
			
			out.writeUTF("Hello");
		}
		catch (IOException e) { e.printStackTrace(); }
	}
}
