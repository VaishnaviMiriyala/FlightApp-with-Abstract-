package m5.task1;

public class FlightDetails {
	public void printFlightDetails(Flight flight)
	{
		/* Write code to print the flight information and fare break up*/
		System.out.println("The flight information");
		System.out.println("Flight Number "+flight.getFlightNumber());
		System.out.println("Air Liner "+flight.getAirliner());
		System.out.println("Source "+flight.getSource());
		System.out.println("Fly Date Time"+flight.getFlyDateTime());
		System.out.println("Destination "+flight.getArrivalDateTime());
		
		
		for(Halt hault : flight.getHault()) {
			System.out.println("Airport Name: " + hault.getAirportName());
			System.out.println("Duration: " + hault.getDuration());
		}

		System.out.println("The Flight break up costing is:");
		System.out.println("Base Fare: " + flight.getBaseFare());
		System.out.println("Surcharge: " + flight.getSurCharge());
		System.out.println("Fuel Cost: " + flight.getFuelCost());
		System.out.println("Calendar Tax: " + flight.getcalendarTax());
		System.out.println("Time Tax: " + flight.getTimeTax());
		System.out.println("Non-Friendly Country Travel Tax: " + flight.getNonFriendlyTax());
		System.out.println("Final Cost: " + flight.getFinalCost());
	}

}
