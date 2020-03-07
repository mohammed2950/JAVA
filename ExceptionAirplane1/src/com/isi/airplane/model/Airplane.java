package com.isi.airplane.model;

import com.isi.airplane.view.IAirplaneView;

public class Airplane implements IAirplaneModel
{
	public double altitude = 0;
	public static Airplanestate state=Airplanestate.OFF;
	private IAirplaneView airplainview;
	private Boolean changingAltitude = false;
	private double TargetAltitude;
	
	
	
	private void setState(Airplanestate state)
	{
		this.state=state;
		airplainview.updateState(state);
	}

	public void checkState(Airplanestate state) throws InvalidActionException {


		if(this.state!=state) 
		{
			throw new InvalidActionException(state,this.state);

		}

	}


	public  void start() throws InvalidActionException {
		// TODO Auto-generated method stub

		checkState(Airplanestate.OFF);
		airplainview.displayMessage("Airplain Is Starting");
		//state=AirplaneState.RUNNING;
		//airplainview.updateState(AirplaneState.RUNNING);
		setState(Airplanestate.RUNNING);

	}

	public void takeOff() throws InvalidActionException {
		checkState(Airplanestate.RUNNING);
		airplainview.displayMessage("Airplain Is TakingOff");
		setAltitude(2000); //2000 is the initial altitude
		//state=AirplaneState.FLYING;
		setState(Airplanestate.FLYING);

	}

	public void stop() throws InvalidActionException{
		// TODO Auto-generated method stub
		checkState(Airplanestate.RUNNING);
		state=Airplanestate.OFF;
		airplainview.displayMessage("Airplain Stopped");

	}
	public void increaseAltitude() throws InvalidActionException {
		// TODO Auto-generated method stub
		checkState(Airplanestate.FLYING);
		setTargetAltitude(TargetAltitude + 2000);

	}
	public void decreaseAltitude() throws InvalidActionException{
		// TODO Auto-generated method stub
		checkState(Airplanestate.FLYING) ;
		setTargetAltitude(TargetAltitude - 2000);

	}
	private void setAltitude(double altitude)
	{
		this.altitude = altitude;
		airplainview.updateAltitude(altitude);
		if(this.altitude>=12000) {
			explode();
		}
		else if(this.altitude>=10000) {
			danger();
		}
		else if(this.altitude<=0) {
			this.altitude = 0;
			land();
		}
	}
	private void setTargetAltitude(double TargetAltitude)
	{
	this.TargetAltitude  = TargetAltitude;
	airplainview.updateTargetAltitude(TargetAltitude);
	if(altitude != TargetAltitude &&  !changingAltitude)
	{
		Thread thread = new Thread(() ->changingAltitude());
		
	thread.start();
	}
	}
	public void explode()
	{
		System.out.println("BOOM!!!");

		System.exit(0);
	}
	public void danger() {
		System.out.println("DANGER AIRPLANE ALTITUDE IS/ABOVE 10000!!!");
	}
	public void land() {
		state=Airplanestate.RUNNING;
	}

private void changingAltitude()
{
	double updatesPerSeconds = 10;
	double altitudeChangePerSecond = 500;
	
	double milisecondsPerUpdate = 1000 / updatesPerSeconds;
	double altitudeChangePerUpdate = altitudeChangePerSecond / updatesPerSeconds;
	
	
	while (altitude != TargetAltitude)
	{
		if(Math.abs(altitude - TargetAltitude) <= altitudeChangePerUpdate);
		{
			setAltitude(TargetAltitude);
			break;
		}
		else 
		{
			
			
		}
		}
		
		
		if(TargetAltitude > altitude)
			setAltitude(altitude + altitudeChangePerUpdate);
			else  
				setAltitude(altitude -altitudeChangePerUpdate);
		try 
		{
			Thread.sleep((long) milisecondsPerUpdate);
			
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
}
	public Airplanestate getState()
	{
		// TODO Auto-generated method stub
		return state;
	}


	@Override
	public double getAltitude() {
		// TODO Auto-generated method stub
		return altitude;
	}
	public void setView(IAirplaneView airplainview) {
		this.airplainview=airplainview;
	}
}