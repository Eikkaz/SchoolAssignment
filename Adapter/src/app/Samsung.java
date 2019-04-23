package app;

public class Samsung implements UsbC {
	
	private boolean connector;

	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Samsung is Charging");
		}
		else {
			System.out.println("You need the USB-C connector");
		}

	}

	@Override
	public void useUsb_C() {
		connector = true;
		System.out.println("\nSamsung Connected");

	}
	
	

}
