package com.isi.java.streams;

import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		String textPath = "text.txt";
		String dataPath = "data.bin";
		
		TextFileWriter textFileWriter = new TextFileWriter(textPath);
		TextFileReader textFileReader = new TextFileReader(textPath);
		DataFileWriter dataFileWriter = new DataFileWriter(dataPath);
		DataFileReader dataFileReader = new DataFileReader(dataPath);

		
		// Text
		
		System.out.println("Writing text to " + textPath);
		textFileWriter.writeTextToFile();
		System.out.println("Successfully wrote text to " + textPath);
		System.out.println();
		
		System.out.println("Reading text from " + textPath);
		System.out.println();
		textFileReader.readTextFromFile();
		System.out.println();
		System.out.println("Successfully read text from " + textPath);
		System.out.println();
		
		
		// Data: Primitives and objects
		
		System.out.println("Writing data to " + dataPath);
		Data data = new Data(496, (byte)12, -94.28f, "A different message");
		dataFileWriter.writeDataToFile(78, -9999.3d, true, "Another message", data);
		System.out.println("Successfully wrote data to " + dataPath);
		System.out.println();
		
		System.out.println("Reading data from " + dataPath);
		System.out.println();
		dataFileReader.readDataFromFile();
		System.out.println();
		System.out.println("Successfully read data from " + dataPath);
		
		// Data: Double array
		
		System.out.println("Writing double array data to " + dataPath);
		dataFileWriter.writeIntArrayToFile(generateRandomArray(10, 100));
		System.out.println("Successfully wrote double array data to " + dataPath);
		System.out.println();
		
		System.out.println("Reading double array data from " + dataPath);
		System.out.println();
		dataFileReader.readIntArrayFromFile();
		System.out.println();
		System.out.println("Successfully read double array data from " + dataPath);
		

	}
	
	public static double[] generateRandomArray(int size, double max)
	{
		Random random = new Random(System.currentTimeMillis());
		double[] array = new double[size];
		
		for (int i = 0; i < size; i++)
		{
			array[i] = random.nextDouble() * max;
		}
		
		return array;
	}
}
