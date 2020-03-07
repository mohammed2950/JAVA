package com.isi.java.threads;

public class Main 
{

public static void main(String[] args)
{
	
	System.out.println("main() starting..");
	Data data = new Data();
	
	IncrementThread thread1  = new IncrementThread(data);
	IncrementThread thread2  = new IncrementThread(data);
	
	System.out.println("main() : starting threeds");
	thread1.start();
	thread2.start();
	try 
	{
		thread1.join();
		thread2.join();
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(" main () exiting");
	
	
	}	
}
