package clock;

public sealed abstract class Clock permits BRLClock, USclock {
	protected int hour;
	
	protected int minute;
	
	protected int second;

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		if(hour >24) {
			this.hour = 24;
			
		}else {
			this.hour = hour;	
		}
		
	
	}
	
	public void setMinute(int minute) {
		if(this.minute >= 60) {
			this.minute = 60;
			return;
		}
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		if(this.second >= 60) {
			this.second = 60;
			return;
		}
		this.second = second;
	}
	
	public String format(int value) {
		if(value <9) { 
		return value + String.valueOf(value);
		}
		return String.valueOf(value);
	}
	public String getTime() {
		return format(hour) + ":" + format(minute) + ":" + format(second);
	}
	
 public abstract Clock convert(Clock clock); 
	
}
