package com.isi.java.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DataFileReader
{
	private String path;
	
	public DataFileReader(String path)
	{
		this.path = path;
	}
	
	public void readDataFromFile()
	{
		try (ObjectInputStream in =
				new ObjectInputStream(new FileInputStream(path)))
		{
			int i = in.readInt();
			double d = in.readDouble();
			boolean b = in.readBoolean();
			String s = in.readUTF();
			Object o = in.readObject();
			
			Thread.sleep(1000);
			System.out.println("i: " + i);
			Thread.sleep(1000);
			System.out.println("d: " + d);
			Thread.sleep(1000);
			System.out.println("b: " + b);
			Thread.sleep(1000);
			System.out.println("s: " + s);
			Thread.sleep(1000);
			System.out.println("o: " + o);
			Thread.sleep(1000);
		}
		catch (IOException | InterruptedException | ClassNotFoundException e) { e.printStackTrace(); }
	}
	
	public void readIntArrayFromFile()
	{
		try (ObjectInputStream in =
				new ObjectInputStream(new FileInputStream(path)))
		{
			int size = in.readInt();
			double[] array = new double[size];
			
			Thread.sleep(1000);
			
			for (int i = 0; i < size; i++)
			{
				array[i] = in.readDouble();
				System.out.println("array[" + i + "]: " + array[i]);
				Thread.sleep(1000);
			}
		}
		catch (IOException | InterruptedException e) { e.printStackTrace(); }

	}
}
