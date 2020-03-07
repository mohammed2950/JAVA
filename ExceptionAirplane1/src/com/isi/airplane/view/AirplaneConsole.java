package com.isi.airplane.view;

import java.text.DecimalFormat;

import com.isi.airplane.model.Airplane;
import com.isi.airplane.model.Airplanestate;
import com.isi.airplane.model.InvalidActionException;

import Util.IO;

public class AirplaneConsole implements IAirplaneView
{
	private Airplane airplane;
	private DecimalFormat df=new DecimalFormat("0.00");
	public AirplaneConsole(Airplane airplane) {

		this.airplane=airplane;
	}
	public void start() {

		int choice = 0;
		while(true)
		{
			System.out.println("-------------");
			System.out.println("1 – Start motor\n2 - Take off\n3 - Stop motor\n4 -Increase altitude\n5 - Decrease altitude\n6 - Exit");
			choice = IO.getInt();
			try {
				switch(choice)
				{
				case 1:
					airplane.start();
					break;
				case 2 :
					airplane.takeOff();
					break;
				case 3:
					airplane.stop();
					break;
				case 4:
					airplane.increaseAltitude();
					break;
				case 5 :
					airplane.decreaseAltitude();
					break;
				case 6:
					exit();
					break;

				}}
			catch (InvalidActionException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}}}
	private static void exit() {
		// TODO Auto-generated method stub
		System.out.println("You have exited from the menu");
		System.exit(0);


	}
	
	public void updateState(Airplanestate state) {

		System.out.println("Airplane State :"+state);

	}

	public void updateAltitude(double altitude) {
		System.out.println("Altitude : "+df.format(altitude));

	}
	public void displayMessage(String message) {

		System.out.println(message);
	}
	
	public void displayError(String message) {
		System.out.println(message);

	}
	@Override
	public void updateTargetAltitude(double TargetAltitude) 
	{
		System.out.println("Altitude : "+df.format(TargetAltitude));

		
		// TODO Auto-generated method stub
		
	}


}
