package app;

import java.io.IOException;

public class ClientMain {

	public static void main(String[] args) throws IOException {
		ComputerFacade facade = new ComputerFacade();
		facade.start();

	}

}
