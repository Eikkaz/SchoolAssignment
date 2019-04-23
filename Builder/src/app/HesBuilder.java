package app;

public class HesBuilder implements Burger_if {
	
	private StringBuilder hese;

	@Override
	public void createNewBurger() {
		hese = new StringBuilder();

	}

	@Override
	public void getBread() {
		hese.append(new Bread("Full Grain ").toString());

	}

	@Override
	public void getCheese() {
		hese.append(new Cheese("Monterey ").toString());

	}

	@Override
	public void getVegetables() {
		hese.append(new Vegetables("Tomato ").toString());

	}

	@Override
	public void getHamburgerPatty() {
		hese.append(new HamburgerPatty("Seitan ").toString());

	}
	
	public StringBuilder getBurger() {
		return hese;
		
	}

}
