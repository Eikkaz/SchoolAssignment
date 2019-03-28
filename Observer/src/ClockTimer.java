
import java.util.ArrayList;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ClockTimer extends Observable{

	private int hour, min, sec;
	private List<Observer> obs;
	
	public ClockTimer() {
		this.obs = new ArrayList<>();
		this.startClock();
	}
	
	private void startClock() {
		new Thread(()->{
			while(true) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				tick();
			}
			}).start();
	}
	
	
	
	private void tick() {
		updateClock();
		for(Observer o : obs) {
			o.update(this, null);
		}
	}

	private void updateClock() {
		
		sec++;
		if(sec>59) {
			min++;
			sec=0;
		}
		if(min>59) {
			hour++;
			min=0;
		}
		if(hour>23) {
			hour=0;
			min=0;
			sec=0;
		}
	}

	public void attach(Observer o) {
		this.obs.add(o);
	}
	
	public void detach(Observer o) {
		this.obs.remove(o);
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int getSec() {
		return sec;
	}

	

}

