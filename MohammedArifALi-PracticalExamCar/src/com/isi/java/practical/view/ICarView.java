package com.isi.java.practical.view;

import com.isi.java.practical.model.CarState;
import com.isi.java.practical.model.GasLevelEvent;
import com.isi.java.practical.model.GasLevelState;

public interface ICarView
{
	void updateGasLevel(GasLevelEvent event);
	static void updateCarState(CarState carState) {
		// TODO Auto-generated method stub
		
	}
	
	static void updatestate(GasLevelState state)
	{
		// TODO Auto-generated method stub
		
	}
	static void displayMessage(String string)
	{
		// TODO Auto-generated method stub
		
	}
}
