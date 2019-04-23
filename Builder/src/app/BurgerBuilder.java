package app;

public class BurgerBuilder {
	
	private Burger_if builder;
	
	public BurgerBuilder(Burger_if builder) {
		this.builder = builder;
	}
	
	public void makeBurger() {
		builder.createNewBurger();
		builder.getBread();
		builder.getCheese();
		builder.getHamburgerPatty();
		builder.getVegetables();
	}
	
	public Object getBurger() {
		return builder.getBurger();
	}

	public void setBuilder(Burger_if builder) {
		this.builder = builder;
	}
	
	

}
