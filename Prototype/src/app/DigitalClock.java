package app;

import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer, Cloneable{
	
private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		this.timer = ct;
		timer.attach(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(timer == arg0) {
			draw();
	}

}

	private void draw() {
	
		String time = "";
		GregorianCalendar cal = new GregorianCalendar();   
		int h = cal.get(GregorianCalendar.HOUR_OF_DAY);   
		int m = cal.get(GregorianCalendar.MINUTE);   
		int s = cal.get(GregorianCalendar.SECOND);   
		time += ((h < 10) ? "0" : "") + h + ":";
		time += ((m < 10) ? "0" : "") + m + ":";
		time += ((s < 10) ? "0" : "") + s;
		
		System.out.println(time);
	}
	
	@Override
	public DigitalClock clone() {
		
		DigitalClock digital = null;
		
		try {
			digital = (DigitalClock)super.clone();
		}
		catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		digital.timer = this.timer.clone();
		digital.timer.attach(digital);
		return digital;
	}

}
