package com.willcode4coffee.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControllerImpl  implements AirTrafficController {

	
	private List<Flight> flights;
	
	
	
	
	AirTrafficControllerImpl() { 
		this.flights = new ArrayList<Flight>();
		
	}
	
	
	
	
	
	public void takeOff(String msg, Flight flight) {
		
		for(Flight flght: this.flights) { 
			
			if(flght != flight) { 
				
				flght.recieveMessage(msg +" Is used by  , " + flight.airlineLine + "Airline");
				
			}
			
		}
		
	}

	public void addFlight(Flight flight) {
		
		this.flights.add(flight);
		
	}
 
	
	
}
