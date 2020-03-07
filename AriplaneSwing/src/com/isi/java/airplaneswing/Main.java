package com.isi.java.airplaneswing;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.Airplane;
import model.IAirplaneModel;
import View.AirplaneWindow;
import View.IAirplaneView;

public class Main
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() -> start());
	}
	
	private static void start()
	{
		setSystemLookAndFeel();
		
		//////
		Airplane airplane = new Airplane();
		IAirplaneModel iAirplane = (IAirplaneModel)airplane;
		
		AirplaneWindow window = new AirplaneWindow(iAirplane);
		IAirplaneView iView = (IAirplaneView)window;
		
		airplane.setView(iView);
	}
	
	private static void setSystemLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		}
		catch (ClassNotFoundException | InstantiationException |
				IllegalAccessException | UnsupportedLookAndFeelException e)
		{}
	}
}
