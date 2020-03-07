package com.isi.java.practicalexam.model;

import java.util.ArrayList;

public class Bath implements Runnable
{
	private double capacity = 100;
	private double level = 0;
	private boolean plugInserted = true;
	private boolean faucetRunning = false;
	private Bathroom bathroom;
	
	private ArrayList<LevelListener> listeners = new ArrayList<>();
	
	public Bath()
	{
		
	}
	public Bath(double capacity)
	{
		this.capacity = capacity;
	}
	public Bath(double capacity, double level, boolean plugInserted, boolean faucetRunning) throws InvalidCapacityException
	{
		if(capacity < 125 || capacity > 225)
		{
			throw new InvalidCapacityException("Capacity has exceeded");
		}
		
		this.capacity = capacity;
		this.level = level;
		this.plugInserted = plugInserted;
		this.faucetRunning = faucetRunning;
		
	}
	
	public void setBathroom(Bathroom bathroom) { this.bathroom = bathroom; }

	
	public double getCapacity() {
		return capacity;
	}
	
	public double getLevel() {
		return level;
	}
	
	public boolean getPlugInserted()
	{
		return plugInserted;
	}
	
	public boolean getFaucetRunning() 
	{
		return faucetRunning;

	}
	
	private void setLevel(double level) {
		this.level = level;
		notifyAllListeners();
	}
	

	public void turnOn()
	{
		if(!faucetRunning)
		{
			System.out.println("Faucet turned on");
			faucetRunning = true;
			
			new Thread(() -> run()).start();
		}


	}
	
	public void turnOff()
	{
		if(faucetRunning)
		{
			System.out.println("Faucet turned off");

			faucetRunning = false;
		}

	}
	
	public void insertPlug()
	{
		System.out.println("Plug inserted");

		plugInserted = true;
	}
	public void removePlug()
	{
		System.out.println("Plug Removed");

		plugInserted = false;
	}
	
	public void addLevelListener(LevelListener listener)
	{
		listeners.add(listener);
	}
	
	public void removeLevelListener(LevelListener listener)
	{
		listeners.remove(listener);
	}
	
	private void notifyAllListeners()
	{
		for (LevelListener listener : listeners)
			listener.levelChanged(new LevelEvent(this));
	}
	
	@Override
	public void run() 
	{
		while (true)
		{
			if(faucetRunning)
			{
				double presentLevel = level;
				double newLevel = presentLevel;
				
				if(plugInserted)
				{
					newLevel = presentLevel + 2.0d;
				}
				
				if(!plugInserted)
				{
					newLevel = presentLevel - 2.6d;
				}
				
				if (newLevel >= capacity)
				{
					System.out.println("Max Capacity reached");
					newLevel = capacity;

					turnOff();
				}
				
				setLevel(newLevel);
				
				try
				{
					Thread.sleep(500);
				}
				catch (InterruptedException e) { e.printStackTrace(); }
			}
			if(!faucetRunning)
			{
				double presentLevel = level;
				double newLevel = presentLevel;
				
				if(plugInserted)
				{
					newLevel = presentLevel;
				}
				
				if(!plugInserted)
				{
					newLevel = presentLevel - 0.6d;
					if (newLevel <= 0)
					{
						System.out.println("Minimum Capacity reached");
						newLevel = 0;

						insertPlug();
						//turnOn();
					}
				}								
				
				setLevel(newLevel);
				
				try
				{
					Thread.sleep(500);
				}
				catch (InterruptedException e) { e.printStackTrace(); }
			}

		}
	}
	
	
}
