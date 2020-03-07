package View;

import model.AirplaneState;

public interface IAirplaneView
{
	 void updateState(AirplaneState state) ;
	 void updateAltitude(double altitude);
	 void displayMessage(String message);
	 void displayError(String message);
	 void updateTargetAltitude(double TargetAltitude);
}
