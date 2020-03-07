package com.isi.java.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader
{
	private String path;
	
	public TextFileReader(String path)
	{
		this.path = path;
	}
	
	public String readTextFromFile()
	{
		String text = "";
		try (BufferedReader in = new BufferedReader(new FileReader(path)))
		{
			String line;

			Thread.sleep(1000);
			while ((line = in.readLine()) != null)
			{
				text += line;
				System.out.println(line);
				Thread.sleep(1000);
			}
		}
		catch (IOException | InterruptedException e) { e.printStackTrace(); }
		
		return text;
	}
}
