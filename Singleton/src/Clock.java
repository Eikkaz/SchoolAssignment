import java.time.LocalTime;

public enum Clock {
	INSTANCE;
	
	private Clock() {
		
	}
	
	public void execute() {
		System.out.println(LocalTime.now());
	}
	
	public static synchronized Clock getInstance() {
		
		return INSTANCE;
	}

}
