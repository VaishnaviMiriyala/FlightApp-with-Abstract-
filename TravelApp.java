package m5.task1;

import java.time.LocalDateTime;
import java.util.Scanner;
public class TravelApp {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		TravelApp ta =new TravelApp();
		/* Write code to call Flight constructor and Flight class setter methods*/
		Domestic d = new Domestic("12345","IndiGo","DEL",LocalDateTime.parse("2021-03-24T07:30:15.40"),"HYD",LocalDateTime.parse("2021-03-24T09:40:20.23"),1200);
		ta.doTravel(d);
		System.out.println(" ------------------------");
		
		International it = new International("12345","IndiGo","DEL",LocalDateTime.parse("2021-03-24T07:30:15.40"),"HYD",LocalDateTime.parse("2021-03-24T09:40:20.23"),1200);
		ta.doTravel(it);
		
		
		}
	public void doTravel(Flight f)
	{
		System.out.println("Enter the number of stops");
		int stops = Integer.parseInt(sc.nextLine());
		Halt halt[] = new Halt[stops];
		for(int i = 0; i < stops; i++) {
			Halt h = new Halt();
			
			System.out.println("Enter Airport Name");
			String name = sc.nextLine();
			h.setAirportName(name);
			
			System.out.println("Enter duration");
			int dur = Integer.parseInt(sc.nextLine());
			h.setDuration(dur);
			
			halt[i] = h;
		}
		f.setHault(halt);
		f.checkFriendlyCountry();
		f.checkAirlineCalander();
		f.checkTime();
		f.calculateCost();
	    FlightDetails flightDetails = new FlightDetails();
		flightDetails.printFlightDetails(f);

		}
	
}
