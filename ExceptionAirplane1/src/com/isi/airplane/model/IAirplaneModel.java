package com.isi.airplane.model;

public interface IAirplaneModel
{
	void start() throws InvalidActionException;
	void stop()throws InvalidActionException;
	void takeOff()throws InvalidActionException;
	void increaseAltitude()throws InvalidActionException;
	void decreaseAltitude()throws InvalidActionException;

	Airplanestate getState();
	double getAltitude();

}
