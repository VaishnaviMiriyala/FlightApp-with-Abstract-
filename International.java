package m5.task1;

import java.time.LocalDateTime;

public class International extends Flight{
    
	public International() {
		super();
	}

	public International(String flightNumber, String airliner, String source, LocalDateTime flyDateTime,
			String destination, LocalDateTime arrivalDateTime, int baseFare) {
		super(flightNumber, airliner, source, flyDateTime, destination, arrivalDateTime, baseFare);
	}

	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		setFinalCost((int) (getBaseFare() + getNonFriendlyTax() + getTimeTax() + getcalendarTax() + getFuelCost() + getSurCharge())) ;
		return getFinalCost();
	}

}
