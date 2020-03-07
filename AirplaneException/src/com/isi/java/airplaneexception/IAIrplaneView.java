package com.isi.java.practicalexam.model;

public class Bathroom 
{
	private Bath bath;
	//-->
	
	public Bathroom(Bath bath) 
	{
		this.bath = bath;
	}
	
	public Bath getBath()
	{
		return bath;
	}
	
	public void setBath(Bath bath)
	{
		this.bath = bath;
	}
}
