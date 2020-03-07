package com.isi.java.practicalexam.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class BathFullListener implements LevelListener
{	
	@Override
	public void levelChanged(LevelEvent levelevent) {
		// TODO Auto-generated method stub
		System.out.println("Level Changed");
		double level = levelevent.getLevel();

		if(level>=(levelevent.getSource().getCapacity()))
		{
			String hostName = "localhost";
	        int portNumber = 7199;

	        try (   
	                Socket echoSocket = new Socket(hostName, portNumber);
	                PrintWriter out =
	                    new PrintWriter(echoSocket.getOutputStream(), true);
	                BufferedReader in =
	                    new BufferedReader(
	                        new InputStreamReader(echoSocket.getInputStream()))
	            )
	        {
	                out.println("Maximum Level Reached");
	                System.out.println("To Server: " + "Maximum Level Reached");
	        }
	        catch (UnknownHostException e)
	        {
	            System.err.println("Don't know about host " + hostName);
	            System.exit(1);
	        }
	        catch (IOException e)
	        {
	            System.err.println("Couldn't get I/O for the connection to " +
	                hostName);
	            System.exit(1);
	        } 
			
		}
	}

}
