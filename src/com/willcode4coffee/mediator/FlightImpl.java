package com.willcode4coffee.mediator;

public class FlightImpl extends Flight { 
	
	public FlightImpl(AirTrafficController controller, String name) { 
		super(controller,name);
	}

	@Override
	public void takeOff(String msg, Flight flight) {
		
		
		System.out.println(this.airlineLine + " Taking Off  on " + msg);
		airtrafficcontroller.takeOff(msg, this);
		
	}

	@Override
	public void recieveMessage(String msg) {
		
		
		System.out.println(this.airlineLine +  " Airlines : was sent the  the Message that "
				+ msg);
		
	}

	
	
	
	
	

	
	
}
