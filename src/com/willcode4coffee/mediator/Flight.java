package com.willcode4coffee.mediator;

public abstract class Flight {
	
	protected AirTrafficController airtrafficcontroller;
	
	protected String airlineLine;
	
	public Flight(AirTrafficController controller,String airlineName) { 
		
		this.airtrafficcontroller = controller;
		this.airlineLine = airlineName;
		
		
	}
	
	
	public abstract void takeOff(String msg,Flight flight);
	
	
	public abstract void recieveMessage(String msg);


 // Notice for the Flight has the reference to AirTrafficController. In our case this is our Mediator
	//It is required for communication between Flights  that are  taking off. 
	// In our case there is only 2 runways.  
	//So when the Flight X is taking off all 
	//other flights at the airport need to be notified. 
	
}
