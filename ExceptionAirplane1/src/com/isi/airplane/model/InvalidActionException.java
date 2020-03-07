package com.isi.airplane.model;

public class InvalidActionException extends Exception { 

	private Airplanestate requiredState;
	private Airplanestate actualState;
	
	public Airplanestate getRequiresState() {
		return requiredState;
	}
	public Airplanestate actualState() {
		return actualState;
	}

	public InvalidActionException(Airplanestate requiredstate,Airplanestate actualState)
	{
		super("Invalid Action : The Actual State Is :  " + actualState +" Not : "+requiredstate);
		this.requiredState=requiredstate;
		this.actualState=actualState;
	}

}
