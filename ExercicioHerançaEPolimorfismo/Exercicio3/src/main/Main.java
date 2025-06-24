package main;
import clock.*;
public class Main {
	public static void  main(String [] args) {
			Clock brclock =  new  BRLClock();
			brclock.setSecond(0);
			brclock.setMinute(0);
			brclock.setHour(25);
			Clock usclock = new USclock();
			usclock.setSecond(12);
			usclock.setMinute(5);
			usclock.setHour(24);
			
			System.out.println(brclock.getTime());
			
			System.out.println(new USclock().convert(brclock).getTime());
			System.out.println(usclock.getTime());
	}
}
