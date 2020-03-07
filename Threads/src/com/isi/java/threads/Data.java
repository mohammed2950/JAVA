package com.isi.java.threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Data
{

	private int value = 0;
	private AtomicInteger atomicvalue = new AtomicInteger(0);
	private ReentrantLock lock = new ReentrantLock();
	
	public int  getvalue()
	{
	
		return value;
		
	}
	public int increment()
	{
		System.out.println(++value); 
		return value;
	}
	
	public synchronized int  incrementSynchronizeMethod() 
	{
		
		System.out.println(++value);
		return value;
		
	}
	
	public int  incrementSyncronizeBlock()
	{
	synchronized(this)
	{
		System.out.println(++value);
		return value;
		

	}
	public int incrementlock()
	{
		lock.lock();
		try 
		{
			
		} 
		finally 
		{
			lock.unlock();
			
		} 	
		
		public int incrementAtomic()
		{
			int original = atomicvalue.get();
			atomicvalue.addAndGet(1);
			
			synchronized (this) 
			{
				
			}
			
			return atomicvalue.get();
			
		
	}
		
		
	}
		
		
	}
}
