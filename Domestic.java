package m5.task1;

import java.time.LocalDateTime;
public class Domestic extends Flight{
	public Domestic(String flightNumber, String airliner, String source, LocalDateTime flyDateTime, String destination,
			LocalDateTime arrivalDateTime, int baseFare) {
		super(flightNumber, airliner, source, flyDateTime, destination, arrivalDateTime, baseFare);
	}
	public Domestic() {
		super();
	}
	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		setFinalCost((int) (getBaseFare()  + getTimeTax() + getcalendarTax() + getFuelCost() + getSurCharge()));
		return getFinalCost();
	}

}
