package app;

public class Main {
	
	public static void main(String[] args) {
		
		Arvuuttaja riddler = new Arvuuttaja();
		Object o = riddler.liittyyPeliin();
		for (int i = 0; i < 15; i++) {
			riddler.arvaus(i, o);
		}
	}

}
