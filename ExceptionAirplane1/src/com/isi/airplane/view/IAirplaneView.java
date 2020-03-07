package com.isi.airplane.view;

import com.isi.airplane.model.Airplanestate;

public interface IAirplaneView
{
	 void updateState(Airplanestate state) ;
	 void updateAltitude(double altitude);
	 void displayMessage(String message);
	 void displayError(String message);
	 void updateTargetAltitude(double TargetAltitude);
}
