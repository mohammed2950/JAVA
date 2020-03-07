package com.isi.java.practical.model;

public class CapacityException extends Exception
{	
	private CarState requiredstate;
	private CarState actualstate;
	private GasLevelState requiredstate1;
	private GasLevelState actualstate1;
	
	
	public CarState getrequiredstate()
	{
		return requiredstate;
		
	}
	public CarState actualstate()
	{
		return actualstate;
	}
	
	public GasLevelState getrequiredstate1()
	{
		return requiredstate;
		

	}
	public CarState actualstate1()
	{

		
		return actualstate;
	}
	
	public CapacityException(CarState requiredstate,GasLevelState state)
	{
		super("Invalid Action : The Actual State Is :  " + state +" Not : "+requiredstate);
		this.actualstate=state;
		this.requiredstate= requiredstate;
	}

	
	public CapacityException(GasLevelState requiredstate1,GasLevelState actualstate1)
	{
		super("Invalid Action : The Actual State Is :  " + actualstate1 +" Not : "+requiredstate1);
		this.actualstate1=actualstate1;
		this.requiredstate1= requiredstate1;
	}
	public CapacityException(double capacity, double mincapacity, double maxcapacity) 
	{
		// TODO Auto-generated constructor stub
	}

}
	
	
	/*public CapacityException(String string)
	{
		
		// TODO Auto-generated constructor stub
	}

	

	/* private CapacityException(GasLevelState state, GasLevelState state2) {
		// TODO Auto-generated constructor stub
	}

	}*/
