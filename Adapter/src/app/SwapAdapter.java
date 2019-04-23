package app;

public class SwapAdapter implements Lightning {
	
	private final Samsung samsung;
	
	public SwapAdapter (Samsung samsung) {
		this.samsung = samsung;
	}

	@Override
	public void recharge() {
		samsung.recharge();

	}

	@Override
	public void useLightning() {
		System.out.println("\nLightning adapter connected");
		samsung.useUsb_C();

	}

}
