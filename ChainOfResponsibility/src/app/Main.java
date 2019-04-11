package app;

public class Main {

	public static void main(String[] args) {

		Manager manager = new Manager();
		Director director = new Director();
		CEO ceo = new CEO();
		
		manager.setSuccessor(director);
		director.setSuccessor(ceo);
		
		manager.processRaise(new RaiseRequest(0.01));
		manager.processRaise(new RaiseRequest(0.03));
		manager.processRaise(new RaiseRequest(0.05));

	}

}
