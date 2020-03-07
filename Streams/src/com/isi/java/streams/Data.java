package com.isi.java.streams;

import java.io.Serializable;

public class Data implements Serializable
{
	public int a;
	public byte b;
	public float c;
	public String message;
	
	public Data(int a, byte b, float c, String message)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.message = message;
	}
	
	@Override
	public String toString()
	{
		return "a: " + a + ",  b: " + b + ",  c: " + c + ",  message: " + message;
	}
}
