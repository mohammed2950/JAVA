package com.isi.java.practical.network;

import com.isi.java.practical.model.CarState;
import com.isi.java.practical.model.GasLevelEvent;
import com.isi.java.practical.view.ICarView;

public class CarClient implements ICarView
{
	// Update view methods
	// Implementation of ICarView interface
	
	@Override
	public void updateGasLevel(GasLevelEvent event)
	{
		//// If gas is empty or full, then send event info package to server
	}

	@Override
	public void updateCarState(CarState carState) { }	// Do nothing
}
