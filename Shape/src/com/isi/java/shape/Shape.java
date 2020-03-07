package com.isi.java.shape;

import java.util.Random;

public abstract class Shape  implements Comparable<Shape>
{

	public abstract double getArea();

	public void display() 
	{

		System.out.println("The Area Of The " + toString() +" Is : "+getArea());

	}
	@Override
	public String toString() 
	{

		return this.getClass().getSimpleName();

	}
	@Override
	public int compareTo(Shape shape)
	{
		
		return 0;
		
	}
	@Override 
	public string tostring()
	{
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	