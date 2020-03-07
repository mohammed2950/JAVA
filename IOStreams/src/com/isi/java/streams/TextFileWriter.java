package com.isi.java.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFileWriter
{
	private String path;
	
	public TextFileWriter(String path)
	{
		this.path = path;
	}
	
	public void writeTextToFile()
	{
		try (PrintWriter out = new PrintWriter(new File(path)))
		{
			out.println("Hello, this is a line.");
			out.println("Well, this is another line.");
			out.println(100);
			out.println(2.5d);
			out.print("This is a line fragment, ");
			out.print("and this is another line fragment.");
		}
		catch (FileNotFoundException e) { e.printStackTrace(); }
	}
}
