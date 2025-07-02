package clock;

public non-sealed class BRLClock extends Clock {

	
	@Override
	public
	Clock convert(Clock clock) {
		this.second = clock.getSecond();
		this.minute = clock.getMinute();
		switch(clock) {
		case USclock usclock  ->this.hour =(usclock.getPeriodIndcator().equals("PM") ) ? usclock.getHour() + 12 : usclock.getHour(); 
			
		case BRLClock brlclock -> this.hour = brlclock.getHour();	
		}
		return this;
	}
	

}
