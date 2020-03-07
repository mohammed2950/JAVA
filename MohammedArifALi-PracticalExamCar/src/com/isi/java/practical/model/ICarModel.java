package com.isi.java.practical.model;

public interface ICarModel
{
	// Getter methods
	double getGasLevel(double min,double max);
	double getGasCapacity( double capacity) throws CapacityException; 
	GasLevelState setGasLevelState();
	CarState setCarState();
	
	// User action methods
	void startDriving() throws CapacityException;
	void stopDriving() throws CapacityException;
	void startFillingGas() throws CapacityException;
	void stopFillingGas();
	static void driveCarbuttons() 
	{
		// TODO Auto-generated method stub
		
	}
	double getGasLevel();
}
