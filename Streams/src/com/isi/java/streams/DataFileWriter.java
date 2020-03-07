package com.isi.java.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataFileWriter
{
	private String path;
	
	public DataFileWriter(String path)
	{
		this.path = path;
	}
	
	public void writeDataToFile(int i, double d, boolean b, String s, Data data)
	{
		try (ObjectOutputStream out =
				new ObjectOutputStream(new FileOutputStream(path)))
		{
			out.writeInt(i);
			out.writeDouble(d);
			out.writeBoolean(b);
			out.writeUTF(s);
			out.writeObject(data);
		}
		catch (IOException e) { e.printStackTrace(); }
	}
	
	public void writeIntArrayToFile(double[] array)
	{
		try (ObjectOutputStream out =
				new ObjectOutputStream(new FileOutputStream(path)))
		{
			int size = array.length;
			
			out.writeInt(size);
			
			for (int i = 0; i < size; i++)
			{
				out.writeDouble(array[i]);
			}
		}
		catch (IOException e) { e.printStackTrace(); }
	}
}
