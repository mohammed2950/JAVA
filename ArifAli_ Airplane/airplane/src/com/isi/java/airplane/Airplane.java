package com.isi.java.airplane;
import util.*;

public class Airplane
{
private double altitude = 0;
private boolean started = false;
private boolean landed = true;
private boolean exploded = false;


public double getaltitude() 
{ 
	return  altitude;
	}
public boolean getstarted() 
{ 
	return  started;
	}
public boolean getlanded() 
{ 
	return  landed;
	}
public boolean getexploded() 
{ 
	return  exploded;
	}
 public void  start ()
 {
 System.out.println("Airpalne is: starting");
 }
 public void  stop ()
 {
 System.out.println("Airpalne is: stoping");
 }
 public void  takeoff ()
 {
 System.out.println("Airpalne is:Takingoff");
 }
 public void  increasealtitude ()
 {
	 System.out.println("Airpalne is: Increasing Altitude ");
	 if (altitude >= 10000)
	 {
		 System.out.println("Airpalne is: In Danger  ");
	 }
	 else if (altitude >= 12000) 
	 {
		 System.out.println("Airpalne is: Exploding ");
	}
 
 }
 public void  decreasealtitude ()
 {
 System.out.println("Airpalne is: Landing");
 }
 
 
 
 






}
