package com.isi.java.socketcommunication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server
{	
	public static void main(String[] args)
	{
		try (ServerSocket serverSocket = new ServerSocket(7777))
		{
			while (true)
			{
				try
				{
					Socket clientSocket = serverSocket.accept();
					Thread clientThread = new Thread(() -> clientHandler(clientSocket));
					clientThread.start();
				}
				catch (IOException e) { System.out.println(e.getMessage()); }
			}
		}
		catch (IOException e) { e.printStackTrace(); }
	}

	private static void clientHandler(Socket clientSocket)
	{
		try (	
				ObjectOutputStream out =
				new ObjectOutputStream(clientSocket.getOutputStream());
				ObjectInputStream in =
						new ObjectInputStream(clientSocket.getInputStream());
			)
		{
			String string = in.readUTF();
			
			System.out.println("Server received:  " + string);
			System.out.println("--------");
		}
		catch (IOException e) { System.out.println(e.getMessage()); }
	}
}
