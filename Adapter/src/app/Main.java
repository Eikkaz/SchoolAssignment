package app;

public class Main {
	
	static void rechargeUsbcPhone(UsbC phone) {
		phone.useUsb_C();
		phone.recharge();
	}
	static void rechargeLightningPhone(Lightning phone) {
		phone.useLightning();
		phone.recharge();
	}


	public static void main(String[] args) {
		Samsung samsung = new Samsung();
		Iphone iphone = new Iphone();
		
		rechargeUsbcPhone(samsung);
		rechargeLightningPhone(iphone);
		rechargeLightningPhone(new SwapAdapter(samsung));

	}

}
