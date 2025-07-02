package clock;

public non-sealed class USclock extends Clock {

	private String periodIndcator;
	
	public void setAfterMidday() {
		this.periodIndcator ="PM";
	}
	public void setBeforeMidday() {
		this.periodIndcator ="AM";
	}
	
	public String getPeriodIndcator() {
		return periodIndcator;
	}
	

	public void setHour(int hour) {
		setBeforeMidday();
		if ((hour >=12) && (hour <=23)) {
			periodIndcator = "PM";
			this.hour = hour -12;
		}
		else if (hour >= 24) {
			this.hour = 0;
			periodIndcator = "AM";
		}
		else {
			this.hour = hour;
		}
	}
	
	
	public Clock convert(Clock clock) {
		this.second = clock.getSecond();
		this.minute = clock.getMinute();
		switch(clock) {
		case USclock usclock  ->{ 
			this.hour = usclock.getHour();  
			this.periodIndcator = usclock.getPeriodIndcator();
			
		}
		case BRLClock brlclock -> this.setHour(brlclock.getHour());	
		}
		return this;
	}
	
	public String getTime() {
		return super.getTime() + " " + this.periodIndcator;
	}

}
