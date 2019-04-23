package app;

public class Main {

	public static void main(String[] args) {
		BurgerBuilder worker = new BurgerBuilder(new McBuilder());
		worker.makeBurger();
		System.out.println(worker.getBurger());
		
		worker.setBuilder(new HesBuilder());
		worker.makeBurger();
		System.out.println(worker.getBurger());

	}

}
