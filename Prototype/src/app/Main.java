package app;

public class Main {
	
public static void main(String[] args) {  
		
		ClockTimer timer = new ClockTimer();
		DigitalClock digital = new DigitalClock(timer);
		
		DigitalClock digitalclone = digital.clone();
		
		}

}
