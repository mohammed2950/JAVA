package com.isi.java.practicalexam.model;

public class LevelEvent 
{
	private Bath source;
	private double level;
	
	
	public LevelEvent(Bath bath)
	{
		this.source = bath;
		level = source.getLevel();
	}
	
	public Bath getSource() 
	{
		return source;
	}
	
	public double getLevel()
	{
		return level;
	}
}
