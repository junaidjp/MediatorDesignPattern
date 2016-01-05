package com.willcode4coffee.mediator;

public class MediatorClient {
	
	public static void main(String args[]) { 
		
		
		
		AirTrafficController controller = new AirTrafficControllerImpl();
		
		
		Flight flightAU = new FlightImpl(controller,"AUA");
		Flight flightBAQ	 = new FlightImpl(controller, "Batar");
		Flight flightdumirates = new FlightImpl(controller,"Dumirates");
		Flight flightSouthEast = new FlightImpl(controller,"SouthEast");
		controller.addFlight(flightAU);
		controller.addFlight(flightBAQ);
		controller.addFlight(flightdumirates);
		controller.addFlight(flightSouthEast);
     
		 flightAU.takeOff("Run way one" , flightAU);
		 
		 flightBAQ.takeOff("Run way Two", flightBAQ);
		 
		 
		
	}

}
