package com.isi.java.airplane;
import util.*;

public class Airplane
{
private double altitude = 0;
private boolean started = false;
private boolean landed = true;
private boolean exploded = false;


public double getAltitude() {
	return altitude;
}


public boolean isStarted()
 {
	 if(started==true)
	 {
			return true;
		}
		else 
			return false;	
	}
public boolean isLanded() 
{
	if(landed==true)
	{
		return true;
	}
	else
		return false;
}
public boolean isExploded()
{
	if(exploded==true)
	{
		return true;
	}
	else 
		return false;
}
private boolean checkstarted(boolean started)
{
	if(this.started == started)
	{
		return true;
	}
	else
{
	String notBlank = (this.started) ? "" : "not";
	System.out.println("Error : Airplane is" + notBlank + "started");
	return false;
}
}
private boolean checklanded(boolean landed)
{
	if(this.landed == landed)
	{
		return true;
	}

else
{
	String notBlank = (this.landed) ? "" : "not";
	System.out.println("Error : Airplane is" + notBlank + "landed");
	return false;
}
}

public void start() 
{
if (checkstarted(false) && checklanded(true));
{
		System.out.println("The Airplane is: Off!!");
		started = true;
}
}
 public void stop() 
{
	 if (checkstarted(false) && checklanded(true));
	 {
	 		System.out.println("The Airplane is: Off!!");
	 		started = true;
 
	}
public void takeOff() 
{
	if (running = true)
	{
		
	}
	
}

public void increasealtitude()
{
	if(altitude >= 0) 
	{
		System.out.println("the current altiutde is : 0");
	altitude = altitude + 1000;
	System.out.println("the current altiutde is:" +altitude);
	}
else if(altitude == 10000)
{
	System.out.println("the current altiutde is : 10000");
	System.out.println("The Airplane is in Danger");
	
}
else if (altitude ==11000)
{
	altitude = altitude + 1000;
	System.out.println("the current altitude is:12000");
	System.out.println("the airplane is exploded");
}
}


private void setAltitude() 
{
	altitude=2000;
}





 
 
 
 






}
