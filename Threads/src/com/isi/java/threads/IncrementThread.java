package com.isi.java.threads;


public class IncrementThread extends Thread
{
	
	private Data data;

	public  IncrementThread(Data data)

	{
	super ();
	this.data =data;
}
	
	@Override
	 public void run ()
	 {
		for(int i = 0; i < 10 ; i++)
		{
			
			int value; 
			//value = data.incrementSynchronizeMethod();
			//value = data.incrementSyncronizeBlock();
			synchronized (data) 
			{
				value = data.increment()
				
			}
			value = data.incrementlock();
			
			//System.out.println(value);
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		
		
	 }
	
	
		}
	
}
