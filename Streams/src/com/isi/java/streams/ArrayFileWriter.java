package com.isi.java.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.RandomAccess;

public class ArrayFileWriter
{
	private String path;
	
	 public ArrayFileWriter(String path)
	{
		this.path = path;
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void writeToArrayFile(String[] array)
	{
		try (ObjectOutputStream out =
				new ObjectOutputStream(new FileOutputStream(path)))
		{
			{
				int size = array.length;
				
				out.writeInt(size);
				
				for (int i = 0; i < size; i++)
				{
					out.writeString(array[i]);
				}
			}
			catch (IOException e) { e.printStackTrace(); }
		}
	}