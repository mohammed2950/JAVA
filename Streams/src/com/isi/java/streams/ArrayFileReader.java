package com.isi.java.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ArrayFileReader
{
	private String path;
	public ArrayFileReader(String path)
	{
		this.path = path;
	}
	public void readIntArrayFromFile()
	{
		try (ObjectInputStream in =
				new ObjectInputStream(new FileInputStream(path)))
		{
			int size = in.readInt();
			String[] array = new String[size];
			
			Thread.sleep(1000);
			
			for (int i = 0; i < size; i++)
			{
				array[i] = in.readString();
				System.out.println("array[" + i + "]: " + array[i]);
				Thread.sleep(1000);
			}
		}
		catch (IOException | InterruptedException e) { e.printStackTrace(); }

	}
}

