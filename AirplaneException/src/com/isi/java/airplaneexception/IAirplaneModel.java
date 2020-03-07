package com.isi.java.practicalexam.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Time;
import java.util.Calendar;

public class BathNotifier
{
	public static final int port = 7199;


	public static void main(String[] args)
	{			
		while (true)
		{

			try (
					ServerSocket serverSocket = new ServerSocket(port);
					Socket clientSocket = serverSocket.accept();
					BufferedReader in = new BufferedReader(
							new InputStreamReader(clientSocket.getInputStream()));
					)
			{		
				String inputLine;

				while ((inputLine = in.readLine()) != null)
				{



					Calendar now = Calendar.getInstance();

					String time = (now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));

					String message = "Bath notification:  " + inputLine + "  (" + time + ")"; 	


					System.out.println(message);



				}
			}

			catch (IOException e)
			{
				System.out.println("Exception caught when trying to listen on port "
						+ port + " or listening for a connection");
				System.out.println(e.getMessage());
			}


		}
	}
}

