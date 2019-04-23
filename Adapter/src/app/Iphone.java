package app;

public class Iphone implements Lightning {
	
	private boolean connector;

	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Iphone is Charging");
		}
		else {
			System.out.println("You need the Lightning connector");
		}

	}

	@Override
	public void useLightning() {
		
		connector = true;
		System.out.println("\nIphone Connected");

	}
	
	
}
