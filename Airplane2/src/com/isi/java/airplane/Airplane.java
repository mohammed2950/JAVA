package com.isi.java.airplane;
public class Airplane
{
public  double altitude = 0;
	private Airplanestate state = Airplanestate.OFF;

	public double getaltitude()
{
	return altitude;
}
	public Airplanestate getstate()
	{
		return state;
	
	}

private boolean checkstate(Airplanestate state)
{
	if(this.state == state)
	
		return true;
	else
{
	
	System.out.println("Error:");
}
	return false;
}
	
public void start() 
{
if (checkstate(Airplanestate.OFF));

{
	state = Airplanestate.RUNNING;
		System.out.println("The Airplane is: Starting!!");
}
}
public void takeOff() 
{
	if(checkstate(Airplanestate.RUNNING))
	{
	setAltitude(2000);
	state = Airplanestate.FLYING;
	System.out.println("The Airplane is:TakingOff!!");
	}
}
public void stop() 
{
	if(checkstate(Airplanestate.RUNNING))
	{
		state = Airplanestate.OFF;
		System.out.println("The Airplane is:Stoping!!");
	}
}
public void increasealtitude()
{
	if(checkstate(Airplanestate.FLYING))
	{
		setAltitude(altitude + 1000);
	}
}
public void decreasealtitude()
{
	if(checkstate(Airplanestate.FLYING))
	{
		setAltitude(altitude - 1000);
	}
}

private void setAltitude(double altitude) 
{
		this.altitude = altitude;
		System.out.println("the current altitude is:");
		System.out.println( altitude);

	if (altitude >= 12000) 
	{
		explode();
		
		
	}
	if (altitude >= 10000) 
	{
		danger();
		
	}
	
	if (altitude <= 0) 
	{
		this.altitude=0;
		land();
		
	}
}
	private void danger() 
	{
		System.out.println("The airplane is in Danger");
	
}
	private void land()
	{
		System.out.println("The airplane is landing");
		
		state = Airplanestate.RUNNING;		
	
}
	public void explode ()
	{
	System.out.println("The airplane is Exploding");
	System.exit(0);
	}
}



